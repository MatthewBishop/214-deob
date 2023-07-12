public class SoundCache {

	AbstractArchive soundEffectIndex;

	AbstractArchive field323;

	NodeHashTable field321;

	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field321 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field323 = var2;
	}

	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method826(var1, var2, false);
		class53 var6 = (class53) this.field321.get(var4);
		if (var6 != null) {
			return var6.method1038();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field321.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	class53 method822(int var1, int var2) {
		long var3 = this.method826(var1, var2, true);
		class53 var5 = (class53) this.field321.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			class53 var6 = new class53(VorbisSample.readMusicSample(this.field323, var1, var2));
			this.field321.put(var6, var3);
			return var6;
		}
	}

	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public class53 method824(int var1) {
		if (this.field323.getGroupCount() == 1) {
			return this.method822(0, var1);
		} else if (this.field323.getGroupFileCount(var1) == 1) {
			return this.method822(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public RawSound method825(int var1) {
		return this.getSoundEffect(var1, (int[]) null);
	}

	long method826(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long) var4 ^ 4294967296L : (long) var4;
	}

	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int) var0.key;
		var0.remove();
		if (var1) {
			class294.method5664(var2);
		}

		for (IntegerNode var4 = (IntegerNode) Client.widgetFlags
				.first(); var4 != null; var4 = (IntegerNode) Client.widgetFlags.next()) {
			if ((long) var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = FriendSystem.getWidget(var3);
		if (var5 != null) {
			Messages.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			class453.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
