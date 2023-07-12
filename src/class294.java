public class class294 {

	public static final class294 field3206 = new class294(4);

	public static final class294 field3199 = new class294(11);

	public static final class294 field3207 = new class294(5);

	public static final class294 field3201 = new class294(14);

	public static final class294 field3198 = new class294(16);

	public static final class294 field3203 = new class294(4);

	public static final class294 field3202 = new class294(2);

	public static final class294 field3205 = new class294(5);

	public static final class294 field3208 = new class294(7);

	public static final class294 field3204 = new class294(14);

	public static final class294 field3200 = new class294(6);

	class294(int var1) {
	}

	public static void method5664(int var0) {
		if (var0 != -1) {
			if (class143.Widget_loadedInterfaces[var0]) {
				Widget.Widget_archive.clearFilesGroup(var0);
				if (class16.Widget_interfaceComponents[var0] != null) {
					for (int var1 = 0; var1 < class16.Widget_interfaceComponents[var0].length; ++var1) {
						if (class16.Widget_interfaceComponents[var0][var1] != null) {
							class16.Widget_interfaceComponents[var0][var1] = null;
						}
					}

					class16.Widget_interfaceComponents[var0] = null;
					class143.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
