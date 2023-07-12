public enum class216 implements MouseWheel {

	field2397((byte) -1),

	field2394((byte) 0),

	field2395((byte) 1),

	field2396((byte) 2);

	public byte field2393;

	class216(byte var3) {
		this.field2393 = var3;
	}

	public int rsOrdinal() {
		return this.field2393;
	}

	static final boolean method4261(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class209.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class481.field4937;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class481.field4935;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}
