public abstract class class468 {

	
	int field4815 = 0;

	
	int field4816 = 0;

	double field4817 = 0.0;

	
	int field4818 = 0;

	class468(int var1, int var2) {
		this.field4815 = var1;
		this.field4816 = 0;
		this.field4818 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4817 = World.method1801(this.field4816, this.field4815, this.field4818);
	}

	public void method8359() {
		if (this.field4816 < this.field4815) {
			++this.field4816;
			this.field4817 = World.method1801(this.field4816, this.field4815, this.field4818);
		}

	}

	double method8361() {
		return this.field4817;
	}
}
