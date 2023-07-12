public final class BoundaryObject {

	

	int z;

	

	int x;

	

	int y;

	

	int orientationA;

	

	int orientationB;

	public Renderable renderable1;

	public Renderable renderable2;

	

	public long tag = 0L;

	

	int flags = 0;

	BoundaryObject() {
	}

	public static final synchronized long method5027() {
		long var0 = System.currentTimeMillis();
		if (var0 < class300.field3364) {
			class300.field3365 += class300.field3364 - var0;
		}

		class300.field3364 = var0;
		return var0 + class300.field3365;
	}

	static final void method5026(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9) {
		PendingSpawn var10 = null;

		for (PendingSpawn var11 = (PendingSpawn) Client.pendingSpawns
				.last(); var11 != null; var11 = (PendingSpawn) Client.pendingSpawns.previous()) {
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new PendingSpawn();
			var10.plane = var0;
			var10.type = var3;
			var10.x = var1;
			var10.y = var2;
			var10.field1143 = -1;
			DirectByteArrayCopier.method6568(var10);
			Client.pendingSpawns.addFirst(var10);
		}

		var10.field1148 = var4;
		var10.field1142 = var5;
		var10.field1141 = var6;
		var10.delay = var8;
		var10.hitpoints = var9;
		var10.method2346(var7);
	}
}
