public class class465 extends class467 {

	
	int field4805 = 0;

	
	int field4804 = 0;

	
	int field4806 = 0;

	
	int field4809 = 0;

	
	int field4808 = 0;

	
	int field4807 = 0;

	public class465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field4805 = var1;
		this.field4804 = var2;
		this.field4806 = var3;
		this.field4809 = var4;
		this.field4808 = var5;
		this.field4807 = var6;
	}

	public int vmethod8351() {
		double var1 = this.method8361();
		return (int) Math.round(var1 * (double) (this.field4809 - this.field4805) + (double) this.field4805);
	}

	public int vmethod8348() {
		double var1 = this.method8361();
		return (int) Math.round(var1 * (double) (this.field4808 - this.field4804) + (double) this.field4804);
	}

	public int vmethod8347() {
		double var1 = this.method8361();
		return (int) Math.round((double) this.field4806 + (double) (this.field4807 - this.field4806) * var1);
	}
}
