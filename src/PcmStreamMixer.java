public class PcmStreamMixer extends PcmStream {

	NodeDeque subStreams = new NodeDeque();

	NodeDeque field255 = new NodeDeque();

	int field257 = 0;

	int field258 = -1;

	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	void method674() {
		if (this.field257 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener) this.field255
					.last(); var1 != null; var1 = (PcmStreamMixerListener) this.field255.previous()) {
				var1.field407 -= this.field257;
			}

			this.field258 -= this.field257;
			this.field257 = 0;
		}

	}

	void method675(Node var1, PcmStreamMixerListener var2) {
		while (this.field255.sentinel != var1 && ((PcmStreamMixerListener) var1).field407 <= var2.field407) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field258 = ((PcmStreamMixerListener) this.field255.sentinel.previous).field407;
	}

	void method676(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field255.sentinel.previous;
		if (var2 == this.field255.sentinel) {
			this.field258 = -1;
		} else {
			this.field258 = ((PcmStreamMixerListener) var2).field407;
		}

	}

	protected PcmStream firstSubStream() {
		return (PcmStream) this.subStreams.last();
	}

	protected PcmStream nextSubStream() {
		return (PcmStream) this.subStreams.previous();
	}

	protected int vmethod5920() {
		return 0;
	}

	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field258 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field257 < this.field258) {
				this.field257 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field258 - this.field257;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field257 += var4;
			this.method674();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener) this.field255.last();
			synchronized (var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field407 = 0;
					this.method676(var5);
				} else {
					var5.field407 = var7;
					this.method675(var5.previous, var5);
				}
			}
		} while (var3 != 0);

	}

	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream) this.subStreams.last(); var4 != null; var4 = (PcmStream) this.subStreams
				.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	public final synchronized void skip(int var1) {
		do {
			if (this.field258 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field257 + var1 < this.field258) {
				this.field257 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field258 - this.field257;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field257 += var2;
			this.method674();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener) this.field255.last();
			synchronized (var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field407 = 0;
					this.method676(var3);
				} else {
					var3.field407 = var5;
					this.method675(var3.previous, var3);
				}
			}
		} while (var1 != 0);

	}

	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream) this.subStreams.last(); var2 != null; var2 = (PcmStream) this.subStreams
				.previous()) {
			var2.skip(var1);
		}

	}
}
