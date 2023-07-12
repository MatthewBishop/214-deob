public class LoginPacket implements class292 {

	public static final LoginPacket field3342 = new LoginPacket(14, 0);

	static final LoginPacket field3346 = new LoginPacket(15, 4);

	public static final LoginPacket field3343 = new LoginPacket(16, -2);

	public static final LoginPacket field3344 = new LoginPacket(18, -2);

	public static final LoginPacket field3345 = new LoginPacket(19, -2);

	static final LoginPacket field3347 = new LoginPacket(27, 0);

	static final LoginPacket[] LoginPacket_indexedValues = new LoginPacket[32];

	

	public final int id;

	static {
		LoginPacket[] var0 = Decimator.method1086();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	public static void method5679(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		if (var1.isValidFileName(var2, var3)) {
			int var6 = var1.getGroupId(var2);
			int var7 = var1.getFileId(var6, var3);
			class304.musicPlayerStatus = 1;
			UserComparator9.musicTrackArchive = var1;
			VarbitComposition.musicTrackGroupId = var6;
			class304.musicTrackFileId = var7;
			class304.musicTrackVolume = var4;
			class132.musicTrackBoolean = var5;
			class157.pcmSampleLength = var0;
		}

	}

	static int method5680(int var0) {
		Message var1 = (Message) Messages.Messages_hashTable.get((long) var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) var1.nextDual).count;
		}
	}
}
