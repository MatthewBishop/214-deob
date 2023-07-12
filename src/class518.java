public class class518 {

	
	int field5149;

	
	int field5144;

	
	int field5142;

	
	int field5143;

	
	int field5150;

	
	int field5145;

	
	int field5146 = 0;

	
	int field5152 = 0;

	boolean field5148;

	
	int field5140;

	
	int field5147;

	
	int field5151;

	
	int field5141;

	public void method9539(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			boolean var9) {
		this.field5149 = var1;
		this.field5144 = var2;
		this.field5142 = var3;
		this.field5143 = var4;
		this.field5150 = var5;
		this.field5145 = var6;
		this.field5146 = var7;
		this.field5152 = var8;
		this.field5148 = var9;
	}

	public void method9547(int var1, int var2, int var3, int var4) {
		this.field5140 = var1;
		this.field5147 = var2;
		this.field5151 = var3;
		this.field5141 = var4;
	}

	public void method9545(class392 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5143, (int) (0.9F * (float) var3));
			int var5 = var1.method7294(this.field5142);
			int var6 = var1.method7325(this.field5143);
			int var7 = var5 + (this.field5149 - this.field5150);
			int var8 = var3 + var6 + (this.field5144 - this.field5145);
			Rasterizer2D.Rasterizer2D_setClip(this.field5149, this.field5144, this.field5149 + this.field5142,
					this.field5143 + this.field5144);
			int var9 = this.field5152;
			int var10 = this.field5146;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class396 var21 = var1.method7275(0, var9);
			class396 var12 = var1.method7275(var9, var10);
			class396 var13 = var1.method7275(var10, var1.method7266());
			class396 var14 = var1.method7275(0, this.field5146);
			int var16;
			int var18;
			if (!var12.method7531()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method7549(); ++var16) {
					class394 var23 = var12.method7536(var16);
					var18 = var7 + var23.field4441;
					int var19 = var2.charWidth(var23.field4438);
					int var20 = var8 + var23.field4440 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5141);
				}
			}

			if (!var21.method7531()) {
				var2.method7432(var21, var7, var8, this.field5140, this.field5147, -1);
			}

			if (!var12.method7531()) {
				var2.method7432(var12, var7, var8, this.field5151, this.field5147, -1);
			}

			if (!var13.method7531()) {
				var2.method7432(var13, var7, var8, this.field5140, this.field5147, -1);
			}

			if (this.field5148) {
				class473 var22 = var14.method7541();
				var16 = var7 + (Integer) var22.field4903;
				int var17 = var8 + (Integer) var22.field4904;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5140);
				if (this.field5147 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5147);
				}
			}

		}
	}
}
