public class DbRowType extends DualNode {

	public static AbstractArchive field4997;

	static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);

	Object[][] columnTypes;

	int[][] field4993;

	

	public int tableId = -1;

	DbRowType() {
	}

	void method8811(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method8813(var1, var2);
		}
	}

	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	void method8813(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field4993 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}

				this.columnTypes[var4] = class154.method3274(var1, var6);
				this.field4993[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	void method8814() {
	}
}
