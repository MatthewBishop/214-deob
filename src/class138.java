public enum class138 implements MouseWheel {

	field1607(1, 0),

	field1606(0, 1),

	field1608(2, 2),

	field1609(4, 3),

	field1610(3, 4);

	
	public final int field1611;

	

	final int id;

	class138(int var3, int var4) {
		this.field1611 = var3;
		this.id = var4;
	}

	public int rsOrdinal() {
		return this.id;
	}

	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		WorldMapID.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
	}
}
