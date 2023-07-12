public class class129 {

	boolean field1516;

	boolean field1505;

	class127 field1506;

	class127 field1507;

	class124[] field1510;

	boolean field1508;

	float field1519;

	float field1511;

	float field1522;

	float field1504;

	float field1514;

	float field1515;

	float field1509;

	float field1512;

	float field1518;

	float field1527;

	boolean field1520 = true;

	
	int field1521 = 0;

	float[] field1517;

	
	int field1523;

	
	int field1524;

	float field1525;

	float field1526;

	class129() {
	}

	int method2976(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		UserComparator5.method2865(var1.readUnsignedByte());
		this.field1506 = class90.method2279(var1.readUnsignedByte());
		this.field1507 = class90.method2279(var1.readUnsignedByte());
		this.field1516 = var1.readUnsignedByte() != 0;
		this.field1510 = new class124[var3];
		class124 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class124 var6 = new class124();
			var6.method2901(var1, var2);
			this.field1510[var5] = var6;
			if (var4 != null) {
				var4.field1460 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	void method2986() {
		this.field1523 = this.field1510[0].field1457;
		this.field1524 = this.field1510[this.method2981() - 1].field1457;
		this.field1517 = new float[this.method2985() + 1];

		for (int var1 = this.method2974(); var1 <= this.method3000(); ++var1) {
			this.field1517[var1 - this.method2974()] = class130.method3002(this, (float) var1);
		}

		this.field1510 = null;
		this.field1525 = class130.method3002(this, (float) (this.method2974() - 1));
		this.field1526 = class130.method3002(this, (float) (this.method3000() + 1));
	}

	public float method2975(int var1) {
		if (var1 < this.method2974()) {
			return this.field1525;
		} else {
			return var1 > this.method3000() ? this.field1526 : this.field1517[var1 - this.method2974()];
		}
	}

	int method2974() {
		return this.field1523;
	}

	int method3000() {
		return this.field1524;
	}

	int method2985() {
		return this.method3000() - this.method2974();
	}

	int method2979(float var1) {
		if (this.field1521 < 0 || !((float) this.field1510[this.field1521].field1457 <= var1)
				|| this.field1510[this.field1521].field1460 != null
						&& !((float) this.field1510[this.field1521].field1460.field1457 > var1)) {
			if (!(var1 < (float) this.method2974()) && !(var1 > (float) this.method3000())) {
				int var2 = this.method2981();
				int var3 = this.field1521;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float) this.field1510[var6].field1457) {
							if (var1 > (float) this.field1510[var6 - 1].field1457) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (!(var1 > (float) this.field1510[var6].field1457)) {
								var3 = var6;
								break;
							}

							if (var1 < (float) this.field1510[var6 + 1].field1457) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while (var4 <= var5);
				}

				if (var3 != this.field1521) {
					this.field1521 = var3;
					this.field1520 = true;
				}

				return this.field1521;
			} else {
				return -1;
			}
		} else {
			return this.field1521;
		}
	}

	class124 method2980(float var1) {
		int var2 = this.method2979(var1);
		return var2 >= 0 && var2 < this.field1510.length ? this.field1510[var2] : null;
	}

	int method2981() {
		return this.field1510 == null ? 0 : this.field1510.length;
	}

	static final void method3001(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method4407(var17, var18, var19);
			Rasterizer3D.method4390(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method4407(var17, var19, var20);
			Rasterizer3D.method4390(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
