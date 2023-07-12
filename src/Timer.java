public class Timer {

	
	long field4506 = -1L;

	
	long field4504 = -1L;

	public boolean field4499 = false;

	
	long field4500 = 0L;

	
	long field4501 = 0L;

	
	long field4502 = 0L;

	
	int field4497 = 0;

	
	int field4507 = 0;

	
	int field4505 = 0;

	
	int field4498 = 0;

	public void method7612() {
		this.field4506 = BoundaryObject.method5027();
	}

	public void method7608() {
		if (-1L != this.field4506) {
			this.field4501 = BoundaryObject.method5027() - this.field4506;
			this.field4506 = -1L;
		}

	}

	public void method7609(int var1) {
		this.field4504 = BoundaryObject.method5027();
		this.field4497 = var1;
	}

	public void method7610() {
		if (this.field4504 != -1L) {
			this.field4500 = BoundaryObject.method5027() - this.field4504;
			this.field4504 = -1L;
		}

		++this.field4505;
		this.field4499 = true;
	}

	public void method7617() {
		this.field4499 = false;
		this.field4507 = 0;
	}

	public void method7625() {
		this.method7610();
	}

	public void write(Buffer var1) {
		class280.method5601(var1, this.field4501);
		class280.method5601(var1, this.field4500);
		class280.method5601(var1, this.field4502);
		var1.writeShort(this.field4497);
		var1.writeShort(this.field4507);
		var1.writeShort(this.field4505);
		var1.writeShort(this.field4498);
	}
}
