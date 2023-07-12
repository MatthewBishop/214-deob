import java.util.HashMap;

public class Fonts {

	AbstractArchive spritesArchive;

	AbstractArchive fontsArchive;

	HashMap map;

	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = class478.method8649(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	public static void method8576(Archive var0, int var1) {
		class411.field4561.offset = var1 * 8 + 5;
		if (class411.field4561.offset >= class411.field4561.array.length) {
			if (var0.field4242) {
				var0.method6648();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var2 = class411.field4561.readInt();
			int var3 = class411.field4561.readInt();
			var0.loadIndex(var2, var3);
		}
	}
}
