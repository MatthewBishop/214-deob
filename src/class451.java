import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

public class class451 implements class449 {

	

	public static int clientType;

	final Map field4723;

	public class451(Map var1) {
		this.field4723 = var1;
	}

	public class448 vmethod8254() {
		return null;
	}

	public byte[] vmethod8248() throws UnsupportedEncodingException {
		return this.method8249().getBytes("UTF-8");
	}

	public String method8249() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field4723.entrySet().iterator();

		while (var2.hasNext()) {
			Map.Entry var3 = (Map.Entry) var2.next();
			String var4 = URLEncoder.encode((String) var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String) var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}
}
