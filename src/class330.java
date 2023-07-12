public class class330 {

	

	public static int SpriteBuffer_spriteWidth;

	static final void method6526(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0
					&& Client.rootWidgetXs[var4] < var0 + var2
					&& Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1
					&& Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field724[var4] = true;
			}
		}

	}
}
