public class VarbitComposition extends DualNode {

	public static AbstractArchive VarbitDefinition_archive;

	public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);

	static final int[] field2100 = new int[32];

	

	public static int musicTrackGroupId;

	

	public int baseVar;

	

	public int startBit;

	

	public int endBit;

	static {
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2100[var1] = var0 - 1;
			var0 += var0;
		}

	}

	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}
}
