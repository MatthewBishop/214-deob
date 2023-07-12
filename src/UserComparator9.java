public class UserComparator9 extends AbstractUserComparator {

	
	static int field1437;

	public static AbstractArchive musicTrackArchive;

	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername())
					: var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy) var1, (Buddy) var2);
	}

	public static void method2876(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	static final void method2877() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			int var4 = 50;
			int var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var4 / Rasterizer3D.get3dZoom();
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var4 / Rasterizer3D.get3dZoom();
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var5 / Rasterizer3D.get3dZoom();
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var5 / Rasterizer3D.get3dZoom();
			int var10 = JagexCache.method3498(var7, var4, var1, var0);
			int var11 = var1 * var4 - var0 * var7 >> 16;
			var7 = var10;
			var10 = JagexCache.method3498(var9, var5, var1, var0);
			int var12 = var1 * var5 - var9 * var0 >> 16;
			var9 = var10;
			var10 = class164.method3368(var6, var11, var3, var2);
			var4 = ClientPreferences.method2435(var6, var11, var3, var2);
			var6 = var10;
			var10 = class164.method3368(var8, var12, var3, var2);
			var5 = ClientPreferences.method2435(var8, var12, var3, var2);
			class177.field1853 = (var6 + var10) / 2;
			ViewportMouse.field2766 = (var9 + var7) / 2;
			ViewportMouse.field2767 = (var4 + var5) / 2;
			ViewportMouse.field2762 = (var10 - var6) / 2;
			class1.field4 = (var9 - var7) / 2;
			VarpDefinition.field1905 = (var5 - var4) / 2;
			class393.field4436 = Math.abs(ViewportMouse.field2762);
			class337.field3782 = Math.abs(class1.field4);
			class136.field1585 = Math.abs(VarpDefinition.field1905);
		}
	}

	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
