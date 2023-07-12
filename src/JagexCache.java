import java.io.File;

public class JagexCache {

	static File JagexCache_locationFile;

	

	public static int idxCount;

	public static BufferedFile JagexCache_randomDat = null;

	public static BufferedFile JagexCache_dat2File = null;

	public static BufferedFile JagexCache_idx255File = null;

	static byte[][][] ByteArrayPool_arrays;

	public static String method3497(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	public static boolean method3499(int var0) {
		return (var0 & 1) != 0;
	}

	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	static final int method3498(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3639 == null) {
			throw new RuntimeException();
		} else {
			var0.field3639[var1] = var2;
			var0.field3681[var1] = var3;
		}
	}
}
