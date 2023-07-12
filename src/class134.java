public class class134 {

	static IndexedSprite[] worldSelectFlagSprites;

	
	static int field1570;

	static Widget[] field1575;

	public static int method3040(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int) (var2 >>> 14 & 3L);
		return var1;
	}

	static final void method3041(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class10.clientPreferences.method2449(var0);
	}
}
