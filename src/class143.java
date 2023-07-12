public class class143 extends class142 {

	public static boolean[] Widget_loadedInterfaces;

	
	int field1629;

	boolean field1625;
	// $FF: synthetic field

	final class145 this$0;

	class143(class145 var1) {
		this.this$0 = var1;
		this.field1629 = -1;
	}

	void vmethod3381(Buffer var1) {
		this.field1629 = var1.readUnsignedShort();
		this.field1625 = var1.readUnsignedByte() == 1;
	}

	void vmethod3382(ClanSettings var1) {
		var1.method3214(this.field1629, this.field1625);
	}

	public static void method3134() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	static final void method3132(String var0) {
		ParamComposition.method3837("Please remove " + var0 + " from your ignore list first");
	}

	static class494 method3126(int var0) {
		class494 var1 = (class494) Client.DBTableMasterIndex_cache.get((long) var0);
		if (var1 == null) {
			var1 = new class494(Messages.field1377, var0);
		}

		return var1;
	}
}
