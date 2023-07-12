public class class439 {

	float field4695;

	float field4688;

	float field4687;

	float field4699;

	float field4691;

	float field4692;

	float field4693;

	float field4694;

	float field4689;

	float field4696;

	float field4690;

	float field4698;

	static {
		new class439();
	}

	class439() {
		this.method8153();
	}

	void method8153() {
		this.field4698 = 0.0F;
		this.field4690 = 0.0F;
		this.field4696 = 0.0F;
		this.field4694 = 0.0F;
		this.field4693 = 0.0F;
		this.field4692 = 0.0F;
		this.field4699 = 0.0F;
		this.field4687 = 0.0F;
		this.field4688 = 0.0F;
		this.field4689 = 1.0F;
		this.field4691 = 1.0F;
		this.field4695 = 1.0F;
	}

	void method8157(float var1) {
		float var2 = (float) Math.cos((double) var1);
		float var3 = (float) Math.sin((double) var1);
		float var4 = this.field4688;
		float var5 = this.field4691;
		float var6 = this.field4694;
		float var7 = this.field4690;
		this.field4688 = var2 * var4 - var3 * this.field4687;
		this.field4687 = var4 * var3 + this.field4687 * var2;
		this.field4691 = var5 * var2 - var3 * this.field4692;
		this.field4692 = var5 * var3 + this.field4692 * var2;
		this.field4694 = var2 * var6 - var3 * this.field4689;
		this.field4689 = var2 * this.field4689 + var3 * var6;
		this.field4690 = var2 * var7 - this.field4698 * var3;
		this.field4698 = var2 * this.field4698 + var7 * var3;
	}

	void method8169(float var1) {
		float var2 = (float) Math.cos((double) var1);
		float var3 = (float) Math.sin((double) var1);
		float var4 = this.field4695;
		float var5 = this.field4699;
		float var6 = this.field4693;
		float var7 = this.field4696;
		this.field4695 = var3 * this.field4687 + var2 * var4;
		this.field4687 = this.field4687 * var2 - var4 * var3;
		this.field4699 = var3 * this.field4692 + var2 * var5;
		this.field4692 = this.field4692 * var2 - var3 * var5;
		this.field4693 = var3 * this.field4689 + var2 * var6;
		this.field4689 = var2 * this.field4689 - var6 * var3;
		this.field4696 = var2 * var7 + var3 * this.field4698;
		this.field4698 = this.field4698 * var2 - var3 * var7;
	}

	void method8168(float var1) {
		float var2 = (float) Math.cos((double) var1);
		float var3 = (float) Math.sin((double) var1);
		float var4 = this.field4695;
		float var5 = this.field4699;
		float var6 = this.field4693;
		float var7 = this.field4696;
		this.field4695 = var4 * var2 - var3 * this.field4688;
		this.field4688 = var3 * var4 + this.field4688 * var2;
		this.field4699 = var5 * var2 - var3 * this.field4691;
		this.field4691 = this.field4691 * var2 + var5 * var3;
		this.field4693 = var6 * var2 - var3 * this.field4694;
		this.field4694 = var2 * this.field4694 + var3 * var6;
		this.field4696 = var2 * var7 - this.field4690 * var3;
		this.field4690 = var2 * this.field4690 + var3 * var7;
	}

	void method8162(float var1, float var2, float var3) {
		this.field4696 += var1;
		this.field4690 += var2;
		this.field4698 += var3;
	}

	public String toString() {
		return this.field4695 + "," + this.field4699 + "," + this.field4693 + "," + this.field4696 + "\n"
				+ this.field4688 + "," + this.field4691 + "," + this.field4694 + "," + this.field4690 + "\n"
				+ this.field4687 + "," + this.field4692 + "," + this.field4689 + "," + this.field4698;
	}

	public static int method8155(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	public static final void method8156(class51 var0) {
		AbstractUserComparator.pcmPlayerProvider = var0;
	}
}
