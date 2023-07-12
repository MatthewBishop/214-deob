public class class406 {

	static final class406 field4536 = new class406("Basic");

	static final class406 field4535 = new class406("Bearer");

	static FriendsChat friendsChat;

	final String field4538;

	class406(String var1) {
		this.field4538 = var1;
	}

	String method7635() {
		return this.field4538;
	}

	public static String method7636(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && Decimator.method1091(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && Decimator.method1091(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= WorldMapScaleHandler.method5584(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (class216.method4261(var7)) {
						char var8 = class7.method52(var7);
						if (var8 != 0) {
							var5.append(var8);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}
}
