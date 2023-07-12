public class Animation {

	static int[] field2490 = new int[500];

	static int[] field2482 = new int[500];

	static int[] field2483 = new int[500];

	static int[] field2484 = new int[500];

	Skeleton skeleton = null;

	int transformCount = -1;

	int[] transformSkeletonLabels;

	int[] transformXs;

	int[] transformYs;

	int[] transformZs;

	boolean hasAlphaTransform = false;

	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = var5 + var3.offset;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field2490[var7] = var10;
							field2482[var7] = 0;
							field2483[var7] = 0;
							field2484[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2490[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2482[var7] = var4.readShortSmart();
				} else {
					field2482[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2483[var7] = var4.readShortSmart();
				} else {
					field2483[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2484[var7] = var4.readShortSmart();
				} else {
					field2484[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field2490[var8];
				this.transformXs[var8] = field2482[var8];
				this.transformYs[var8] = field2483[var8];
				this.transformZs[var8] = field2484[var8];
			}

		}
	}
}
