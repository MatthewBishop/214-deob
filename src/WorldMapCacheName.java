import java.io.IOException;

public class WorldMapCacheName {

	public static final WorldMapCacheName field3049 = new WorldMapCacheName("details");

	public static final WorldMapCacheName field3044 = new WorldMapCacheName("compositemap");

	public static final WorldMapCacheName field3045 = new WorldMapCacheName("compositetexture");

	static final WorldMapCacheName field3046 = new WorldMapCacheName("area");

	public static final WorldMapCacheName field3047 = new WorldMapCacheName("labels");

	static int[] regionMapArchiveIds;

	public final String name;

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	public static byte[] method5532() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}
}
