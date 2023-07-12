import java.util.Comparator;

class class410 implements Comparator {

	static AbstractArchive WorldMapElement_archive;
	// $FF: synthetic field

	final class411 this$0;

	class410(class411 var1) {
		this.this$0 = var1;
	}

	int method7688(class412 var1, class412 var2) {
		if (var1.field4566 > var2.field4566) {
			return 1;
		} else {
			return var1.field4566 < var2.field4566 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7688((class412) var1, (class412) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
