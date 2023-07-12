public class FloorUnderlayDefinition extends DualNode {

	static AbstractArchive FloorUnderlayDefinition_archive;

	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);

	

	int rgb = 0;

	

	public int hue;

	

	public int saturation;

	

	public int lightness;

	

	public int hueMultiplier;

	FloorUnderlayDefinition() {
	}

	void postDecode() {
		this.setHsl(this.rgb);
	}

	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	void setHsl(int var1) {
		double var2 = (double) (var1 >> 16 & 255) / 256.0;
		double var4 = (double) (var1 >> 8 & 255) / 256.0;
		double var6 = (double) (var1 & 255) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var10 != var8) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0;
			} else if (var6 == var10) {
				var12 = 4.0 + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0;
		this.saturation = (int) (256.0 * var14);
		this.lightness = (int) (var16 * 256.0);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5) {
			this.hueMultiplier = (int) (512.0 * var14 * (1.0 - var16));
		} else {
			this.hueMultiplier = (int) (var14 * var16 * 512.0);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int) ((double) this.hueMultiplier * var12);
	}

	static final void method3803() {
		Client.field709 = Client.cycleCntr;
		class155.field1722 = true;
	}
}
