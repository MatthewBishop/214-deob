public class VarcInt extends DualNode {

	public static AbstractArchive VarcInt_archive;

	public static EvictingDualNodeHashTable VarcInt_cached = new EvictingDualNodeHashTable(64);

	public boolean persist = false;

	public void method3613(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3612(var1, var2);
		}
	}

	void method3612(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	public static void method3617() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	public static int method3616(String var0) {
		return var0.length() + 2;
	}
}
