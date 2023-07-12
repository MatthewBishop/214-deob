import java.util.Iterator;

class class484 implements Iterator {

	
	int field4958;
	// $FF: synthetic field

	final class485 this$0;

	class484(class485 var1) {
		this.this$0 = var1;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field4958 < this.this$0.method8195();
	}

	public Object next() {
		int var1 = ++this.field4958 - 1;
		class444 var2 = (class444) this.this$0.field4961.get((long) var1);
		return var2 != null ? var2 : this.this$0.method8720(var1);
	}
}
