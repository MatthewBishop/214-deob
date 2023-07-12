public abstract class Clock {

	
	static int field1883;

	
	static int field1884;

	static int[] BZip2Decompressor_block;

	

	static int Client_plane;

	Clock() {
	}

	public abstract void mark();

	public abstract int wait(int var1, int var2);

	public static void runScriptEvent(ScriptEvent var0) {
		SoundSystem.runScript(var0, 500000, 475000);
	}

	static void method3548(Archive var0, int var1) {
		if (var0.field4242) {
			if (var1 <= NetCache.field4281) {
				throw new RuntimeException("");
			}

			if (var1 < NetCache.field4267) {
				NetCache.field4267 = var1;
			}
		} else {
			if (var1 >= NetCache.field4267) {
				throw new RuntimeException("");
			}

			if (var1 > NetCache.field4281) {
				NetCache.field4281 = var1;
			}
		}

		if (class411.field4561 != null) {
			Fonts.method8576(var0, var1);
		} else {
			class341.requestNetFile((Archive) null, 255, 255, 0, (byte) 0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	static final void method3550(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1225 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence);
				if (var0.field1226 > 0 && var1.field2287 == 0) {
					++var0.field1225;
					return;
				}

				if (var0.field1226 <= 0 && var1.field2274 == 0) {
					++var0.field1225;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.field1155 * 1292107776 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.field1155 * 1292107776 + var0.pathY[var0.pathLength - 1] * 128;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			class216 var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC) var0).definition.isClickable;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1220 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1225 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1225;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1225 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1225;
					}
				}

				if (var5 == class216.field2396) {
					var8 <<= 1;
				} else if (var5 == class216.field2394) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1191 != -1) {
						var0.movementSequence = var0.field1191;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1198 != -1) {
						var0.movementSequence = var0.field1198;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1167 != -1) {
						var0.movementSequence = var0.field1167;
					}
				} else if (var8 <= 1) {
					if (var0.movementSequence == var0.walkSequence && var0.field1168 != -1) {
						var0.movementSequence = var0.field1168;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1169 != -1) {
						var0.movementSequence = var0.field1169;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1183 != -1) {
						var0.movementSequence = var0.field1183;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1171 != -1) {
						var0.movementSequence = var0.field1171;
					}
				}

				if (var3 != var10 || var2 != var4) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1226 > 0) {
						--var0.field1226;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1226 > 0) {
					--var0.field1226;
				}

			}
		}
	}
}
