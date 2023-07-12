public class class177 extends class180 {

	
	static int field1853;

	static IndexedSprite options_buttons_2Sprite;

	
	int field1854;
	// $FF: synthetic field

	final class169 this$0;

	class177(class169 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1854 = var3;
	}

	public int vmethod3531() {
		return 0;
	}

	public int vmethod3536() {
		return this.field1854;
	}

	public static GameBuild method3517(int var0) {
		GameBuild[] var1 = class280.method5602();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	static class131 method3518(int var0) {
		class131 var1 = (class131) GameObject.findEnumerated(Widget.method6508(), var0);
		if (var1 == null) {
			var1 = class131.field1554;
		}

		return var1;
	}
}
