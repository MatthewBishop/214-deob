import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import net.runelite.rs.ScriptOpcodes;

public final class class411 {

	public static Buffer field4561;

	static IndexedSprite[] scrollBarSprites;

	final Comparator field4555;

	final Map field4554;

	final class390 field4556;

	final class390 field4562;

	
	final long field4557;

	final class409 field4559;

	
	final int field4560;

	class411(long var1, int var3, class409 var4) {
		this.field4555 = new class410(this);
		this.field4557 = var1;
		this.field4560 = var3;
		this.field4559 = var4;
		if (this.field4560 == -1) {
			this.field4554 = new HashMap(64);
			this.field4556 = new class390(64, this.field4555);
			this.field4562 = null;
		} else {
			if (this.field4559 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4554 = new HashMap(this.field4560);
			this.field4556 = new class390(this.field4560, this.field4555);
			this.field4562 = new class390(this.field4560);
		}

	}

	public class411(int var1, class409 var2) {
		this(-1L, var1, var2);
	}

	boolean method7702() {
		return this.field4560 != -1;
	}

	public Object method7714(Object var1) {
		synchronized (this) {
			if (this.field4557 != -1L) {
				this.method7698();
			}

			class412 var3 = (class412) this.field4554.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method7697(var3, false);
				return var3.field4568;
			}
		}
	}

	public Object method7696(Object var1, Object var2) {
		synchronized (this) {
			if (-1L != this.field4557) {
				this.method7698();
			}

			class412 var4 = (class412) this.field4554.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4568;
				var4.field4568 = var2;
				this.method7697(var4, false);
				return var8;
			} else {
				class412 var5;
				if (this.method7702() && this.field4554.size() == this.field4560) {
					var5 = (class412) this.field4562.remove();
					this.field4554.remove(var5.field4565);
					this.field4556.remove(var5);
				}

				var5 = new class412(var2, var1);
				this.field4554.put(var1, var5);
				this.method7697(var5, true);
				return null;
			}
		}
	}

	void method7697(class412 var1, boolean var2) {
		if (!var2) {
			this.field4556.remove(var1);
			if (this.method7702() && !this.field4562.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4566 = System.currentTimeMillis();
		if (this.method7702()) {
			switch (this.field4559.field4547) {
			case 0:
				var1.field4567 = var1.field4566;
				break;
			case 1:
				++var1.field4567;
			}

			this.field4562.add(var1);
		}

		this.field4556.add(var1);
	}

	void method7698() {
		if (-1L == this.field4557) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4557;

			while (!this.field4556.isEmpty()) {
				class412 var3 = (class412) this.field4556.peek();
				if (var3.field4566 >= var1) {
					return;
				}

				this.field4554.remove(var3.field4565);
				this.field4556.remove(var3);
				if (this.method7702()) {
					this.field4562.remove(var3);
				}
			}

		}
	}

	public void method7699() {
		synchronized (this) {
			this.field4554.clear();
			this.field4556.clear();
			if (this.method7702()) {
				this.field4562.clear();
			}

		}
	}

	static int method7695(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
