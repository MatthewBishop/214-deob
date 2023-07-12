public enum FillMode implements MouseWheel {

	SOLID(0, 0),

	field5099(1, 1),

	field5100(2, 2);

	static String field5098;

	
	public final int field5101;

	
	final int field5103;

	FillMode(int var3, int var4) {
		this.field5101 = var3;
		this.field5103 = var4;
	}

	public int rsOrdinal() {
		return this.field5103;
	}
}
