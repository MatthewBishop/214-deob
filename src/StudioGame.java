public enum StudioGame implements MouseWheel {

	runescape("runescape", "RuneScape", 0),

	stellardawn("stellardawn", "Stellar Dawn", 1),

	game3("game3", "Game 3", 2),

	game4("game4", "Game 4", 3),

	game5("game5", "Game 5", 4),

	oldscape("oldscape", "RuneScape 2007", 5);

	public final String name;

	

	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	public int rsOrdinal() {
		return this.id;
	}

	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode) Client.widgetFlags.get((long) var0.childIndex + ((long) var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
