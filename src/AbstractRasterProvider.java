public abstract class AbstractRasterProvider {

	public int[] pixels;

	

	public int width;

	

	public int height;

	protected float[] field5095;

	protected AbstractRasterProvider() {
	}

	public abstract void drawFull(int var1, int var2);

	public abstract void draw(int var1, int var2, int var3, int var4);

	public final void apply() {
		Rasterizer2D.method9246(this.pixels, this.width, this.height, this.field5095);
	}

	public final void method9342(boolean var1) {
		this.field5095 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
