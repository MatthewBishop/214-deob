import java.util.Iterator;
import java.util.LinkedList;

public class WorldMapArea {

	

	int id = -1;

	String internalName;

	String externalName;

	

	int backGroundColor = -1;

	

	int zoom = -1;

	Coord origin = null;

	

	int regionLowX = Integer.MAX_VALUE;

	

	int regionHighX = 0;

	

	int regionLowY = Integer.MAX_VALUE;

	

	int regionHighY = 0;

	boolean isMain = false;

	LinkedList sections;

	public void read(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.backGroundColor = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[] { WorldMapSectionType.WORLDMAPSECTIONTYPE0,
				WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2,
				WorldMapSectionType.WORLDMAPSECTIONTYPE3 };
		WorldMapSectionType var4 = (WorldMapSectionType) GameObject.findEnumerated(var3, var2);
		Object var5 = null;
		switch (var4.type) {
		case 0:
			var5 = new WorldMapSection2();
			break;
		case 1:
			var5 = new class259();
			break;
		case 2:
			var5 = new WorldMapSection1();
			break;
		case 3:
			var5 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection) var5).read(var1);
		return (WorldMapSection) var5;
	}

	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection) var4.next();
		} while (!var5.containsCoord(var1, var2, var3));

		return true;
	}

	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false;
					}

					var6 = (WorldMapSection) var5.next();
				} while (!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection) var4.next();
		} while (!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection) var3.next();
		} while (!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection) var1.next();
			var2.expandBounds(this);
		}

	}

	public int getId() {
		return this.id;
	}

	public boolean getIsMain() {
		return this.isMain;
	}

	public String getInternalName() {
		return this.internalName;
	}

	public String getExternalName() {
		return this.externalName;
	}

	int getBackGroundColor() {
		return this.backGroundColor;
	}

	public int getZoom() {
		return this.zoom;
	}

	public int getRegionLowX() {
		return this.regionLowX;
	}

	public int getRegionHighX() {
		return this.regionHighX;
	}

	public int getRegionLowY() {
		return this.regionLowY;
	}

	public int getRegionHighY() {
		return this.regionHighY;
	}

	public int getOriginX() {
		return this.origin.x;
	}

	public int getOriginPlane() {
		return this.origin.plane;
	}

	public int getOriginY() {
		return this.origin.y;
	}

	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte) var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	static void method5170(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long) var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class300.method5686();
	}
}
