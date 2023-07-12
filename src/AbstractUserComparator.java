import java.util.Comparator;

public abstract class AbstractUserComparator implements Comparator {

	static class51 pcmPlayerProvider;

	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) this.nextComparator).addComparator(var1);
		}

	}

	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
