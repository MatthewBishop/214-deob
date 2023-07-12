public class class8 {

	final int field27;

	final int field28;

	final String field29;

	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field27 = var1;
		this.field28 = var2;
		this.field29 = var3;
	}

	String method55() {
		return Integer.toHexString(this.field27) + Integer.toHexString(this.field28) + this.field29;
	}

	int method61() {
		return this.field28;
	}
}
