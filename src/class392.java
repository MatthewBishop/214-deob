import java.util.ArrayList;

public class class392 {

	
	int field4423 = Integer.MAX_VALUE;

	
	int field4421 = Integer.MAX_VALUE;

	
	int field4418 = 0;

	
	int field4426 = 0;

	
	int field4427 = 0;

	boolean field4428 = true;

	AbstractFont field4431;

	ArrayList field4430 = new ArrayList();

	
	int field4424 = 0;

	
	int field4432 = 0;

	public class394 method7262(int var1) {
		return (class394) this.field4430.get(var1);
	}

	class394 method7263() {
		return this.field4430.size() == 0 ? null : (class394) this.field4430.get(this.field4430.size() - 1);
	}

	public boolean method7410() {
		return this.field4430.size() == 0;
	}

	boolean method7400() {
		return this.field4421 > 1;
	}

	public int method7266() {
		return this.field4430.size();
	}

	public String method7267() {
		if (this.method7410()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7266());

			for (int var2 = 0; var2 < this.method7266(); ++var2) {
				class394 var3 = this.method7262(var2);
				var1.append(var3.field4438);
			}

			return var1.toString();
		}
	}

	public void method7397(int var1) {
		if (this.field4431 != null && var1 < this.field4431.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4423 != var1) {
			this.field4423 = var1;
			this.method7355();
		}

	}

	public void method7269(int var1) {
		if (this.field4421 != var1) {
			this.field4421 = var1;
			this.method7355();
		}

	}

	public void method7270(int var1) {
		if (this.field4432 != var1) {
			this.field4432 = var1;
			this.method7355();
		}

	}

	public void method7271(AbstractFont var1) {
		if (var1 != this.field4431) {
			this.field4431 = var1;
			if (this.field4431 != null) {
				if (this.field4427 == 0) {
					this.field4427 = this.field4431.ascent;
				}

				if (!this.method7410()) {
					this.method7355();
				}
			}
		}

	}

	public void method7272(int var1) {
		if (this.field4424 != var1) {
			this.field4424 = var1;
			this.method7355();
		}

	}

	public boolean method7273(int var1, int var2) {
		if (this.field4418 != var1 || var2 != this.field4426) {
			this.field4418 = var1;
			this.field4426 = var2;
			this.method7355();
		}

		return true;
	}

	public void method7361(int var1) {
		if (this.field4427 != var1) {
			this.field4427 = var1;
			this.method7355();
		}

	}

	public class396 method7275(int var1, int var2) {
		if (var2 == var1) {
			return new class396(this, 0, 0);
		} else if (var1 <= this.field4430.size() && var2 <= this.field4430.size()) {
			return var2 < var1 ? new class396(this, var2, var1) : new class396(this, var1, var2);
		} else {
			return new class396(this, 0, 0);
		}
	}

	public class393 method7276(char var1, int var2, int var3) {
		return this.method7277(Character.toString(var1), var2, var3);
	}

	public class393 method7277(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4430.size() >= var3) {
			this.method7297(var2, var2);
			return new class393(var2, true);
		} else {
			this.field4430.ensureCapacity(this.field4430.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4430.size() < var3; ++var5) {
				class394 var6 = new class394();
				var6.field4438 = var1.charAt(var5);
				this.field4430.add(var4, var6);
				++var4;
			}

			this.method7297(var2, var4);
			if (this.field4421 != 0 && this.method7319() > this.field4421) {
				while (var4 != var2) {
					--var4;
					this.method7281(var4);
					if (this.method7319() <= this.field4421) {
						break;
					}
				}

				return new class393(var4, true);
			} else {
				return new class393(var4, false);
			}
		}
	}

	class393 method7278(String var1, int var2) {
		return this.method7277(var1, this.field4430.size(), var2);
	}

	public class393 method7279(String var1) {
		this.method7280();
		return this.method7278(var1, 0);
	}

	void method7280() {
		this.field4430.clear();
	}

	public int method7281(int var1) {
		return this.method7282(var1, var1 + 1);
	}

	public int method7282(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4430.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7400() && this.field4424 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class394) this.field4430.get(var3)).field4438;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7297(var3, var2);
		return var1;
	}

	public int method7296(int var1, int var2) {
		if (this.field4431 == null) {
			return 0;
		} else if (this.method7400() && var1 > this.field4423) {
			return this.field4430.size();
		} else {
			if (!this.field4430.isEmpty()) {
				for (int var3 = 0; var3 < this.field4430.size(); ++var3) {
					class394 var4 = (class394) this.field4430.get(var3);
					if (var2 <= var4.field4440 + this.method7287()) {
						if (var2 < var4.field4440) {
							break;
						}

						if (var1 < var4.field4441) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4430.size()
								&& ((class394) this.field4430.get(var3 + 1)).field4440 != var4.field4440) {
							int var5 = this.method7291((class394) this.field4430.get(var3), false);
							if (var1 < var5 + var4.field4441) {
								return var3;
							}

							if (var2 <= var4.field4440 + this.method7287()) {
								return var3 + 1;
							}
						}
					}
				}

				class394 var6 = (class394) this.field4430.get(this.field4430.size() - 1);
				if (var1 >= var6.field4441 && var1 <= var6.field4441 + this.method7286() && var2 >= var6.field4440
						&& var2 <= var6.field4440 + this.method7287()) {
					return this.field4430.size() - 1;
				}
			}

			return this.field4430.size();
		}
	}

	public int method7289(int var1, int var2) {
		if (this.field4431 != null && !this.method7410() && var1 <= this.field4430.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				class394 var6 = (class394) this.field4430.get(var1 - 1);
				var4 = var6.field4441 + this.method7292(var1 - 1);
				var5 = var6.field4440;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4430.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class394 var12 = (class394) this.field4430.get(var11 - 1);
				if (var5 != var12.field4440) {
					++var7;
					var5 = var12.field4440;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4441 + this.method7292(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4430.size();
			} else {
				if (var5 != 0) {
					++var7;
				}

				return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8;
			}
		} else {
			return 0;
		}
	}

	public int method7285() {
		if (!this.field4430.isEmpty() && this.method7319() == 1) {
			return this.field4430.isEmpty() ? 0
					: ((class394) this.field4430.get(this.field4430.size() - 1)).field4441 + this.method7286();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4430.size() - 1; var3 >= 0; --var3) {
				class394 var4 = (class394) this.field4430.get(var3);
				if (var1 != var4.field4440) {
					int var5 = this.method7291(var4, false) + var4.field4441;
					var2 = Math.max(var5, var2);
					var1 = var4.field4440;
				}
			}

			return var2;
		}
	}

	public int method7288() {
		return this.method7410() ? 0
				: this.field4431.ascent + ((class394) this.field4430.get(this.field4430.size() - 1)).field4440;
	}

	public int method7287() {
		return this.field4427;
	}

	public int method7319() {
		return this.method7288() / this.field4431.ascent;
	}

	int method7286() {
		return this.method7410() ? 0 : this.method7291((class394) this.field4430.get(this.field4430.size() - 1), false);
	}

	public int method7290() {
		return this.field4423;
	}

	public int method7299() {
		return this.field4421;
	}

	public int method7305() {
		return this.field4424;
	}

	public int method7378() {
		return this.field4432;
	}

	public int method7294(int var1) {
		switch (this.field4418) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	public int method7325(int var1) {
		switch (this.field4426) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	void method7355() {
		this.method7297(0, this.field4430.size());
	}

	void method7297(int var1, int var2) {
		if (!this.method7410() && this.field4431 != null) {
			class473 var3 = this.method7300(var1, var2);
			boolean var4 = (Integer) var3.field4903 == 0 && (Integer) var3.field4904 == this.field4430.size();
			int var5 = (Integer) var3.field4903;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class394) this.field4430.get((Integer) var3.field4903)).field4440;
			int var8 = 0;

			int var9;
			for (var9 = (Integer) var3.field4903; var9 <= (Integer) var3.field4904; ++var9) {
				boolean var10 = var9 >= this.field4430.size();
				class394 var21 = (class394) this.field4430.get(!var10 ? var9 : this.field4430.size() - 1);
				int var22 = !var10 ? this.method7291(var21, false) : 0;
				boolean var13 = !var10 && var21.field4438 == '\n';
				boolean var14 = !var10 && this.method7400() && var6 + var22 > this.field4423;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class394 var19;
					if (var14) {
						var17 = 0;
						if (this.field4424 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class394) this.field4430.get(var18);
								var17 += var18 < var15 ? this.method7291(var19, false) : 0;
								if (var19.field4438 == ' ' || var19.field4438 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7294(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class394) this.field4430.get(var18);
						int var20 = this.method7291(var19, false);
						var19.field4441 = var17;
						var19.field4440 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7287();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4426 != 0 && var4) {
				var9 = var8 * this.method7287();
				int var23 = this.method7325(var9);

				for (int var11 = 0; var11 < this.field4430.size(); ++var11) {
					class394 var12 = (class394) this.field4430.get(var11);
					var12.field4440 -= var23;
				}
			}

		}
	}

	int method7292(int var1) {
		return var1 < this.field4430.size() ? this.method7291((class394) this.field4430.get(var1), false) : 0;
	}

	int method7291(class394 var1, boolean var2) {
		if (var1.field4438 == '\n') {
			return 0;
		} else if (this.field4432 == 0) {
			int var3 = this.field4431.advances[var1.field4438];
			if (var3 == 0) {
				return var1.field4438 == '\t' ? this.field4431.advances[32] * 3 : this.field4431.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4431.advances[42];
		}
	}

	class473 method7300(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4430.size();
		if (var3 == 0 && var5 == var4) {
			return new class473(0, var5);
		} else {
			int var6 = this.method7283(var3, false);
			int var7 = this.method7406(var4, false);
			int var8;
			switch (this.field4426) {
			case 0:
				if (this.field4418 == 0) {
					return new class473(var6, var5);
				}

				var8 = this.method7283(var3, true);
				return new class473(var8, var5);
			case 1:
				return new class473(0, var5);
			case 2:
				if (this.field4418 == 2) {
					return new class473(0, var7);
				}

				var8 = this.method7406(var4, true);
				return new class473(0, var8);
			default:
				return new class473(0, var5);
			}
		}
	}

	int method7283(int var1, boolean var2) {
		if (var1 < this.field4430.size()) {
			int var3 = ((class394) this.field4430.get(var1)).field4440;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class394) this.field4430.get(var4 - 1)).field4440 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class394) this.field4430.get(var4 - 1)).field4440;
				}
			}
		}

		return 0;
	}

	int method7406(int var1, boolean var2) {
		if (var1 < this.field4430.size()) {
			int var3 = ((class394) this.field4430.get(var1)).field4440;

			for (int var4 = var1; var4 < this.field4430.size() - 1; ++var4) {
				if (((class394) this.field4430.get(var4 + 1)).field4440 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class394) this.field4430.get(var4 + 1)).field4440;
				}
			}
		}

		return this.field4430.size();
	}

	static final void method7411(double var0) {
		Rasterizer3D.method4372(var0);
		((TextureProvider) Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		class165.method3378();
		class10.clientPreferences.method2443(var0);
	}
}
