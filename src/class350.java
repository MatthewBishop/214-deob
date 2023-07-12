import netscape.javascript.JSObject;

public enum class350 implements MouseWheel {

	field4190(-1),

	field4195(0),

	field4192(1),

	field4193(2);

	static Archive archive18;

	
	final int field4191;

	class350(int var3) {
		this.field4191 = var3;
	}

	public int rsOrdinal() {
		return this.field4191;
	}

	public static class211 method6624() {
		return Client.field739;
	}

	static void method6623(String var0) {
		class443.field4710 = var0;

		try {
			String var1 = class347.client.getParameter(Integer.toString(18));
			String var2 = class347.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + HorizontalAlignment.method3685(BoundaryObject.method5027() + 94608000000L)
						+ "; Max-Age=" + 94608000L;
			}

			Client var4 = class347.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}

	}
}
