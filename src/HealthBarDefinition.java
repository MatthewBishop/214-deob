public class HealthBarDefinition extends DualNode {

	public static AbstractArchive HealthBarDefinition_archive;

	public static AbstractArchive field1952;

	public static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);

	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);

	
	public int field1954;

	

	public int int1 = 255;

	

	public int int2 = 255;

	

	public int int3 = -1;

	
	public int field1960 = 1;

	

	public int int5 = 70;

	

	int frontSpriteID = -1;

	

	int backSpriteID = -1;

	

	public int width = 30;

	

	public int widthPadding = 0;

	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HealthBarDefinition_cachedSprites.get((long) this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1952, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long) this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HealthBarDefinition_cachedSprites.get((long) this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class107.SpriteBuffer_getSprite(field1952, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long) this.backSpriteID);
				}

				return var1;
			}
		}
	}

	public static PlayerType[] PlayerType_values() {
		return new PlayerType[] { PlayerType.PlayerType_hardcoreIronman, PlayerType.field4205, PlayerType.field4204,
				PlayerType.field4211, PlayerType.PlayerType_ironman, PlayerType.field4212, PlayerType.field4208,
				PlayerType.field4203, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman,
				PlayerType.field4206, PlayerType.field4207, PlayerType.PlayerType_normal, PlayerType.field4202,
				PlayerType.field4209, PlayerType.field4213, PlayerType.PlayerType_jagexModerator };
	}
}
