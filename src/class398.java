public class class398 {

	
	int field4474;

	
	int field4471;

	
	int field4473;

	
	int field4472;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4474).length();
		int var3 = 10 - Integer.toString(this.field4473).length();
		int var4 = 10 - Integer.toString(this.field4471).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4474 + var5 + "Created: " + this.field4471 + var7 + "Total used: "
				+ this.field4473 + var6 + "Max-In-Use: " + this.field4472;
	}

	public static int method7591(int var0, int var1) {
		return (int) (Math.atan2((double) var0, (double) var1) * 325.94932345220167) & 2047;
	}
}
