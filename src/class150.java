public class class150 extends class158 {

	
	int field1671;
	// $FF: synthetic field

	final class159 this$0;

	class150(class159 var1) {
		this.this$0 = var1;
		this.field1671 = -1;
	}

	void vmethod3370(Buffer var1) {
		this.field1671 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	void vmethod3371(ClanChannel var1) {
		var1.removeMember(this.field1671);
	}
}
