public class class33 {

	static Archive archive12;

	static SpritePixels sceneMinimapSprite;

	
	int field167;

	
	int field171;

	class33(int var1, int var2) {
		this.field167 = var1;
		this.field171 = var2;
	}

	boolean method457(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch (this.field167) {
			case 1:
				return var1.vmethod4127(this.field171);
			case 2:
				return var1.vmethod4128(this.field171);
			case 3:
				return var1.vmethod4145((char) this.field171);
			case 4:
				return var1.vmethod4131(this.field171 == 1);
			default:
				return false;
			}
		}
	}

	public static void method460() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
