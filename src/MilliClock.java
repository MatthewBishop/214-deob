public class MilliClock extends Clock {

	long[] field1860 = new long[10];

	
	int field1861 = 256;

	
	int field1859 = 1;

	
	long field1858 = BoundaryObject.method5027();

	
	int field1857 = 0;

	
	int field1862;

	public MilliClock() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1860[var1] = this.field1858;
		}

	}

	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1860[var1] = 0L;
		}

	}

	public int wait(int var1, int var2) {
		int var3 = this.field1861;
		int var4 = this.field1859;
		this.field1861 = 300;
		this.field1859 = 1;
		this.field1858 = BoundaryObject.method5027();
		if (this.field1860[this.field1862] == 0L) {
			this.field1861 = var3;
			this.field1859 = var4;
		} else if (this.field1858 > this.field1860[this.field1862]) {
			this.field1861 = (int) ((long) (var1 * 2560) / (this.field1858 - this.field1860[this.field1862]));
		}

		if (this.field1861 < 25) {
			this.field1861 = 25;
		}

		if (this.field1861 > 256) {
			this.field1861 = 256;
			this.field1859 = (int) ((long) var1 - (this.field1858 - this.field1860[this.field1862]) / 10L);
		}

		if (this.field1859 > var1) {
			this.field1859 = var1;
		}

		this.field1860[this.field1862] = this.field1858;
		this.field1862 = (this.field1862 + 1) % 10;
		int var5;
		if (this.field1859 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1860[var5]) {
					this.field1860[var5] += (long) this.field1859;
				}
			}
		}

		if (this.field1859 < var2) {
			this.field1859 = var2;
		}

		FloorDecoration.method4357((long) this.field1859);

		for (var5 = 0; this.field1857 < 256; this.field1857 += this.field1861) {
			++var5;
		}

		this.field1857 &= 255;
		return var5;
	}

	static int method3527(int var0) {
		return class28.KeyHandler_keyCodes[var0];
	}

	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException) var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	static final void method3526(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class305.Tiles_underlays2[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}
}
