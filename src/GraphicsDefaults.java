public class GraphicsDefaults {

	

	public int compass = -1;

	
	public int field4654 = -1;

	

	public int mapScenes = -1;

	

	public int headIconsPk = -1;

	
	public int field4657 = -1;

	
	public int field4658 = -1;

	
	public int field4655 = -1;

	
	public int field4660 = -1;

	
	public int field4661 = -1;

	
	public int field4662 = -1;

	
	public int field4659 = -1;

	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4651.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch (var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.readNullableLargeSmart();
				this.field4654 = var3.readNullableLargeSmart();
				this.mapScenes = var3.readNullableLargeSmart();
				this.headIconsPk = var3.readNullableLargeSmart();
				this.field4657 = var3.readNullableLargeSmart();
				this.field4658 = var3.readNullableLargeSmart();
				this.field4655 = var3.readNullableLargeSmart();
				this.field4660 = var3.readNullableLargeSmart();
				this.field4661 = var3.readNullableLargeSmart();
				this.field4662 = var3.readNullableLargeSmart();
				this.field4659 = var3.readNullableLargeSmart();
			}
		}
	}
}
