public class GrandExchangeOffer {

	static Archive archive14;

	byte state;

	

	public int id;

	

	public int unitPrice;

	

	public int totalQuantity;

	

	public int currentQuantity;

	

	public int currentPrice;

	public GrandExchangeOffer() {
	}

	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	public int status() {
		return this.state & 7;
	}

	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	void method6845(int var1) {
		this.state &= -8;
		this.state = (byte) (this.state | var1 & 7);
	}

	void method6855(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte) (this.state | 8);
		}

	}
}
