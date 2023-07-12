public class class453 {

	static final int[] field4735 = new int[2048];

	static final int[] field4733 = new int[2048];

	static {
		double var0 = 0.0030679615757712823;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4735[var2] = (int) (65536.0 * Math.sin((double) var2 * var0));
			field4733[var2] = (int) (65536.0 * Math.cos((double) var2 * var0));
		}

	}

	static final void runIntfCloseListeners(int var0, int var1) {
		if (Client.loadInterface(var0)) {
			class210.runComponentCloseListeners(class16.Widget_interfaceComponents[var0], var1);
		}
	}
}
