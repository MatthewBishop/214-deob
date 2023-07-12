public class Clips {

	boolean field2798 = false;

	public boolean field2805 = true;

	int field2793 = 0;

	public int field2796 = 512;

	public TextureLoader Rasterizer3D_textureLoader;

	int field2803;

	int field2804;

	int field2800;

	int field2806;

	int clipNegativeMidX;

	int field2808;

	int clipNegativeMidY;

	int field2810;

	int[] Rasterizer3D_rowOffsets = new int[1024];

	Clips() {
	}

	void method4956() {
		this.field2803 = this.field2800 / 2;
		this.field2804 = this.field2806 / 2;
		this.clipNegativeMidX = -this.field2803;
		this.field2808 = this.field2800 - this.field2803;
		this.clipNegativeMidY = -this.field2804;
		this.field2810 = this.field2806 - this.field2804;
	}

	void method4957(int var1, int var2, int var3, int var4) {
		this.field2803 = var1 - var2;
		this.field2804 = var3 - var4;
		this.clipNegativeMidX = -this.field2803;
		this.field2808 = this.field2800 - this.field2803;
		this.clipNegativeMidY = -this.field2804;
		this.field2810 = this.field2806 - this.field2804;
	}

	void method4955(int var1, int var2, int var3) {
		this.field2798 = var1 < 0 || var1 > this.field2800 || var2 < 0 || var2 > this.field2800 || var3 < 0
				|| var3 > this.field2800;
	}
}
