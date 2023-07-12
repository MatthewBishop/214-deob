public final class SceneTilePaint {

	static int[] regions;

	

	int swColor;

	

	int seColor;

	

	int neColor;

	

	int nwColor;

	

	int texture;

	boolean isFlat = true;

	

	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3678 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3669 == null) {
				var0.field3669 = new int[var0.field3678.length];
			}

			var0.field3669[var1] = Integer.MAX_VALUE;
		}
	}

	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
