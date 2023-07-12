import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public class class304 {

	public static AbstractArchive field3396;

	public static AbstractArchive musicSamplesArchive;

	public static AbstractArchive soundEffectsArchive;

	public static MidiPcmStream midiPcmStream;

	

	public static int musicPlayerStatus = 0;

	

	public static int musicTrackFileId;

	

	public static int musicTrackVolume;

	public static SoundCache soundCache;

	static AtomicBoolean field3392 = null;

	static ThreadPoolExecutor field3393 = null;

	
	public static int field3385 = -1;

	
	public static int field3395 = -1;

	public static final List field3388 = new ArrayList();

	static SpritePixels compass;

	static void method5715(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = AABB.getWorldMap().getMapArea(var0);
		int var4 = Projectile.localPlayer.plane;
		int var5 = class213.baseX * 64 + (Projectile.localPlayer.x >> 7);
		int var6 = class101.baseY * 64 + (Projectile.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		AABB.getWorldMap().method8402(var3, var7, var1, var2);
	}
}
