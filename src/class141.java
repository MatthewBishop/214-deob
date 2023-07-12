public class class141 extends class142 {

	
	int field1621;
	// $FF: synthetic field

	final class145 this$0;

	class141(class145 var1) {
		this.this$0 = var1;
		this.field1621 = -1;
	}

	void vmethod3381(Buffer var1) {
		this.field1621 = var1.readUnsignedShort();
	}

	void vmethod3382(ClanSettings var1) {
		var1.method3208(this.field1621);
	}

	public static void method3119() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}
}
