public class class155 extends class158 {

	static boolean field1722;

	
	int field1718;

	byte field1723;

	
	int field1720;

	String field1721;
	// $FF: synthetic field

	final class159 this$0;

	class155(class159 var1) {
		this.this$0 = var1;
		this.field1718 = -1;
	}

	void vmethod3370(Buffer var1) {
		var1.readUnsignedByte();
		this.field1718 = var1.readUnsignedShort();
		this.field1723 = var1.readByte();
		this.field1720 = var1.readUnsignedShort();
		var1.readLong();
		this.field1721 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	void vmethod3371(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember) var1.members.get(this.field1718);
		var2.rank = this.field1723;
		var2.world = this.field1720;
		var2.username = new Username(this.field1721);
	}

	public static int method3288(int var0) {
		return class302.field3370[var0];
	}

	public static void method3287() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized (MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}
}
