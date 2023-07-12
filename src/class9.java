public class class9 implements MouseWheel {

	public static final class9 field33 = new class9(0, "POST", true, true);

	public static final class9 field36 = new class9(1, "GET", true, false);

	static final class9 field32 = new class9(2, "PUT", false, true);

	static final class9 field30 = new class9(3, "PATCH", false, true);

	static final class9 field31 = new class9(4, "DELETE", false, true);

	
	int field34;

	String field35;

	boolean field37;

	boolean field38;

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field34 = var1;
		this.field35 = var2;
		this.field37 = var3;
		this.field38 = var4;
	}

	public int rsOrdinal() {
		return this.field34;
	}

	boolean method70() {
		return this.field37;
	}

	public String method82() {
		return this.field35;
	}

	boolean method68() {
		return this.field38;
	}

	static void method66() {
		Login.worldSelectOpen = false;
		Decimator.leftTitleSprite.drawAt(Login.xPadding, 0);
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18);
	}
}
