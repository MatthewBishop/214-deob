import java.net.URL;

public class UrlRequest {

	
	static int field1404 = -1;

	
	static int field1405 = -2;

	final URL field1407;

	
	volatile int field1403;

	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.field1403 = field1404;
		this.field1407 = var1;
	}

	public boolean isDone() {
		return this.field1403 != field1404;
	}

	public byte[] getResponse() {
		return this.response0;
	}

	public String method2833() {
		return this.field1407.toString();
	}

	static final void method2839(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1330[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1330;
					var10000[var5] = (byte) (var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = InterfaceParent.method2244(var0);
						var10000 = Players.field1330;
						var10000[var5] = (byte) (var10000[var5] | 2);
					} else {
						class72.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1330[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1330;
						var10000[var5] = (byte) (var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = InterfaceParent.method2244(var0);
							var10000 = Players.field1330;
							var10000[var5] = (byte) (var10000[var5] | 2);
						} else {
							class72.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1330[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1330;
							var10000[var5] = (byte) (var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = InterfaceParent.method2244(var0);
								var10000 = Players.field1330;
								var10000[var5] = (byte) (var10000[var5] | 2);
							} else if (UserComparator7.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1330;
								var10000[var5] = (byte) (var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1330[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1330;
								var10000[var5] = (byte) (var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = InterfaceParent.method2244(var0);
									var10000 = Players.field1330;
									var10000[var5] = (byte) (var10000[var5] | 2);
								} else if (UserComparator7.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1330;
									var10000[var5] = (byte) (var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1330;
							var10000[var2] = (byte) (var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}
}
