public class class226 {

	class126[] field2525;

	
	int field2526;

	class226(Buffer var1, int var2) {
		this.field2525 = new class126[var2];
		this.field2526 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2525.length; ++var3) {
			class126 var4 = new class126(this.field2526, var1, false);
			this.field2525[var3] = var4;
		}

		this.method4461();
	}

	void method4461() {
		class126[] var1 = this.field2525;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class126 var3 = var1[var2];
			if (var3.field1477 >= 0) {
				var3.field1470 = this.field2525[var3.field1477];
			}
		}

	}

	public int method4451() {
		return this.field2525.length;
	}

	class126 method4454(int var1) {
		return var1 >= this.method4451() ? null : this.field2525[var1];
	}

	class126[] method4455() {
		return this.field2525;
	}

	void method4456(class136 var1, int var2) {
		this.method4457(var1, var2, (boolean[]) null, false);
	}

	void method4457(class136 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3052();
		int var6 = 0;
		class126[] var7 = this.method4455();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class126 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3054(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	public static int method4468(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	public static int method4452(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}
}
