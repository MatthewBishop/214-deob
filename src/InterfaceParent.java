public class InterfaceParent extends Node {

	

	int group;

	

	int type;

	boolean field1057 = false;

	InterfaceParent() {
	}

	static int method2244(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	static void method2243() {
		if (ScriptFrame.worldMap != null) {
			ScriptFrame.worldMap.method8401(Clock.Client_plane, class213.baseX * 64 + (Projectile.localPlayer.x >> 7),
					class101.baseY * 64 + (Projectile.localPlayer.y >> 7), false);
			ScriptFrame.worldMap.loadCache();
		}

	}
}
