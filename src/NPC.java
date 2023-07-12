public final class NPC extends Actor {

	
	static int field1281 = 1;

	
	static int field1289 = 1;

	static IndexedSprite field1290;

	NPCComposition definition;

	String field1285 = "";

	
	int field1284 = 31;

	class501 field1286;

	NewStuff field1287;

	NewStuff field1288;

	NPC() {
	}

	void method2555(String var1) {
		this.field1285 = var1 == null ? "" : var1;
	}

	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0
					? WorldMapLabelSize.SequenceDefinition_get(super.sequence)
					: null;
			SequenceDefinition var2 = super.movementSequence == -1
					|| super.movementSequence == super.idleSequence && var1 != null ? null
							: WorldMapLabelSize.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.field1287 != null && this.field1287.field1990) {
				var3 = Projectile.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.field1287);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2366(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1217 != 0 && Client.cycle >= super.field1170 && Client.cycle < super.field1213) {
					var3.overrideHue = super.field1164;
					var3.overrideSaturation = super.field1215;
					var3.overrideLuminance = super.field1196;
					var3.overrideAmount = super.field1217;
					var3.field2761 = (short) var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	void method2615(int var1) {
		this.field1284 = var1;
	}

	boolean method2577(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1284 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	final String method2558() {
		if (!this.field1285.isEmpty()) {
			return this.field1285;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	final void method2559(int var1, class216 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).field2274 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	final void method2557(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).field2274 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class216.field2395;
				return;
			}
		}

		super.pathLength = 0;
		super.field1226 = 0;
		super.field1225 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field1155 * 1292107776;
		super.y = super.pathY[0] * 128 + super.field1155 * 1292107776;
	}

	int[] method2563() {
		return this.field1286 != null ? this.field1286.method9160() : this.definition.method3699();
	}

	short[] method2564() {
		return this.field1286 != null ? this.field1286.method9161() : this.definition.method3706();
	}

	void method2565(int var1, int var2, short var3) {
		if (this.field1286 == null) {
			this.field1286 = new class501(this.definition);
		}

		this.field1286.method9168(var1, var2, var3);
	}

	void method2566(int[] var1, short[] var2) {
		if (this.field1286 == null) {
			this.field1286 = new class501(this.definition);
		}

		this.field1286.method9163(var1, var2);
	}

	void method2567() {
		this.field1286 = null;
	}

	void method2579(NewStuff var1) {
		this.field1288 = var1;
	}

	NewStuff method2586() {
		return this.field1288;
	}

	void method2570(NewStuff var1) {
		this.field1287 = var1;
	}

	final boolean isVisible() {
		return this.definition != null;
	}

	void method2571() {
		this.field1288 = null;
	}

	void method2572() {
		this.field1287 = null;
	}

	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4265 != 0 && var3 > AbstractArchive.field4265) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4265 == 0 || var4 <= AbstractArchive.field4265)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	static final void clanKickUser(String var0) {
		if (class406.friendsChat != null) {
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.CLAN_KICKUSER,
					Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
