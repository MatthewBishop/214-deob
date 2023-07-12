public final class FloorDecoration {

	

	int z;

	

	int x;

	

	int y;

	public Renderable renderable;

	

	public long tag;

	

	int flags;

	FloorDecoration() {
	}

	public static final void method4357(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				Skeleton.method4505(var0 - 1L);
				Skeleton.method4505(1L);
			} else {
				Skeleton.method4505(var0);
			}

		}
	}

	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON,
				Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeInt(var0);
		var2.packetBuffer.writeShortAdd(var1);
		Client.packetWriter.addNode(var2);
	}
}
