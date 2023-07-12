public class class157 extends class142 {

	

	public static int pcmSampleLength;

	static SpritePixels[] headIconPrayerSprites;

	
	long field1733;

	String field1730;

	
	int field1729;
	// $FF: synthetic field

	final class145 this$0;

	class157(class145 var1) {
		this.this$0 = var1;
		this.field1733 = -1L;
		this.field1730 = null;
		this.field1729 = 0;
	}

	void vmethod3381(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1733 = var1.readLong();
		}

		this.field1730 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1729 = var1.readUnsignedShort();
	}

	void vmethod3382(ClanSettings var1) {
		var1.method3207(this.field1733, this.field1730, this.field1729);
	}

	public static int method3299(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	static void method3300(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = class101.method2635(var4);
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
			int var8 = var1 - 334;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 100) {
				var8 = 100;
			}

			int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
			int var7 = var5 * var9 / 256;
			var2[var3] = var6 * var7 >> 16;
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
	}
}
