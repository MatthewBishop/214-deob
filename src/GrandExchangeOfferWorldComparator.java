import java.util.Comparator;

final class GrandExchangeOfferWorldComparator implements Comparator {

	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent) var1, (GrandExchangeEvent) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static int method6833(int var0) {
		return class452.field4730[var0 & 16383];
	}
}
