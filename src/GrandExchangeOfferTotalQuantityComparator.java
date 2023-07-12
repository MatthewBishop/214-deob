import java.util.Comparator;

final class GrandExchangeOfferTotalQuantityComparator implements Comparator {

	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1
				: (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent) var1, (GrandExchangeEvent) var2);
	}

	static final int method6812(int var0) {
		return Math.abs(var0 - class291.cameraYaw) > 1024 ? (var0 < class291.cameraYaw ? 1 : -1) * 2048 + var0 : var0;
	}
}
