import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

public class class407 {

	final Map field4541 = new HashMap();

	final Map field4540 = new HashMap();

	final DecimalFormat field4539 = new DecimalFormat();

	public class407() {
		this.field4539.setMaximumFractionDigits(2);
	}

	public void method7640(HttpsURLConnection var1) {
		Iterator var2 = this.field4541.entrySet().iterator();

		while (var2.hasNext()) {
			Map.Entry var3 = (Map.Entry) var2.next();
			var1.setRequestProperty((String) var3.getKey(), (String) var3.getValue());
		}

	}

	public Map method7641() {
		return this.field4541;
	}

	public void method7642(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4541.put(var1, var2 != null ? var2 : "");
		}

	}

	public void method7643(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4541.remove(var1);
		}

	}

	void method7644(class406 var1, String var2) {
		String var3 = String.format("%s %s", var1.method7635(), var2);
		this.method7642("Authorization", var3);
	}

	public void method7678(String var1) {
		this.method7644(class406.field4536, var1);
	}

	public void method7646(String var1) {
		this.method7644(class406.field4535, var1);
	}

	public void method7647(class448 var1) {
		this.field4541.put("Content-Type", var1.method8223());
	}

	public void method7645() {
		this.field4541.remove("Content-Type");
	}

	public void method7649(class448 var1) {
		this.method7667(var1, 1.0F);
	}

	void method7667(class448 var1, float var2) {
		this.field4540.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method7651();
	}

	void method7651() {
		this.field4541.remove("Accept");
		if (!this.field4540.isEmpty()) {
			this.field4541.put("Accept", this.method7666());
		}

	}

	String method7666() {
		ArrayList var1 = new ArrayList(this.field4540.entrySet());
		Collections.sort(var1, new class408(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Map.Entry var4 = (Map.Entry) var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class448) var4.getKey()).method8223());
			float var5 = (Float) var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.field4539.format((double) var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}
}
