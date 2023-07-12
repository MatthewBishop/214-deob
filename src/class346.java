public class class346 {

	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + Strings.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1
					+ ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + Strings.colorStartTag(16777215) + var1.substring(0, var1.length() - 4)
					+ "K" + " " + " (" + var1 + ")" + "</col>"
					: " " + Strings.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
