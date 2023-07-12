public class class147 extends class142 {

	
	int field1650;

	
	int field1646;

	
	int field1648;

	
	int field1647;
	// $FF: synthetic field

	final class145 this$0;

	class147(class145 var1) {
		this.this$0 = var1;
	}

	void vmethod3381(Buffer var1) {
		this.field1650 = var1.readInt();
		this.field1647 = var1.readInt();
		this.field1646 = var1.readUnsignedByte();
		this.field1648 = var1.readUnsignedByte();
	}

	void vmethod3382(ClanSettings var1) {
		var1.method3217(this.field1650, this.field1647, this.field1646, this.field1648);
	}

	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length
				&& WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0]
						: new WorldMapElement(var0);
	}

	static String method3159(Widget var0, int var1) {
		if (!class60.method1131(StudioGame.getWidgetFlags(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null
					&& var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
