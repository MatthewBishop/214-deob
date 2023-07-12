public class class159 {

	
	long field1743;

	
	long field1746 = -1L;

	IterableNodeDeque field1744 = new IterableNodeDeque();

	public class159(Buffer var1) {
		this.method3312(var1);
	}

	void method3312(Buffer var1) {
		this.field1743 = var1.readLong();
		this.field1746 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class154(this);
			} else if (var2 == 4) {
				var3 = new class165(this);
			} else if (var2 == 3) {
				var3 = new class150(this);
			} else if (var2 == 2) {
				var3 = new class148(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class155(this);
			}

			((class158) var3).vmethod3370(var1);
			this.field1744.addFirst((Node) var3);
		}

	}

	public void method3313(ClanChannel var1) {
		if (var1.key == this.field1743 && var1.field1764 == this.field1746) {
			for (class158 var2 = (class158) this.field1744.last(); var2 != null; var2 = (class158) this.field1744
					.previous()) {
				var2.vmethod3371(var1);
			}

			++var1.field1764;
		} else {
			throw new RuntimeException("");
		}
	}

	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
