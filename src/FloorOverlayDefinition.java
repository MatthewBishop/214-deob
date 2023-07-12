public class FloorOverlayDefinition extends DualNode {

	public static AbstractArchive FloorOverlayDefinition_archive;

	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);

	static int[] field2268;

	static Decimator decimator;

	

	public int primaryRgb = 0;

	

	public int texture = -1;

	public boolean hideUnderlay = true;

	

	public int secondaryRgb = -1;

	

	public int hue;

	

	public int saturation;

	

	public int lightness;

	

	public int secondaryHue;

	

	public int secondarySaturation;

	

	public int secondaryLightness;

	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	void setHsl(int var1) {
		double var2 = (double) (var1 >> 16 & 255) / 256.0;
		double var4 = (double) (var1 >> 8 & 255) / 256.0;
		double var6 = (double) (var1 & 255) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var10 != var8) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0 + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}

		var12 /= 6.0;
		this.hue = (int) (256.0 * var12);
		this.saturation = (int) (var14 * 256.0);
		this.lightness = (int) (var16 * 256.0);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	public static int method4023(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	public static boolean method4035(int var0) {
		return var0 == WorldMapDecorationType.field3804.id;
	}

	static final boolean method4043(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6014(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6015(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6015(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3113,
						Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
