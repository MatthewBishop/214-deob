import java.io.UnsupportedEncodingException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class450 implements class449 {

	JSONObject field4721;

	public class450(byte[] var1) throws UnsupportedEncodingException {
		this.method8237(var1);
	}

	public class450(JSONObject var1) {
		this.field4721 = var1;
	}

	public class450(String var1) throws UnsupportedEncodingException {
		this.method8234(var1);
	}

	public class448 vmethod8254() {
		return class448.field4717;
	}

	public byte[] vmethod8248() throws UnsupportedEncodingException {
		return this.field4721 == null ? new byte[0] : this.field4721.toString().getBytes("UTF-8");
	}

	void method8237(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method8234(var2);
	}

	void method8234(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4721 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4721 = new JSONObject();
				this.field4721.method8392("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	public JSONObject method8238() {
		return this.field4721;
	}
}
