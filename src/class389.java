import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class389 implements Iterator {

	static ClanSettings guestClanSettings;

	class390 field4410;

	
	int field4409 = 0;

	
	int field4408;

	class389(class390 var1) {
		this.field4408 = this.field4410.field4414;
		this.field4410 = var1;
	}

	public boolean hasNext() {
		return this.field4409 < this.field4410.field4412;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4410.field4414 != this.field4408) {
			throw new ConcurrentModificationException();
		} else if (this.field4409 < this.field4410.field4412) {
			Object var1 = this.field4410.field4416[this.field4409].field4406;
			++this.field4409;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	static int method7215(int var0) {
		return (int) Math.pow(2.0, (double) ((float) var0 / 256.0F + 7.0F));
	}
}
