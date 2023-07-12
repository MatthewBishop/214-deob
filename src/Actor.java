public abstract class Actor extends Renderable {

	static Archive archive7;

	boolean isWalking = false;

	

	int x;

	

	int y;

	

	int rotation;

	
	int field1155 = 1;

	

	int playerCycle;

	

	int idleSequence = -1;

	

	int turnLeftSequence = -1;

	

	int turnRightSequence = -1;

	

	int walkSequence = -1;

	

	int walkBackSequence = -1;

	

	int walkLeftSequence = -1;

	

	int walkRightSequence = -1;

	

	int runSequence = -1;

	
	int field1191 = -1;

	
	int field1198 = -1;

	
	int field1167 = -1;

	
	int field1168 = -1;

	
	int field1169 = -1;

	
	int field1183 = -1;

	
	int field1171 = -1;

	String overheadText = null;

	boolean field1165;

	boolean field1174 = false;

	

	int overheadTextCyclesRemaining = 100;

	
	int field1189 = 0;

	
	int field1177 = 0;

	int[] field1224 = null;

	byte hitSplatCount = 0;

	int[] hitSplatTypes = new int[4];

	int[] hitSplatValues = new int[4];

	int[] hitSplatCycles = new int[4];

	int[] hitSplatTypes2 = new int[4];

	int[] hitSplatValues2 = new int[4];

	IterableNodeDeque healthBars = new IterableNodeDeque();

	

	int targetIndex = -1;

	boolean false0 = false;

	
	int field1228 = -1;

	
	int field1178 = -1;

	
	int field1190 = -1;

	boolean field1184;

	

	int movementSequence = -1;

	

	int movementFrame = 0;

	

	int movementFrameCycle = 0;

	
	int field1195 = 0;

	

	int sequence = -1;

	

	int sequenceFrame = 0;

	

	int sequenceFrameCycle = 0;

	

	int sequenceDelay = 0;

	
	int field1200 = 0;

	IterableNodeHashTable spotAnimations = new IterableNodeHashTable(4);

	

	int graphicsCount = 0;

	
	int field1203;

	
	int field1173;

	
	int field1205;

	
	int field1206;

	

	int spotAnimation;

	
	int field1208;

	
	int field1209;

	

	int npcCycle = 0;

	

	int defaultHeight = 200;

	
	int field1170 = -1;

	
	int field1213 = -1;

	byte field1164;

	byte field1215;

	byte field1196;

	byte field1217;

	

	int orientation;

	
	int field1219 = 0;

	
	int field1220 = 32;

	

	int pathLength = 0;

	int[] pathX = new int[10];

	int[] pathY = new int[10];

	class216[] pathTraversed = new class216[10];

	
	int field1225 = 0;

	
	int field1226 = 0;

	
	int field1227 = -1;

	Actor() {
	}

	boolean isVisible() {
		return false;
	}

	final void method2364() {
		this.pathLength = 0;
		this.field1226 = 0;
	}

	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = PlayerComposition.method6053(var1);
			var10 = var12.field2128;
			var11 = var12.field2134;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte) ((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition) HealthBarDefinition.HealthBarDefinition_cached
				.get((long) var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			var8.field1954 = var1;
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long) var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar) this.healthBars.last(); var13 != null; var13 = (HealthBar) this.healthBars
				.previous()) {
			++var12;
			if (var13.definition.field1954 == var8.field1954) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition) HealthBarDefinition.HealthBarDefinition_cached
				.get((long) var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			var3.field1954 = var1;
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long) var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar) this.healthBars.last(); var5 != null; var5 = (HealthBar) this.healthBars
				.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	void updateSpotAnimation(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle;
		ActorSpotAnim var6 = (ActorSpotAnim) this.spotAnimations.get((long) var1);
		if (var6 != null) {
			var6.remove();
			--this.graphicsCount;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var7 = 0;
			if (var4 > 0) {
				var7 = -1;
			}

			this.spotAnimations.put(new ActorSpotAnim(var2, var3, var5, var7), (long) var1);
			++this.graphicsCount;
		}
	}

	IterableNodeHashTable method2391() {
		return this.spotAnimations;
	}

	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim) var1.method8589(); var2 != null; var2 = (ActorSpotAnim) var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	Model method2366(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2706;

			for (ActorSpotAnim var7 = (ActorSpotAnim) var2.method8589(); var7 != null; var7 = (ActorSpotAnim) var2
					.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class53.SpotAnimationDefinition_get(var7.spotAnimation).method3764();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4782(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim) var2.method8589(); var11 != null; var11 = (ActorSpotAnim) var2
					.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class53.SpotAnimationDefinition_get(var11.spotAnimation)
							.getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4782(var9);
					}
				}
			}

			return var10;
		}
	}

	void method2375() {
		this.field1184 = false;
		this.field1228 = -1;
		this.field1178 = -1;
		this.field1190 = -1;
	}
}
