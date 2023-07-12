public class class151 extends class142 {

	String field1676;
	// $FF: synthetic field

	final class145 this$0;

	class151(class145 var1) {
		this.this$0 = var1;
	}

	void vmethod3381(Buffer var1) {
		this.field1676 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	void vmethod3382(ClanSettings var1) {
		var1.name = this.field1676;
	}
}
