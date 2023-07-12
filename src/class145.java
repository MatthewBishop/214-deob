public class class145 {

	
	long field1635;

	
	int field1636 = -1;

	IterableNodeDeque field1637 = new IterableNodeDeque();

	public class145(Buffer var1) {
		this.method3140(var1);
	}

	void method3140(Buffer var1) {
		this.field1635 = var1.readLong();
		this.field1636 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class164(this);
			} else if (var2 == 1) {
				var3 = new class140(this);
			} else if (var2 == 13) {
				var3 = new class157(this);
			} else if (var2 == 4) {
				var3 = new class149(this);
			} else if (var2 == 6) {
				var3 = new class156(this);
			} else if (var2 == 5) {
				var3 = new class141(this);
			} else if (var2 == 2) {
				var3 = new class146(this);
			} else if (var2 == 7) {
				var3 = new class139(this);
			} else if (var2 == 14) {
				var3 = new class143(this);
			} else if (var2 == 8) {
				var3 = new class160(this);
			} else if (var2 == 9) {
				var3 = new class166(this);
			} else if (var2 == 10) {
				var3 = new class152(this);
			} else if (var2 == 11) {
				var3 = new class147(this);
			} else if (var2 == 12) {
				var3 = new class151(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class161(this);
			}

			((class142) var3).vmethod3381(var1);
			this.field1637.addFirst((Node) var3);
		}

	}

	public void method3141(ClanSettings var1) {
		if (this.field1635 == var1.field1689 && this.field1636 == var1.field1699) {
			for (class142 var2 = (class142) this.field1637.last(); var2 != null; var2 = (class142) this.field1637
					.previous()) {
				var2.vmethod3382(var1);
			}

			++var1.field1699;
		} else {
			throw new RuntimeException("");
		}
	}

	static void method3139() {
		for (ObjectSound var0 = (ObjectSound) ObjectSound.objectSounds
				.last(); var0 != null; var0 = (ObjectSound) ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				KitDefinition.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				KitDefinition.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	public static boolean method3147(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
