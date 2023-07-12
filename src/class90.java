public enum class90 implements MouseWheel {

	field1091(0, -1),

	field1090(1, 2),

	field1096(2, 3),

	field1092(3, 4),

	field1093(4, 5),

	field1094(5, 6);

	
	final int field1095;

	
	final int field1089;

	class90(int var3, int var4) {
		this.field1095 = var3;
		this.field1089 = var4;
	}

	public int rsOrdinal() {
		return this.field1089;
	}

	public static void method2280() {
		DbTableType.DBTableType_cache.clear();
	}

	static class127 method2279(int var0) {
		class127 var1 = (class127) GameObject.findEnumerated(ObjectSound.method1875(), var0);
		if (var1 == null) {
			var1 = class127.field1494;
		}

		return var1;
	}
}
