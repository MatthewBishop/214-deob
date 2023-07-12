public class Friend extends Buddy {

	boolean field4589;

	boolean field4590;

	Friend() {
	}

	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4589 && !var1.field4589) {
			return -1;
		} else if (!this.field4589 && var1.field4589) {
			return 1;
		} else if (this.field4590 && !var1.field4590) {
			return -1;
		} else if (!this.field4590 && var1.field4590) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend) var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend) var1);
	}

	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1
					|| !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var4 * var8 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + Projectile.localPlayer.x >> 7;
					int var12 = Projectile.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3148,
							Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByteNeg(
							Client.field739.method4134(82) ? (Client.field739.method4134(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShort(class213.baseX * 64 + var11);
					var13.packetBuffer.writeShortAddLE(class101.baseY * 64 + var12);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(Projectile.localPlayer.x);
					var13.packetBuffer.writeShort(Projectile.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
