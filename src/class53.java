public class class53 extends Node {

	
	static int field368;

	static Widget scriptDotWidget;

	static Archive archive10;

	class47 field371;

	public class53() {
		this.field371 = null;
	}

	class53(VorbisSample var1) {
		this.field371 = new class47(var1, (RawSound) null);
	}

	public class53(RawSound var1) {
		this.field371 = new class47((VorbisSample) null, var1);
	}

	public boolean method1041() {
		return this.field371 == null;
	}

	public RawSound method1039() {
		if (this.field371 != null && this.field371.field331.tryLock()) {
			RawSound var1 = this.method1040();
			this.field371.field331.unlock();
			return var1;
		} else {
			return null;
		}
	}

	public RawSound method1038() {
		if (this.field371 != null) {
			this.field371.field331.lock();
			RawSound var1 = this.method1040();
			this.field371.field331.unlock();
			return var1;
		} else {
			return null;
		}
	}

	RawSound method1040() {
		if (this.field371.field332 == null) {
			this.field371.field332 = this.field371.field333.toRawSound((int[]) null);
			this.field371.field333 = null;
		}

		return this.field371.field332;
	}

	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition) SpotAnimationDefinition.SpotAnimationDefinition_cached
				.get((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long) var0);
			return var1;
		}
	}

	static class494 method1052(int var0) {
		class494 var1 = (class494) Client.DBTableIndex_cache.get((long) var0);
		if (var1 == null) {
			var1 = new class494(Messages.field1377, class152.method3196(var0), class481.method8660(var0));
			Client.DBTableIndex_cache.put(var1, (long) var0);
		}

		return var1;
	}
}
