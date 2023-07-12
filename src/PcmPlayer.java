import java.util.concurrent.ScheduledExecutorService;

public class PcmPlayer {

	
	public static int field291;

	static ScheduledExecutorService soundSystemExecutor;

	

	static int worldPort;

	static String field300;

	protected int[] samples;

	PcmStream stream;

	
	int field278 = 32;

	

	long timeMs = BoundaryObject.method5027();

	

	int capacity;

	
	int field289;

	
	int field286;

	
	long field287 = 0L;

	
	int field288 = 0;

	
	int field277 = 0;

	
	int field293 = 0;

	
	long field282 = 0L;

	boolean field292 = true;

	
	int field284 = 0;

	PcmStream[] field294 = new PcmStream[8];

	PcmStream[] field295 = new PcmStream[8];

	protected PcmPlayer() {
	}

	protected void init() throws Exception {
	}

	protected void open(int var1) throws Exception {
	}

	protected int position() throws Exception {
		return this.capacity;
	}

	protected void write() throws Exception {
	}

	protected void close() {
	}

	protected void discard() throws Exception {
	}

	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = BoundaryObject.method5027();

			try {
				if (this.field287 != 0L) {
					if (var1 < this.field287) {
						return;
					}

					this.open(this.capacity);
					this.field287 = 0L;
					this.field292 = true;
				}

				int var3 = this.position();
				if (this.field293 - var3 > this.field288) {
					this.field288 = this.field293 - var3;
				}

				int var4 = this.field289 + this.field286;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field292 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field286 = var4 - this.field289;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field282) {
					if (!this.field292) {
						if (this.field288 == 0 && this.field277 == 0) {
							this.close();
							this.field287 = 2000L + var1;
							return;
						}

						this.field286 = Math.min(this.field277, this.field288);
						this.field277 = this.field288;
					} else {
						this.field292 = false;
					}

					this.field288 = 0;
					this.field282 = var1 + 2000L;
				}

				this.field293 = var3;
			} catch (Exception var7) {
				this.close();
				this.field287 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long) (256000 / field291);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	public final void method748() {
		this.field292 = true;
	}

	public final synchronized void tryDiscard() {
		this.field292 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field287 = BoundaryObject.method5027() + 2000L;
		}

	}

	public final synchronized void shutdown() {
		if (class382.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class382.soundSystem.players[var2]) {
					class382.soundSystem.players[var2] = null;
				}

				if (class382.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				class382.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	final void skip(int var1) {
		this.field284 -= var1;
		if (this.field284 < 0) {
			this.field284 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class347.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class397.clearIntArray(var1, 0, var3);
		this.field284 -= var2;
		if (this.stream != null && this.field284 <= 0) {
			this.field284 += field291 >> 4;
			InterfaceParent.PcmStream_disable(this.stream);
			this.method764(this.stream, this.stream.vmethod1017());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label107: for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field294[var7];

						label101: while (true) {
							while (true) {
								if (var11 == null) {
									break label101;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod5920();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field278) {
										break label107;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field353; var14 != null; var14 = var11.nextSubStream()) {
											this.method764(var14, var15 * var14.vmethod1017() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field294[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field295[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field294[var6];
				PcmStream[] var17 = this.field294;
				this.field295[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field284 < 0) {
			this.field284 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = BoundaryObject.method5027();
	}

	final void method764(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field295[var3];
		if (var4 == null) {
			this.field294[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field295[var3] = var1;
		var1.field353 = var2;
	}

	static final void method797(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) {
			Object var1 = null;
			var2 = 65536;
			if (var0.targetIndex < var2) {
				var1 = Client.npcs[var0.targetIndex];
			} else {
				var1 = Client.players[var0.targetIndex - var2];
			}

			if (var1 != null) {
				var3 = var0.x - ((Actor) var1).x;
				var4 = var0.y - ((Actor) var1).y;
				if (var3 != 0 || var4 != 0) {
					var0.orientation = class398.method7591(var3, var4);
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1225 > 0) {
			var7 = -1;
			if (var0.field1178 != -1 && var0.field1190 != -1) {
				var2 = var0.field1178 * 128 - class213.baseX * 8192 + 64;
				var3 = var0.field1190 * 128 - class101.baseY * 8192 + 64;
				var4 = var0.x - var2;
				int var5 = var0.y - var3;
				if (var4 != 0 || var5 != 0) {
					var7 = class398.method7591(var4, var5);
				}
			} else if (var0.field1228 != -1) {
				var7 = var0.field1228;
			}

			if (var7 != -1) {
				var0.orientation = var7;
				if (var0.field1184) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2375();
		}

		var7 = var0.orientation - var0.rotation & 2047;
		if (var7 != 0) {
			boolean var8 = true;
			boolean var9 = true;
			++var0.field1219;
			var4 = var7 > 1024 ? -1 : 1;
			var0.rotation += var0.field1220 * var4;
			boolean var10 = true;
			if (var7 < var0.field1220 || var7 > 2048 - var0.field1220) {
				var0.rotation = var0.orientation;
				var10 = false;
			}

			if (var0.field1220 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1219 > 25 || var10)) {
				if (var4 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var4 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1219 = 0;
		}

	}
}
