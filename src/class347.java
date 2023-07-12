public class class347 {

	protected static boolean PcmPlayer_stereo;

	static Client client;

	public static String method6610(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.'
					&& var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = WorldMapArea.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char) (var6 + 55));
					} else {
						var2.append((char) (var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char) (var6 + 55));
					} else {
						var2.append((char) (var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	static void method6613(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
