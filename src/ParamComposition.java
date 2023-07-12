import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParamComposition extends DualNode {

	
	static long field2112;

	public static AbstractArchive ParamDefinition_archive;

	public static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);

	static IndexedSprite field2110;

	char type;

	

	public int defaultInt;

	public String defaultStr;

	boolean autoDisable = true;

	ParamComposition() {
	}

	void postDecode() {
	}

	void decode(Buffer var1) {
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
			this.type = InvDefinition.method3569(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	public boolean isString() {
		return this.type == 's';
	}

	static void method3838(int var0) {
		ItemContainer var1 = (ItemContainer) ItemContainer.itemContainers.get((long) var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	static final void method3837(String var0) {
		class59.addGameMessage(30, "", var0);
	}

	static float[] method3829(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float) var3.optDouble(0, 0.0);
			var2[1] = (float) var3.optDouble(1, 0.0);
			var2[2] = (float) var3.optDouble(2, 1.0);
			var2[3] = (float) var3.optDouble(3, 1.0);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}
}
