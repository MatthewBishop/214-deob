import java.util.Comparator;

public class UserComparator4 implements Comparator {

	
	static int field1410;

	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy) var1, (Buddy) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public static void method2847(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.field1995 = var1;
	}

	static final int method2848(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
