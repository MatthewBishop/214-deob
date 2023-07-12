import net.runelite.rs.ScriptOpcodes;

public enum WorldMapSectionType implements MouseWheel {

	WORLDMAPSECTIONTYPE0(0, (byte) 0),

	WORLDMAPSECTIONTYPE1(2, (byte) 1),

	WORLDMAPSECTIONTYPE2(3, (byte) 2),

	WORLDMAPSECTIONTYPE3(1, (byte) 3);

	public static AbstractRasterProvider rasterProvider;

	

	final int type;

	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	public int rsOrdinal() {
		return this.id;
	}

	static void method5418() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	static int method5425(int var0, Script var1, boolean var2) {
		Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginScreenAnimation
					.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	static final void playPcmPlayers() {
		if (class290.pcmPlayer1 != null) {
			class290.pcmPlayer1.run();
		}

		if (MouseRecorder.pcmPlayer0 != null) {
			MouseRecorder.pcmPlayer0.run();
		}

	}
}
