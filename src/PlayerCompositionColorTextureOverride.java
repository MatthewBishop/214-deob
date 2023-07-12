public class PlayerCompositionColorTextureOverride {

	
	static int field1891;

	public short[] playerCompositionRecolorTo;

	public short[] playerCompositionRetextureTo;

	PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = class300.ItemDefinition_get(var1);
		if (var2.method3964()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0,
					this.playerCompositionRecolorTo.length);
		}

		if (var2.method4008()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0,
					this.playerCompositionRetextureTo.length);
		}

	}
}
