import java.io.IOException;

public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	abstract byte[] get();

	abstract void set(byte[] var1);

	public static void method6553(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) {
			try {
				NetCache.NetCache_socket.close();
			} catch (Exception var8) {
			}

			NetCache.NetCache_socket = null;
		}

		NetCache.NetCache_socket = var0;
		Buffer var2;
		if (NetCache.NetCache_socket != null) {
			try {
				var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				NetCache.NetCache_socket.write(var2.array, 0, 4);
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var6) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0;
		ApproximateRouteStrategy.NetCache_currentResponse = null;
		ModeWhere.NetCache_responseArchiveBuffer = null;
		NetCache.field4278 = 0;

		while (true) {
			NetFileRequest var9 = (NetFileRequest) NetCache.NetCache_pendingPriorityResponses.first();
			if (var9 == null) {
				while (true) {
					var9 = (NetFileRequest) NetCache.NetCache_pendingResponses.first();
					if (var9 == null) {
						if (NetCache.field4282 != 0) {
							try {
								var2 = new Buffer(4);
								var2.writeByte(4);
								var2.writeByte(NetCache.field4282);
								var2.writeShort(0);
								NetCache.NetCache_socket.write(var2.array, 0, 4);
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var4) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_loadTime = 0;
						class19.field100 = BoundaryObject.method5027();
						return;
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9);
					NetCache.NetCache_pendingWrites.put(var9, var9.key);
					++NetCache.NetCache_pendingWritesCount;
					--NetCache.NetCache_pendingResponsesCount;
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key);
			++NetCache.NetCache_pendingPriorityWritesCount;
			--NetCache.NetCache_pendingPriorityResponsesCount;
		}
	}
}
