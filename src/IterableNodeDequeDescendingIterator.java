import java.util.Iterator;

public class IterableNodeDequeDescendingIterator implements Iterator {

	IterableNodeDeque deque;

	Node field4376;

	Node last = null;

	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.setDeque(var1);
	}

	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	void start() {
		this.field4376 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}

	public Object next() {
		Node var1 = this.field4376;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4376 = null;
		} else {
			this.field4376 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4376 && this.field4376 != null;
	}
}
