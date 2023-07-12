public class class146 extends class142 {

	
	int field1644;

	byte field1643;
	// $FF: synthetic field

	final class145 this$0;

	class146(class145 var1) {
		this.this$0 = var1;
		this.field1644 = -1;
	}

	void vmethod3381(Buffer var1) {
		this.field1644 = var1.readUnsignedShort();
		this.field1643 = var1.readByte();
	}

	void vmethod3382(ClanSettings var1) {
		var1.method3212(this.field1644, this.field1643);
	}

	public static boolean isNumber(CharSequence var0) {
		return class160.method3324(var0, 10, true);
	}
}
