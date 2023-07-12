public final class class386 {

	static final char[] base37Table = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9' };

	static long[] field4401 = new long[12];

	static {
		for (int var0 = 0; var0 < field4401.length; ++var0) {
			field4401[var0] = (long) Math.pow(37.0, (double) var0);
		}

	}

	public static void method7207(AbstractArchive var0) {
		DbTableType.field4983 = var0;
	}
}
