public class Bounds {

	

	public int lowX;

	

	public int lowY;

	

	public int highX;

	

	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	public boolean method8029(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	public void method8031(Bounds var1, Bounds var2) {
		this.method8032(var1, var2);
		this.method8033(var1, var2);
	}

	void method8032(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8037() > var1.method8037()) {
			var2.highX -= var2.method8037() - var1.method8037();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	void method8033(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8035() > var1.method8035()) {
			var2.highY -= var2.method8035() - var1.method8035();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	int method8037() {
		return this.lowX + this.highX;
	}

	int method8035() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition) NPCComposition.NpcDefinition_cached.get((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long) var0);
			return var1;
		}
	}

	public static Font method8030(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			UserComparator2.SpriteBuffer_decode(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3);
			Font var8;
			if (var6 == null) {
				var8 = null;
			} else {
				Font var7 = new Font(var6, class515.SpriteBuffer_xOffsets, class402.SpriteBuffer_yOffsets,
						class515.SpriteBuffer_spriteWidths, class515.SpriteBuffer_spriteHeights,
						class515.SpriteBuffer_spritePalette, class515.SpriteBuffer_pixels);
				TextureProvider.method4758();
				var8 = var7;
			}

			return var8;
		}
	}
}
