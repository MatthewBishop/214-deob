public class WorldMapIcon_1 extends AbstractWorldMapIcon {

	

	final int objectDefId;

	final WorldMapRegion region;

	

	int element;

	WorldMapLabel label;

	

	int subWidth;

	

	int subHeight;

	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	void init() {
		this.element = class175.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class147.WorldMapElement_get(this.element));
		WorldMapElement var1 = class147.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	public int getElement() {
		return this.element;
	}

	WorldMapLabel getLabel() {
		return this.label;
	}

	int getSubWidth() {
		return this.subWidth;
	}

	int getSubHeight() {
		return this.subHeight;
	}

	static int method5081(int var0, int var1) {
		ItemContainer var2 = (ItemContainer) ItemContainer.itemContainers.get((long) var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	static void method5068(int var0) {
		SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class136 var4 = HealthBar.method2553(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3051() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field800.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
