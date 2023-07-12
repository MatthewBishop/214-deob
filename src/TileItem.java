public final class TileItem extends Renderable {

	

	int id;

	

	int quantity;

	
	int field1314 = 31;

	TileItem() {
	}

	void method2651(int var1) {
		this.field1314 = var1;
	}

	protected final Model getModel() {
		return class300.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	boolean method2661(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1314 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16
				|| var0 == 17;
	}

	static void method2662() {
		for (ObjectSound var0 = (ObjectSound) ObjectSound.objectSounds
				.last(); var0 != null; var0 = (ObjectSound) ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}
}
