public class StructComposition extends DualNode {

	static AbstractArchive StructDefinition_archive;

	static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);

	static String[] cacheParentPaths;

	IterableNodeHashTable params;

	StructComposition() {
	}

	void postDecode() {
	}

	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
		}

	}

	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode) var4.get((long) var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	public String getStringParam(int var1, String var2) {
		return class165.method3374(this.params, var1, var2);
	}
}
