import java.applet.Applet;

public class class323 {

	
	static int field3524;

	public static void method5998(Applet var0, String var1) {
		class31.field162 = var0;
		if (var1 != null) {
			class31.field160 = var1;
		}

	}

	public static void method6002(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
