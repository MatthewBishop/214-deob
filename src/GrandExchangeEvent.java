public class GrandExchangeEvent {

	public static short[] field4312;

	

	public final int world;

	

	public final long age;

	public final GrandExchangeOffer grandExchangeOffer;

	String offerName;

	String previousOfferName;

	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method6845(2);
		this.grandExchangeOffer.method6855(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	public String getOfferName() {
		return this.offerName;
	}

	public String getPreviousOfferName() {
		return this.previousOfferName;
	}
}
