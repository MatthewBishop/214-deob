public class class501 {

	int[] field5024 = new int[8];

	short[] field5025 = new short[8];

	public class501(NPCComposition var1) {
		int var2 = 0;
		if (var1.method3698()) {
			var2 = var1.method3699().length;
			System.arraycopy(var1.method3699(), 0, this.field5024, 0, var2);
			System.arraycopy(var1.method3706(), 0, this.field5025, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5024[var3] = -1;
			this.field5025[var3] = -1;
		}

	}

	public int[] method9160() {
		return this.field5024;
	}

	public short[] method9161() {
		return this.field5025;
	}

	public void method9168(int var1, int var2, short var3) {
		this.field5024[var1] = var2;
		this.field5025[var1] = var3;
	}

	public void method9163(int[] var1, short[] var2) {
		this.field5024 = var1;
		this.field5025 = var2;
	}
}
