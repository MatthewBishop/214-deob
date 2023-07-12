public class MenuAction {

	public static AbstractArchive Widget_spritesArchive;

	

	int param0;

	

	int param1;

	

	int opcode;

	

	int identifier;

	

	int itemId;

	String action;

	String target;

	MenuAction() {
	}

	public static int method2055() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	static int method2056(Widget var0) {
		if (var0.type != 11) {
			--class149.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6371(var1);
			return 1;
		}
	}
}
