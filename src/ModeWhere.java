import java.util.HashSet;
import java.util.Set;

import net.runelite.rs.ScriptOpcodes;

public enum ModeWhere implements MouseWheel {

	field4356("", 0, new class368[] { class368.field4334, class368.field4337 }),

	field4354("", 1, new class368[] { class368.field4336, class368.field4334, class368.field4337 }),

	field4355("", 2, new class368[] { class368.field4336, class368.field4335, class368.field4334 }),

	field4372("", 3, new class368[] { class368.field4336 }),

	field4359("", 4),

	field4371("", 5, new class368[] { class368.field4336, class368.field4334 }),

	field4361("", 6, new class368[] { class368.field4334 }),

	field4360("", 8, new class368[] { class368.field4336, class368.field4334 }),

	field4353("", 9, new class368[] { class368.field4336, class368.field4335 }),

	field4362("", 10, new class368[] { class368.field4336 }),

	field4363("", 11, new class368[] { class368.field4336 }),

	field4364("", 12, new class368[] { class368.field4336, class368.field4334 }),

	field4358("", 13, new class368[] { class368.field4336 });

	public static Buffer NetCache_responseArchiveBuffer;

	

	static int oculusOrbFocalPointX;

	

	final int id;

	final Set field4367 = new HashSet();

	static {
		method6917();
	}

	ModeWhere(String var3, int var4, class368[] var5) {
		this.id = var4;
		class368[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class368 var8 = var6[var7];
			this.field4367.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.id = var4;
	}

	public int rsOrdinal() {
		return this.id;
	}

	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition) ParamComposition.ParamDefinition_cached.get((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long) var0);
			return var1;
		}
	}

	public static int method6929(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	public static int method6930(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	static ModeWhere[] method6917() {
		return new ModeWhere[] { field4353, field4354, field4364, field4372, field4358, field4361, field4356, field4355,
				field4362, field4360, field4359, field4363, field4371 };
	}

	static int method6927(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field739
					.method4134(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field739
					.method4171(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field739
					.method4135(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	static int method6928(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	static void method6916(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class10.clientPreferences.method2450() != 0) {
			if (var0.field2281 != null && var0.field2281.containsKey(var1)) {
				ClientPreferences.method2541((Integer) var0.field2281.get(var1), var2, var3);
			}
		}
	}

	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			class27.method391(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = BuddyRankComparator.Widget_getSpellActionName(var0);
			if (var1 != null) {
				class27.method391(var1, Strings.colorStartTag(65280) + var0.field3731, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class138.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class138.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class138.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class138.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var2;
			if (Client.isSpellSelected) {
				var2 = StudioGame.getWidgetFlags(var0);
				boolean var5 = (var2 >> 21 & 1) != 0;
				if (var5 && (class125.selectedSpellFlags & 32) == 32) {
					class27.method391(Client.selectedSpellActionName,
							Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex,
							var0.id, var0.itemId);
				}
			} else {
				for (int var7 = 9; var7 >= 5; --var7) {
					String var6 = class147.method3159(var0, var7);
					if (var6 != null) {
						class27.method391(var6, var0.dataText, 1007, var7 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}

				var1 = BuddyRankComparator.Widget_getSpellActionName(var0);
				if (var1 != null) {
					class27.method391(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					String var3;
					if (!class60.method1131(StudioGame.getWidgetFlags(var0), var2) && var0.onOp == null) {
						var3 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null
							&& var0.actions[var2].trim().length() != 0) {
						var3 = var0.actions[var2];
					} else {
						var3 = null;
					}

					if (var3 != null) {
						WorldMapID.insertMenuItem(var3, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id,
								var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				if (JagexCache.method3499(StudioGame.getWidgetFlags(var0))) {
					class138.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
