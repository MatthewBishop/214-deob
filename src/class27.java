import java.util.Arrays;

public class class27 {

	int[] field135 = new int[112];

	int[] field139 = new int[192];

	public class27() {
		Arrays.fill(this.field135, 3);
		Arrays.fill(this.field139, 3);
	}

	public void method382(int var1, int var2) {
		if (this.method381(var1) && this.method403(var2)) {
			this.field135[var1] = var2;
		}

	}

	public void method383(char var1, int var2) {
		if (this.method390(var1) && this.method403(var2)) {
			this.field139[var1] = var2;
		}

	}

	public int method420(int var1) {
		return this.method381(var1) ? this.field135[var1] : 0;
	}

	public int method385(char var1) {
		return this.method390(var1) ? this.field139[var1] : 0;
	}

	public boolean method386(int var1) {
		return this.method381(var1) && (this.field135[var1] == 1 || this.field135[var1] == 3);
	}

	public boolean method387(char var1) {
		return this.method390(var1) && (this.field139[var1] == 1 || this.field139[var1] == 3);
	}

	public boolean method388(int var1) {
		return this.method381(var1) && (this.field135[var1] == 2 || this.field135[var1] == 3);
	}

	public boolean method389(char var1) {
		return this.method390(var1) && (this.field139[var1] == 2 || this.field139[var1] == 3);
	}

	boolean method381(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	boolean method390(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	boolean method403(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	public static void openURL(String var0, boolean var1, boolean var2) {
		class100.method2626(var0, var1, "openjs", var2);
	}

	static long method406() {
		return Client.field631;
	}

	static final void method391(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		WorldMapID.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
	}
}
