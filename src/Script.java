public class Script extends DualNode {

	static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);

	String field992;

	int[] opcodes;

	int[] intOperands;

	String[] stringOperands;

	

	int localIntCount;

	

	int localStringCount;

	

	int intArgumentCount;

	

	int stringArgumentCount;

	IterableNodeHashTable[] switches;

	Script() {
	}

	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
