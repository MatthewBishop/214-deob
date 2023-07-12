public enum class441 implements MouseWheel {

	field4706(1, 1),

	field4702(3, 2),

	field4704(2, 3),

	field4705(0, 10);

	
	final int field4703;

	
	final int field4707;

	class441(int var3, int var4) {
		this.field4703 = var3;
		this.field4707 = var4;
	}

	public int rsOrdinal() {
		return this.field4707;
	}

	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field3128,
				Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
