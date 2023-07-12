public class class210 extends Node {

	static int[] Tiles_saturation;

	
	public int field2335;

	
	public int field2330;

	
	public int field2331;

	public Widget field2332;

	public class210(int var1, int var2, int var3, Widget var4) {
		this.field2331 = var1;
		this.field2335 = var2;
		this.field2330 = var3;
		this.field2332 = var4;
	}

	static char method4124(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char) (var0 == 339 ? 'e' : '\u0000');
		}
	}

	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent) Client.interfaceParents.get((long) var3.id);
					if (var4 != null) {
						class453.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Clock.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = FriendSystem.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length
								|| var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Clock.runScriptEvent(var5);
				}
			}
		}

	}
}
