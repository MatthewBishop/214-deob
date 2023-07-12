public final class WallDecoration {

	
	static int field2828;

	

	int z;

	

	int xOffset;

	

	int x;

	

	int y;

	

	int orientation;

	

	int orientation2;

	

	int yOffset;

	public Renderable renderable1;

	public Renderable renderable2;

	

	public long tag = 0L;

	

	int flags = 0;

	WallDecoration() {
	}

	static boolean method5043(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class175.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
