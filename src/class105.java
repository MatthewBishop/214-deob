final class class105 implements class321 {

	

	static int foundItemIdCount;
	// $FF: synthetic field

	final Widget val$cc;

	class105(Widget var1) {
		this.val$cc = var1;
	}

	public void vmethod5986() {
		if (this.val$cc != null && this.val$cc.method6383().field3528 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2247(this.val$cc);
			var1.setArgs(this.val$cc.method6383().field3528);
			Message.method1177().addFirst(var1);
		}

	}

	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
