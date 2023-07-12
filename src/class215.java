public class class215 {

	final int[][] field2390;

	final int[][] field2387;

	
	int field2391;

	
	int field2389;

	final int[] field2388;

	final int[] field2386;

	
	final int field2392;

	public class215(int var1, int var2) {
		this.field2390 = new int[var1][var2];
		this.field2387 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class128.method2970(var3 / 4);
		this.field2388 = new int[var4];
		this.field2386 = new int[var4];
		this.field2392 = var4 - 1;
	}

	void method4253() {
		for (int var1 = 0; var1 < this.field2390.length; ++var1) {
			for (int var2 = 0; var2 < this.field2390[var1].length; ++var2) {
				this.field2390[var1][var2] = 0;
				this.field2387[var1][var2] = 99999999;
			}
		}

	}

	void method4223(int var1, int var2) {
		this.field2391 = var1;
		this.field2389 = var2;
	}

	int method4243() {
		return this.field2391;
	}

	int method4251() {
		return this.field2389;
	}

	int method4230() {
		return this.field2390.length;
	}

	int method4227() {
		return this.field2390[0].length;
	}

	int[][] method4245() {
		return this.field2390;
	}

	int[][] method4229() {
		return this.field2387;
	}

	int[] method4225() {
		return this.field2388;
	}

	int[] method4221() {
		return this.field2386;
	}

	int method4232() {
		return this.field2392;
	}

	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer) ItemContainer.itemContainers.get((long) var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	public static int Entity_unpackID(long var0) {
		return (int) (var0 >>> 17 & 4294967295L);
	}

	public static long method4252(int var0) {
		if (var0 > 63) {
			throw new class387(
					"Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d",
					new Object[] { var0 });
		} else {
			return (long) Math.pow(2.0, (double) var0) - 1L;
		}
	}
}
