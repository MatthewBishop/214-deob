import java.util.concurrent.Future;

public class class18 {

	static short[] foundItemIds;

	Future field89;

	String field91;

	class18(Future var1) {
		this.field89 = var1;
	}

	class18(String var1) {
		this.method283(var1);
	}

	void method283(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field91 = var1;
		if (this.field89 != null) {
			this.field89.cancel(true);
			this.field89 = null;
		}

	}

	public final String method274() {
		return this.field91;
	}

	public boolean method280() {
		return this.field91 != null || this.field89 == null;
	}

	public final boolean method275() {
		return this.method280() ? true : this.field89.isDone();
	}

	public final class20 method276() {
		if (this.method280()) {
			return new class20(this.field91);
		} else if (!this.method275()) {
			return null;
		} else {
			try {
				return (class20) this.field89.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method283(var2);
				return new class20(var2);
			}
		}
	}
}
