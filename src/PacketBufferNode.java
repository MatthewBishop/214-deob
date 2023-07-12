public class PacketBufferNode extends Node {

	static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];

	

	static int PacketBufferNode_packetBufferNodeCount = 0;

	ClientPacket clientPacket;

	

	int clientPacketLength;

	public PacketBuffer packetBuffer;

	

	public int index;

	PacketBufferNode() {
	}

	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	static int method5673(int var0, int var1) {
		long var2 = (long) ((var0 << 16) + var1);
		return ApproximateRouteStrategy.NetCache_currentResponse != null
				&& ApproximateRouteStrategy.NetCache_currentResponse.key == var2
						? ModeWhere.NetCache_responseArchiveBuffer.offset * 99
								/ (ModeWhere.NetCache_responseArchiveBuffer.array.length
										- ApproximateRouteStrategy.NetCache_currentResponse.padding)
								+ 1
						: 0;
	}

	static final void method5665() {
		Client.field707 = Client.cycleCntr;
	}
}
