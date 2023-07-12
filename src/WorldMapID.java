public class WorldMapID {

	static final WorldMapID field3020 = new WorldMapID(0);

	static final WorldMapID field3022 = new WorldMapID(1);

	

	public static int canvasHeight;

	

	final int value;

	WorldMapID(int var1) {
		this.value = var1;
	}

	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6,
			boolean var7) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuItemIds[Client.menuOptionsCount] = var6;
				Client.menuShiftClick[Client.menuOptionsCount] = var7;
				++Client.menuOptionsCount;
			}

		}
	}
}
