public class PlatformInfo extends Node {

	

	int os;

	boolean field4518;

	

	int osVersion;

	

	int vendor;

	

	int javaMajor;

	

	int javaMinor;

	

	int javaPatch;

	boolean field4524;

	

	int maxMemory;

	

	int cpuCores;

	

	int field4527;

	

	int clockSpeed;

	String field4536;

	String field4514;

	String field4528;

	String field4532;

	

	int field4512;

	

	int field4534;

	

	int field4535;

	

	int field4530;

	String field4537;

	String field4538;

	int[] field4539 = new int[3];

	

	int field4540;

	String field4541;

	String field4542;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9,
			int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17,
			int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25,
			String var26) {
		this.os = var1;
		this.field4518 = var2;
		this.osVersion = var3;
		this.vendor = var4;
		this.javaMajor = var5;
		this.javaMinor = var6;
		this.javaPatch = var7;
		this.field4524 = var8;
		this.maxMemory = var9;
		this.cpuCores = var10;
		this.field4527 = var11;
		this.clockSpeed = var12;
		this.field4536 = var13;
		this.field4514 = var14;
		this.field4528 = var15;
		this.field4532 = var16;
		this.field4512 = var17;
		this.field4534 = var18;
		this.field4535 = var19;
		this.field4530 = var20;
		this.field4537 = var21;
		this.field4538 = var22;
		this.field4539 = var23;
		this.field4540 = var24;
		this.field4541 = var25;
		this.field4542 = var26;
	}

	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.os);
		var1.writeByte(this.field4518 ? 1 : 0);
		var1.writeShort(this.osVersion);
		var1.writeByte(this.vendor);
		var1.writeByte(this.javaMajor);
		var1.writeByte(this.javaMinor);
		var1.writeByte(this.javaPatch);
		var1.writeByte(this.field4524 ? 1 : 0);
		var1.writeShort(this.maxMemory);
		var1.writeByte(this.cpuCores);
		var1.writeMedium(this.field4527);
		var1.writeShort(this.clockSpeed);
		var1.writeStringCp1252NullCircumfixed(this.field4536);
		var1.writeStringCp1252NullCircumfixed(this.field4514);
		var1.writeStringCp1252NullCircumfixed(this.field4528);
		var1.writeStringCp1252NullCircumfixed(this.field4532);
		var1.writeByte(this.field4534);
		var1.writeShort(this.field4512);
		var1.writeStringCp1252NullCircumfixed(this.field4537);
		var1.writeStringCp1252NullCircumfixed(this.field4538);
		var1.writeByte(this.field4535);
		var1.writeByte(this.field4530);

		for (int var2 = 0; var2 < this.field4539.length; ++var2) {
			var1.writeInt(this.field4539[var2]);
		}

		var1.writeInt(this.field4540);
		var1.writeStringCp1252NullCircumfixed(this.field4541);
		var1.writeStringCp1252NullCircumfixed(this.field4542);
	}

	public int size() {
		int var1 = 39;
		var1 += VarcInt.method3616(this.field4536);
		var1 += VarcInt.method3616(this.field4514);
		var1 += VarcInt.method3616(this.field4528);
		var1 += VarcInt.method3616(this.field4532);
		var1 += VarcInt.method3616(this.field4537);
		var1 += VarcInt.method3616(this.field4538);
		var1 += VarcInt.method3616(this.field4541);
		var1 += VarcInt.method3616(this.field4542);
		return var1;
	}

	static final void method8309() {
		if (Clock.Client_plane != Client.field747) {
			Client.field747 = Clock.Client_plane;
			ItemContainer.method2239(Clock.Client_plane);
		}

	}

	static void method8310() {
		for (InterfaceParent var0 = (InterfaceParent) Client.interfaceParents
				.first(); var0 != null; var0 = (InterfaceParent) Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (Client.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class16.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int) var0.key;
					Widget var5 = FriendSystem.getWidget(var4);
					if (var5 != null) {
						Messages.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
