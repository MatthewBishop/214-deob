public class class396 {

	class392 field4467;

	
	int field4470 = 0;

	
	int field4469 = 0;

	class396(class392 var1, int var2, int var3) {
		this.field4467 = var1;
		this.field4470 = var2;
		this.field4469 = var3;
	}

	public String method7529() {
		if (this.method7531()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7549());

			for (int var2 = this.field4470; var2 < this.field4469; ++var2) {
				class394 var3 = this.field4467.method7262(var2);
				var1.append(var3.field4438);
			}

			return var1.toString();
		}
	}

	boolean method7542(int var1) {
		return this.field4467.method7378() == 2
				|| this.field4467.method7378() == 1 && (!this.field4467.field4428 || this.field4469 - 1 != var1);
	}

	public boolean method7531() {
		return this.field4469 == this.field4470;
	}

	public int method7549() {
		return this.field4469 - this.field4470;
	}

	boolean method7533(class394 var1) {
		if (this.field4467.field4432 == 2) {
			return true;
		} else if (this.field4467.field4432 == 0) {
			return false;
		} else {
			return this.field4467.method7263() != var1;
		}
	}

	int method7534() {
		if (this.method7531()) {
			return 0;
		} else {
			class394 var1 = this.field4467.method7262(this.field4469 - 1);
			if (var1.field4438 == '\n') {
				return 0;
			} else if (this.method7533(var1)) {
				return this.field4467.field4431.advances[42];
			} else {
				int var2 = this.field4467.field4431.advances[var1.field4438];
				if (var2 == 0) {
					return var1.field4438 == '\t' ? this.field4467.field4431.advances[32] * 3
							: this.field4467.field4431.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	public class473 method7541() {
		if (this.method7531()) {
			return new class473(0, 0);
		} else {
			class394 var1 = this.field4467.method7262(this.field4469 - 1);
			return new class473(var1.field4441 + this.method7534(), var1.field4440);
		}
	}

	public class394 method7536(int var1) {
		return var1 >= 0 && var1 < this.method7549() ? this.field4467.method7262(this.field4470 + var1) : null;
	}

	public static class438 method7554() {
		synchronized (class438.field4682) {
			if (class438.field4684 == 0) {
				return new class438();
			} else {
				class438.field4682[--class438.field4684].method8098();
				return class438.field4682[class438.field4684];
			}
		}
	}
}
