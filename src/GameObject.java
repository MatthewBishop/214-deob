public final class GameObject {

	
	static int field2850;

	

	int plane;

	

	int startX;

	

	int z;

	

	int centerX;

	

	int centerY;

	public Renderable renderable;

	

	int orientation;

	

	int endX;

	

	int startY;

	

	int endY;

	
	int field2847;

	

	int lastDrawn;

	

	public long tag = 0L;

	

	int flags = 0;

	GameObject() {
	}

	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
