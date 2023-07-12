public abstract class class280 implements class282 {

	
	protected int field3065;

	protected class280(StudioGame var1, Language var2, int var3) {
		this.field3065 = var3;
	}

	static GameBuild[] method5602() {
		return new GameBuild[] { GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.LIVE };
	}

	public static int method5603(int var0) {
		return (var0 & class496.field5002) - 1;
	}

	static void method5601(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int) var1);
	}
}
