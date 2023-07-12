public class class394 {

	
	static int field4443;

	public char field4438;

	
	public int field4441 = 0;

	
	public int field4440 = 0;

	class394() {
	}

	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14)
				| ((long) var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}
}
