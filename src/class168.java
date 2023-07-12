import java.util.Collections;

public class class168 extends class180 {

	String field1792;
	// $FF: synthetic field

	final class169 this$0;

	class168(class169 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1792 = var3;
	}

	public int vmethod3531() {
		return 1;
	}

	public String vmethod3532() {
		return this.field1792;
	}

	public static void method3400(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class152.ByteArrayPool_alternativeSizes = var0;
			PendingSpawn.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			JagexCache.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) {
				JagexCache.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4491.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4491);
		} else {
			class152.ByteArrayPool_alternativeSizes = null;
			PendingSpawn.ByteArrayPool_altSizeArrayCounts = null;
			JagexCache.ByteArrayPool_arrays = null;
			ByteArrayPool.field4491.clear();
			ByteArrayPool.field4491.add(100);
			ByteArrayPool.field4491.add(5000);
			ByteArrayPool.field4491.add(10000);
			ByteArrayPool.field4491.add(30000);
		}
	}

	public static void method3398() {
		StructComposition.StructDefinition_cached.clear();
	}
}
