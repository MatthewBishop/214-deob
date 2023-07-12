public class class490 implements MouseWheel {

	public static final class490 field4973 = new class490(1, 0, Integer.class, new class487());

	public static final class490 field4972 = new class490(2, 1, Long.class, new class489());

	public static final class490 field4976 = new class490(0, 2, String.class, new class491());

	static Fonts WorldMapElement_fonts;

	
	public final int field4977;

	
	public final int field4975;

	public final Class field4974;

	final class486 field4971;

	class490(int var1, int var2, Class var3, class486 var4) {
		this.field4977 = var1;
		this.field4975 = var2;
		this.field4974 = var3;
		this.field4971 = var4;
	}

	public int rsOrdinal() {
		return this.field4975;
	}

	public Object method8758(Buffer var1) {
		return this.field4971.vmethod8773(var1);
	}

	public static class490[] method8761() {
		return new class490[] { field4976, field4973, field4972 };
	}

	public static void method8764() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	public static class486 method8756(Class var0) {
		class490[] var2 = method8761();
		int var3 = 0;

		class490 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null;
				break;
			}

			class490 var4 = var2[var3];
			if (var4.field4974 == var0) {
				var1 = var4;
				break;
			}

			++var3;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4971;
		}
	}

	static Widget method8768(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int) ((float) var1.width * var7[0]);
		var8.rawY = (int) (var7[1] * (float) var1.height);
		var8.rawWidth = (int) ((float) var1.width * var7[2]);
		var8.rawHeight = (int) (var7[3] * (float) var1.height);
		return var8;
	}

	static Object method8770(class490 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch (var0.field4977) {
			case 0:
				return Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	static void method8769() {
		PcmPlayer.field300 = System.getenv("JX_ACCESS_TOKEN");
		class4.field8 = System.getenv("JX_REFRESH_TOKEN");
		WorldMapDecorationType.field3788 = System.getenv("JX_SESSION_ID");
		Ignored.field4610 = System.getenv("JX_CHARACTER_ID");
		String var0 = System.getenv("JX_DISPLAY_NAME");
		Login.field939 = class1.method9(var0);
	}
}
