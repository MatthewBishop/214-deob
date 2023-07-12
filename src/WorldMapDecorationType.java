public enum WorldMapDecorationType implements MouseWheel {

	field3801(0, 0),

	field3791(1, 0),

	field3785(2, 0),

	field3786(3, 0),

	field3799(9, 2),

	field3783(4, 1),

	field3789(5, 1),

	field3790(6, 1),

	field3805(7, 1),

	field3792(8, 1),

	field3793(12, 2),

	field3794(13, 2),

	field3795(14, 2),

	field3796(15, 2),

	field3797(16, 2),

	field3798(17, 2),

	field3802(18, 2),

	field3800(19, 2),

	field3784(20, 2),

	field3807(21, 2),

	field3803(10, 2),

	field3809(11, 2),

	field3804(22, 3);

	static String field3787;

	static String field3788;

	

	public final int id;

	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	public int rsOrdinal() {
		return this.id;
	}

	static class89[] method6590() {
		return new class89[] { class89.field1084, class89.field1083, class89.field1081, class89.field1082,
				class89.field1085 };
	}

	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field776;
		} else if (var5 >= 100) {
			var6 = Client.field620;
		} else {
			var6 = (Client.field620 - Client.field776) * var5 / 100 + Client.field776;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field591) {
			var10 = Client.field591;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field781) {
				var6 = Client.field781;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field783) {
			var10 = Client.field783;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field780) {
				var6 = Client.field780;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class157.method3300(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
