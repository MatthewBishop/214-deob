public class class139 extends class142 {

	
	int field1615;

	
	int field1614;

	
	int field1613;

	
	int field1616;
	// $FF: synthetic field

	final class145 this$0;

	class139(class145 var1) {
		this.this$0 = var1;
		this.field1615 = -1;
	}

	void vmethod3381(Buffer var1) {
		this.field1615 = var1.readUnsignedShort();
		this.field1614 = var1.readInt();
		this.field1613 = var1.readUnsignedByte();
		this.field1616 = var1.readUnsignedByte();
	}

	void vmethod3382(ClanSettings var1) {
		var1.method3215(this.field1615, this.field1614, this.field1613, this.field1616);
	}

	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition) StructComposition.StructDefinition_cached.get((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long) var0);
			return var1;
		}
	}
}
