public class LoginType {

	public static final LoginType oldscape = new LoginType(1, 0, "", "");

	static final LoginType field4925 = new LoginType(7, 1, "", "");

	static final LoginType field4926 = new LoginType(0, 2, "", "");

	static final LoginType field4927 = new LoginType(5, 3, "", "");

	static final LoginType field4929 = new LoginType(8, 4, "", "");

	static final LoginType field4928 = new LoginType(6, 5, "", "");

	static final LoginType field4930 = new LoginType(2, 6, "", "");

	static final LoginType field4931 = new LoginType(4, 7, "", "");

	public static final LoginType field4924;

	
	final int field4933;

	final String field4932;

	static {
		field4924 = new LoginType(3, -1, "", "", true,
				new LoginType[] { oldscape, field4925, field4926, field4929, field4927 });
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4933 = var1;
		this.field4932 = var4;
	}

	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4933 = var1;
		this.field4932 = var4;
	}

	public String toString() {
		return this.field4932;
	}
}
