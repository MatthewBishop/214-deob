public class WorldMapDecoration {

	

	final int objectDefinitionId;

	

	final int decoration;

	

	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	static RouteStrategy method5461(int var0, int var1) {
		Client.field804.approxDestinationX = var0;
		Client.field804.approxDestinationY = var1;
		Client.field804.approxDestinationSizeX = 1;
		Client.field804.approxDestinationSizeY = 1;
		return Client.field804;
	}
}
