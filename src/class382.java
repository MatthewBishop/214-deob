public class class382 {

	public static final char[] cp1252AsciiExtension = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ',
			'‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š',
			'›', 'œ', '\u0000', 'ž', 'Ÿ' };

	static SoundSystem soundSystem;

	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	static void method7141(int var0, int var1) {
		MenuAction var2 = UrlRequester.tempMenuAction;
		if (var2 != null) {
			WorldMapIcon_0.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.itemId, var2.action,
					var2.target, var0, var1);
		}

		UrlRequester.tempMenuAction = null;
	}
}
