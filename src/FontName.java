import java.io.File;
import java.io.IOException;

public class FontName {

	public static final FontName FontName_plain11 = new FontName("p11_full");

	public static final FontName FontName_plain12 = new FontName("p12_full");

	public static final FontName FontName_bold12 = new FontName("b12_full");

	public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");

	public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");

	public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");

	static Archive archive11;

	static GraphicsDefaults spriteIds;

	String name;

	FontName(String var1) {
		this.name = var1;
	}

	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class388.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class496.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class496.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class148.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	static void method8578(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 16384;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field843 = var3.int7 * 128;
		var5.field845 = var3.int5;
		var5.field836 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field848 = var5.field845 + (int) (Math.random() * (double) (var5.field836 - var5.field845));
		}

	}
}
