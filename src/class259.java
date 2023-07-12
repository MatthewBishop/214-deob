public class class259 implements WorldMapSection {

	public static Font ItemDefinition_fontPlain11;

	
	int field2939;

	
	int field2933;

	
	int field2934;

	
	int field2943;

	
	int field2936;

	
	int field2932;

	
	int field2938;

	
	int field2942;

	
	int field2940;

	
	int field2941;

	class259() {
	}

	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2936) {
			var1.regionLowX = this.field2936;
		}

		if (var1.regionHighX < this.field2936) {
			var1.regionHighX = this.field2936;
		}

		if (var1.regionLowY > this.field2932) {
			var1.regionLowY = this.field2932;
		}

		if (var1.regionHighY < this.field2932) {
			var1.regionHighY = this.field2932;
		}

	}

	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2939 && var1 < this.field2939 + this.field2933) {
			return var2 >= (this.field2934 << 6) + (this.field2938 << 3)
					&& var2 <= (this.field2934 << 6) + (this.field2938 << 3) + 7
					&& var3 >= (this.field2943 << 6) + (this.field2942 << 3)
					&& var3 <= (this.field2943 << 6) + (this.field2942 << 3) + 7;
		} else {
			return false;
		}
	}

	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2936 << 6) + (this.field2940 << 3)
				&& var1 <= (this.field2936 << 6) + (this.field2940 << 3) + 7
				&& var2 >= (this.field2932 << 6) + (this.field2941 << 3)
				&& var2 <= (this.field2932 << 6) + (this.field2941 << 3) + 7;
	}

	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[] {
					this.field2936 * 64 - this.field2934 * 64 + var2 + (this.field2940 * 8 - this.field2938 * 8),
					var3 + (this.field2932 * 64 - this.field2943 * 64) + (this.field2941 * 8 - this.field2942 * 8) };
			return var4;
		}
	}

	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2934 * 64 - this.field2936 * 64 + (this.field2938 * 8 - this.field2940 * 8) + var1;
			int var4 = this.field2943 * 64 - this.field2932 * 64 + var2 + (this.field2942 * 8 - this.field2941 * 8);
			return new Coord(this.field2939, var3, var4);
		}
	}

	public void read(Buffer var1) {
		this.field2939 = var1.readUnsignedByte();
		this.field2933 = var1.readUnsignedByte();
		this.field2934 = var1.readUnsignedShort();
		this.field2938 = var1.readUnsignedByte();
		this.field2943 = var1.readUnsignedShort();
		this.field2942 = var1.readUnsignedByte();
		this.field2936 = var1.readUnsignedShort();
		this.field2940 = var1.readUnsignedByte();
		this.field2932 = var1.readUnsignedShort();
		this.field2941 = var1.readUnsignedByte();
		this.method5362();
	}

	void method5362() {
	}
}
