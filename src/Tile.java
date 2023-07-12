public final class Tile extends Node {

	

	int plane;

	

	int x;

	

	int y;

	

	int originalPlane;

	SceneTilePaint paint;

	SceneTileModel model;

	BoundaryObject boundaryObject;

	WallDecoration wallDecoration;

	FloorDecoration floorDecoration;

	ItemLayer itemLayer;

	

	int gameObjectsCount;

	GameObject[] gameObjects = new GameObject[5];

	int[] gameObjectEdgeMasks = new int[5];

	

	int gameObjectsEdgeMask = 0;

	

	int minPlane;

	boolean drawPrimary;

	boolean drawSecondary;

	boolean drawGameObjects;

	

	int drawGameObjectEdges;

	
	int field2511;

	
	int field2512;

	
	int field2513;

	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
