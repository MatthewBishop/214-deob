public class class404 {

	static Font fontPlain12;

	static SpritePixels redHintArrowSprite;

	public static PrivateChatMode method7633(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[] { PrivateChatMode.field5155, PrivateChatMode.field5154,
				PrivateChatMode.field5153 };
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5156) {
				return var4;
			}
		}

		return null;
	}

	static AttackOption[] method7634() {
		return new AttackOption[] { AttackOption.field1308, AttackOption.AttackOption_dependsOnCombatLevels,
				AttackOption.field1307, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden };
	}
}
