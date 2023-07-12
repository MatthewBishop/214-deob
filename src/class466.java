public class class466 extends class468 {

	static Archive field4812;

	
	int field4811 = 0;

	
	int field4810 = 0;

	public class466(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4811 = var1;
		this.field4810 = var2;
	}

	public int method8343() {
		double var1 = this.method8361();
		return (int) Math.round(var1 * (double) (this.field4810 - this.field4811) + (double) this.field4811);
	}
}
