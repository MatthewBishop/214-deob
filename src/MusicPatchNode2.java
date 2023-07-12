public class MusicPatchNode2 {

	static String field3380;

	byte[] field3374;

	byte[] field3381;

	
	int field3373;

	
	int field3375;

	
	int field3376;

	
	int field3379;

	
	int field3378;

	
	int field3372;

	
	int field3377;

	MusicPatchNode2() {
	}

	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class382.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char) var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
