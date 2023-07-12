public enum AttackOption implements MouseWheel {

	AttackOption_dependsOnCombatLevels(0),

	AttackOption_alwaysRightClick(1),

	field1308(2),

	AttackOption_hidden(3),

	field1307(4);

	

	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	public int rsOrdinal() {
		return this.id;
	}
}
