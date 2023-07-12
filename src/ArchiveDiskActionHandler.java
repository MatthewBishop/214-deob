public class ArchiveDiskActionHandler implements Runnable {

	public static NodeDeque ArchiveDiskActionHandler_requestQueue = new NodeDeque();

	public static NodeDeque ArchiveDiskActionHandler_responseQueue = new NodeDeque();

	
	static int field4224 = 0;

	static Object ArchiveDiskActionHandler_lock = new Object();

	static Thread ArchiveDiskActionHandler_thread;

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized (ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction) ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int) var1.key, var1.data, var1.data.length);
						synchronized (ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int) var1.key);
						synchronized (ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized (ArchiveDiskActionHandler_lock) {
						if (field4224 <= 1) {
							field4224 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field4224 = 600;
					}
				} else {
					FloorDecoration.method4357(100L);
					synchronized (ArchiveDiskActionHandler_lock) {
						if (field4224 <= 1) {
							field4224 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field4224;
					}
				}
			}
		} catch (Exception var13) {
			class260.RunException_sendStackTrace((String) null, var13);
		}
	}
}
