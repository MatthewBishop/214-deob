public class class442 implements class447 {

	public final class477 field4708;

	class442(class478 var1) {
		this.field4708 = var1;
	}

	public class442(class443 var1) {
		this(new class478(var1));
	}

	public int method8187(int var1) {
		return this.field4708.vmethod8643(var1);
	}

	static void addCancelMenuEntry() {
		Player.method2340();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
