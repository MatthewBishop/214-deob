public class class148 extends class158 {

	static String userHomeDirectory;

	
	int field1660;

	byte field1654;

	
	int field1658;

	String field1656;
	// $FF: synthetic field

	final class159 this$0;

	class148(class159 var1) {
		this.this$0 = var1;
		this.field1660 = -1;
	}

	void vmethod3370(Buffer var1) {
		this.field1660 = var1.readUnsignedShort();
		this.field1654 = var1.readByte();
		this.field1658 = var1.readUnsignedShort();
		var1.readLong();
		this.field1656 = var1.readStringCp1252NullTerminated();
	}

	void vmethod3371(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember) var1.members.get(this.field1660);
		var2.rank = this.field1654;
		var2.world = this.field1658;
		var2.username = new Username(this.field1656);
	}

	public static int method3166(CharSequence var0, int var1) {
		return class211.method4167(var0, var1, true);
	}
}
