import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

import org.json.JSONException;
import org.json.JSONObject;

import com.jagex.oldscape.pub.OtlTokenRequester;

import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

public final class Client extends GameEngine implements Usernamed, OAuthApi, class312 {

	
	public static int field698;

	

	static int viewportOffsetX;

	

	static int viewportOffsetY;

	static final ApproximateRouteStrategy field804;

	static GrandExchangeOffer[] grandExchangeOffers;

	static int[] field805;

	static int[] field806;

	static boolean field691;

	static boolean field725;

	
	static int field790;

	static PlayerComposition playerAppearance;

	static class466 field769;

	
	static int field791;

	static class466 field768;

	static ArrayList archiveLoaders;

	

	static int archiveLoadersDone;

	static EvictingDualNodeHashTable DBTableIndex_cache;

	static EvictingDualNodeHashTable DBTableMasterIndex_cache;

	static class411 archive5;

	static PlatformInfoProvider platformInfoProvider;

	static short field776;

	static short field620;

	static short field591;

	static short field783;

	static short field781;

	

	static int viewportZoom;

	static short field780;

	

	static int viewportWidth;

	
	static int field767;

	

	static int viewportHeight;

	static short zoomHeight;

	static boolean field581;

	static short zoomWidth;

	static boolean[] field771;

	static class467 field540;

	static int[] field695;

	static int[] field772;

	static int[] field774;

	static int[] field763;

	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;

	static List field800;

	
	static int field606;

	static boolean field522 = true;

	

	public static int worldId = 1;

	

	static int worldProperties = 0;

	

	static int gameBuild = 0;

	public static boolean isMembersWorld = false;

	static boolean isLowDetail = false;

	
	static int field508 = -1;

	

	static int clientType = -1;

	
	static int field510 = -1;

	static boolean onMobile = false;

	
	public static int field512 = 214;

	

	static int gameState = 0;

	static boolean isLoading = true;

	

	static int cycle = 0;

	

	static long mouseLastLastPressedTimeMillis = 1L;

	
	static int field519 = -1;

	
	static int field520 = -1;

	
	static long field571 = -1L;

	static boolean hadFocus = true;

	

	static int rebootTimer = 0;

	

	static int hintArrowType = 0;

	

	static int hintArrowNpcIndex = 0;

	

	static int hintArrowPlayerIndex = 0;

	

	static int hintArrowX = 0;

	

	static int hintArrowY = 0;

	

	static int hintArrowHeight = 0;

	

	static int hintArrowSubX = 0;

	

	static int hintArrowSubY = 0;

	static AttackOption playerAttackOption;

	static AttackOption npcAttackOption;

	static boolean renderSelf;

	

	static int titleLoadingStage;

	

	static int js5ConnectState;

	
	static int field761;

	

	static int js5Errors;

	

	static int loginState;

	
	static int field558;

	
	static int field782;

	
	static int field542;

	static class138 field677;

	static class505 field633;

	static final String field502;

	static boolean Login_isUsernameRemembered;

	static SecureRandomFuture secureRandomFuture;

	static byte[] randomDatData;

	static NPC[] npcs;

	

	static int npcCount;

	static int[] npcIndices;

	
	static int field579;

	static int[] field566;

	public static final PacketWriter packetWriter;

	

	static int logoutTimer;

	static String field667;

	static boolean hadNetworkError;

	static Timer timer;

	static HashMap fontsMap;

	
	static int field572;

	
	static int field573;

	
	static int field574;

	
	static int field580;

	
	static int field576;

	static CollisionMap[] collisionMaps;

	static boolean isInInstance;

	static int[][][] instanceChunkTemplates;

	static final int[] field570;

	

	static int graphicsCycle;

	
	static int field582;

	
	static int field583;

	
	static int field584;

	
	static int field799;

	static boolean field585;

	

	static int alternativeScrollbarWidth;

	

	static int camAngleX;

	

	static int camAngleY;

	

	static int camAngleDY;

	

	static int camAngleDX;

	
	static int field727;

	

	static int mouseCamClickedY;

	

	static int oculusOrbState;

	

	static int camFollowHeight;

	
	static int field596;

	
	static int field597;

	
	static int field598;

	

	static int oculusOrbNormalSpeed;

	

	static int oculusOrbSlowedSpeed;

	
	public static int field601;

	static boolean field602;

	
	static int field637;

	static boolean field604;

	
	static int field605;

	

	static int overheadTextCount;

	

	static int overheadTextLimit;

	static int[] overheadTextXs;

	static int[] overheadTextYs;

	static int[] overheadTextAscents;

	static int[] overheadTextXOffsets;

	static int[] overheadTextColors;

	static int[] overheadTextEffects;

	static int[][] field614;

	static int[] overheadTextCyclesRemaining;

	static String[] overheadText;

	static int[][] tileLastDrawnActor;

	

	static int viewportDrawCount;

	

	static int viewportTempX;

	

	static int viewportTempY;

	

	static int mouseCrossX;

	

	static int mouseCrossY;

	

	static int mouseCrossState;

	

	static int mouseCrossColor;

	static boolean showMouseCross;

	
	static int field626;

	static boolean showLoadingMessages;

	static Player[] players;

	

	static int localPlayerIndex;

	
	static int field630;

	
	static long field631;

	static boolean field751;

	

	static int drawPlayerNames;

	
	static int field634;

	static int[] field635;

	static final int[] playerMenuOpcodes;

	static String[] playerMenuActions;

	static boolean[] playerOptionsPriorities;

	static int[] defaultRotations;

	

	static int combatTargetPlayerIndex;

	static NodeDeque[][][] groundItems;

	static NodeDeque pendingSpawns;

	static NodeDeque projectiles;

	static NodeDeque graphicsObjects;

	static int[] currentLevels;

	static int[] levels;

	static int[] experience;

	static boolean leftClickOpensMenu;

	static boolean isMenuOpen;

	

	static int menuOptionsCount;

	static int[] menuArguments1;

	static int[] menuArguments2;

	static int[] menuOpcodes;

	static int[] menuIdentifiers;

	static int[] menuItemIds;

	static String[] menuActions;

	static String[] menuTargets;

	static boolean[] menuShiftClick;

	static boolean followerOpsLowPriority;

	static boolean tapToDrop;

	static boolean showMouseOverText;

	

	static int viewportX;

	

	static int viewportY;

	
	static int field664;

	
	static int field665;

	

	static int isItemSelected;

	static boolean isSpellSelected;

	

	static int selectedSpellChildIndex;

	

	static int selectedSpellItemId;

	static String selectedSpellActionName;

	static String selectedSpellName;

	

	static int rootInterface;

	static NodeHashTable interfaceParents;

	
	static int field517;

	
	static int field613;

	

	static int chatEffects;

	static Widget meslayerContinueWidget;

	

	static int runEnergy;

	

	static int weight;

	

	static int staffModLevel;

	

	static int followerIndex;

	static boolean playerMod;

	static Widget viewportWidget;

	public static Widget clickedWidget;

	static Widget clickedWidgetParent;

	

	static int widgetClickX;

	

	static int widgetClickY;

	static Widget draggedOnWidget;

	static boolean field639;

	
	static int field534;

	
	static int field692;

	static boolean field693;

	
	static int field694;

	
	static int field735;

	static boolean isDraggingWidget;

	

	static int cycleCntr;

	static int[] changedVarps;

	

	static int changedVarpCount;

	static int[] changedItemContainers;

	
	static int field701;

	static int[] changedSkills;

	

	static int changedSkillsCount;

	static int[] field704;

	
	static int field705;

	

	static int chatCycle;

	
	static int field707;

	
	static int field766;

	
	static int field709;

	
	static int field690;

	
	static int field734;

	
	static int field712;

	
	static int field711;

	

	static int mouseWheelRotation;

	static class518 field715;

	static NodeDeque scriptEvents;

	static NodeDeque field717;

	static NodeDeque field710;

	static NodeDeque field742;

	static NodeHashTable widgetFlags;

	

	static int rootWidgetCount;

	
	static int field722;

	static boolean[] field723;

	static boolean[] field724;

	static boolean[] field743;

	static int[] rootWidgetXs;

	static int[] rootWidgetYs;

	static int[] rootWidgetWidths;

	static int[] rootWidgetHeights;

	

	static int gameDrawingMode;

	
	static long field731;

	static boolean isResizable;

	static int[] field577;

	

	static int publicChatMode;

	

	static int tradeChatMode;

	static String field736;

	static long[] crossWorldMessageIds;

	

	static int crossWorldMessageIdsIndex;

	static class211 field739;

	static class209 field740;

	
	static int field741;

	static int[] field676;

	static int[] field545;

	
	static long field744;

	static ClanSettings[] currentClanSettings;

	static ClanChannel[] currentClanChannels;

	
	static int field747;

	

	static int mapIconCount;

	static int[] mapIconXs;

	static int[] mapIconYs;

	static SpritePixels[] mapIcons;

	

	static int destinationX;

	

	static int destinationY;

	

	static int minimapState;

	

	static int currentTrackGroupId;

	static boolean playingJingle;

	

	static int soundEffectCount;

	static int[] soundEffectIds;

	static int[] queuedSoundEffectLoops;

	static int[] queuedSoundEffectDelays;

	static int[] soundLocations;

	static SoundEffect[] soundEffects;

	static boolean isCameraLocked;

	static boolean field764;

	String field708;

	class14 field546;

	class18 field644;

	OtlTokenRequester field548;

	Future field549;

	boolean field550 = false;

	class18 field551;

	RefreshAccessTokenRequester field552;

	Future field553;

	Buffer field746;

	class7 field652;

	
	long field560 = -1L;

	static {
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		renderSelf = false;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field761 = 0;
		js5Errors = 0;
		loginState = 0;
		field558 = 0;
		field782 = 0;
		field542 = 0;
		field677 = class138.field1608;
		field633 = class505.field5074;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte) var4;
			}
		}

		String var5 = Archive.method6690(var2, 0, var2.length);
		field502 = var5;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field579 = 0;
		field566 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field572 = 0;
		field573 = 1;
		field574 = 0;
		field580 = 1;
		field576 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field570 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		graphicsCycle = 0;
		field582 = 2301979;
		field583 = 5063219;
		field584 = 3353893;
		field799 = 7759444;
		field585 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field727 = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field596 = 0;
		field597 = 0;
		field598 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field601 = 0;
		field602 = false;
		field637 = 0;
		field604 = false;
		field605 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field614 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field626 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field630 = 0;
		field631 = -1L;
		field751 = true;
		drawPlayerNames = 0;
		field634 = 0;
		field635 = new int[1000];
		playerMenuOpcodes = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field664 = 0;
		field665 = 50;
		isItemSelected = 0;
		field667 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field517 = 0;
		field613 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field639 = false;
		field534 = -1;
		field692 = -1;
		field693 = false;
		field694 = -1;
		field735 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field701 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field704 = new int[32];
		field705 = 0;
		chatCycle = 0;
		field707 = 0;
		field766 = 0;
		field709 = 0;
		field690 = 0;
		field734 = 0;
		field712 = 0;
		field711 = 0;
		mouseWheelRotation = 0;
		field715 = new class518();
		scriptEvents = new NodeDeque();
		field717 = new NodeDeque();
		field710 = new NodeDeque();
		field742 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field722 = -2;
		field723 = new boolean[100];
		field724 = new boolean[100];
		field743 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field731 = 0L;
		isResizable = true;
		field577 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		publicChatMode = 0;
		tradeChatMode = 0;
		field736 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field739 = new class211();
		field740 = new class209();
		field741 = 0;
		field676 = new int[128];
		field545 = new int[128];
		field744 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field747 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field764 = false;
		field725 = false;
		field581 = false;
		field540 = null;
		field768 = null;
		field769 = null;
		field691 = false;
		field771 = new boolean[5];
		field772 = new int[5];
		field695 = new int[5];
		field774 = new int[5];
		field763 = new int[5];
		field776 = 256;
		field620 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field780 = 1;
		field781 = 32767;
		field591 = 1;
		field783 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field790 = -1;
		field791 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		archive5 = new class411(8, class409.field4549);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
		field606 = -1;
		field698 = -1;
		field800 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field767 = 0;
		field804 = new ApproximateRouteStrategy();
		field805 = new int[50];
		field806 = new int[50];
	}

	protected final void resizeGame() {
		field731 = BoundaryObject.method5027() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	protected final void setUp() {
		class168.method3400(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
		PcmPlayer.worldPort = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
		SecureRandomFuture.js5Port = gameBuild == 0 ? 443 : worldId + '썐';
		UserComparator8.currentPort = PcmPlayer.worldPort;
		WorldMapSection1.field3036 = class328.field3585;
		class13.field65 = class328.field3580;
		GrandExchangeEvent.field4312 = class328.field3582;
		class209.field2326 = class328.field3583;
		class47.urlRequester = new class112(this.field550, 214);
		this.setUpKeyboard();
		this.method529();
		SpriteMask.mouseWheel = this.mouseWheel();
		this.method469(field740, 0);
		this.method469(field739, 1);
		ClanChannelMember.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File,
				JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = FontName.getPreferencesFile("", GameBuild.field3841.name, false);
			byte[] var4 = new byte[(int) var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class10.clientPreferences = var3;
		this.setUpClipboard();
		class323.method5998(this, class136.field1591);
		HealthBar.setWindowedMode(class10.clientPreferences.method2456());
		ApproximateRouteStrategy.friendSystem = new FriendSystem(WorldMapScaleHandler.loginType);
		this.field546 = new class14("tokenRequest", 1, 1);
		if (!class304.field3388.contains(this)) {
			class304.field3388.add(this);
		}

		class135.field1579 = new class215[1];
		class213 var9 = class213.field2367;
		class135.field1579[0] = new class215(var9.field2375, var9.field2369);
	}

	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction) ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				int var5;
				try {
					label111: {
						if (class304.musicPlayerStatus == 1) {
							var5 = class304.midiPcmStream.method5737();
							if (var5 > 0 && class304.midiPcmStream.isReady()) {
								var5 -= class157.pcmSampleLength;
								if (var5 < 0) {
									var5 = 0;
								}

								class304.midiPcmStream.setPcmStreamVolume(var5);
								break label111;
							}

							class304.midiPcmStream.clear();
							class304.midiPcmStream.removeAll();
							class304.midiPcmStream.field3419.clear();
							if (UserComparator9.musicTrackArchive != null) {
								class304.musicPlayerStatus = 2;
							} else {
								class304.musicPlayerStatus = 0;
							}

							class237.musicTrack = null;
							class304.soundCache = null;
						}

						if (class304.field3385 > -1 && !class304.midiPcmStream.isReady()) {
							class409.method7687(class304.field3385, class304.field3395);
							class304.field3385 = -1;
							class304.field3395 = -1;
						}
					}
				} catch (Exception var8) {
					var8.printStackTrace();
					class304.midiPcmStream.clear();
					class304.musicPlayerStatus = 0;
					class237.musicTrack = null;
					class304.soundCache = null;
					UserComparator9.musicTrackArchive = null;
				}

				WorldMapSectionType.playPcmPlayers();
				field739.method4146();
				this.method540();
				synchronized (MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (SpriteMask.mouseWheel != null) {
					var5 = SpriteMask.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					class136.load();
					class125.method2918();
				} else if (gameState == 5) {
					class445.loginScreen(this, MouseHandler.fontPlain11, class404.fontPlain12);
					class136.load();
					class125.method2918();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class445.loginScreen(this, MouseHandler.fontPlain11, class404.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class445.loginScreen(this, MouseHandler.fontPlain11, class404.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						MouseHandler.method654();
					}
				} else {
					class445.loginScreen(this, MouseHandler.fontPlain11, class404.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int) var1.key, var1.data, false);
		}
	}

	protected final void draw(boolean var1) {
		boolean var2 = WorldMapSection2.method5104();
		if (var2 && playingJingle && MouseRecorder.pcmPlayer0 != null) {
			MouseRecorder.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field731 != 0L
				&& BoundaryObject.method5027() > field731) {
			HealthBar.setWindowedMode(class237.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field723[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
			} else if (gameState == 50) {
				InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
			} else if (gameState == 25) {
				if (field576 == 1) {
					if (field572 > field573) {
						field573 = field572;
					}

					var3 = (field573 * 50 - field572 * 50) / field573;
					AABB.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field576 == 2) {
					if (field574 > field580) {
						field580 = field574;
					}

					var3 = (field580 * 50 - field574 * 50) / field580 + 50;
					AABB.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					AABB.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				AABB.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				AABB.drawLoadingMessage("Please wait...", false);
			}
		} else {
			InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field724[var3]) {
					WorldMapSectionType.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3],
							rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field724[var3] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapSectionType.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field724[var3] = false;
			}
		}

	}

	protected final void kill0() {
		if (MouseHandler.varcs.hasUnwrittenChanges()) {
			MouseHandler.varcs.write();
		}

		if (class85.mouseRecorder != null) {
			class85.mouseRecorder.isRunning = false;
		}

		class85.mouseRecorder = null;
		packetWriter.close();
		class155.method3287();
		SpriteMask.mouseWheel = null;
		if (MouseRecorder.pcmPlayer0 != null) {
			MouseRecorder.pcmPlayer0.shutdown();
		}

		if (class290.pcmPlayer1 != null) {
			class290.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		NPCComposition.method3714();
		if (class47.urlRequester != null) {
			class47.urlRequester.close();
			class47.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var1 = 0; var1 < JagexCache.idxCount; ++var1) {
				WorldMapSection0.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var3) {
		}

		this.field546.method174();
	}

	protected final void vmethod1197() {
	}

	boolean method1201() {
		return PcmPlayer.field300 != null && !PcmPlayer.field300.trim().isEmpty() && class4.field8 != null
				&& !class4.field8.trim().isEmpty();
	}

	boolean method1202() {
		return WorldMapDecorationType.field3788 != null && !WorldMapDecorationType.field3788.trim().isEmpty()
				&& Ignored.field4610 != null && !Ignored.field4610.trim().isEmpty();
	}

	boolean method1509() {
		return this.field548 != null;
	}

	void method1204(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(MusicPatchNode2.field3380 + "shield/oauth/token" + (new class451(var2)).method8249());
		class407 var4 = new class407();
		var4.method7678(field502);
		var4.method7642("Host", (new URL(MusicPatchNode2.field3380)).getHost());
		var4.method7649(class448.field4717);
		class9 var5 = class9.field33;
		RefreshAccessTokenRequester var6 = this.field552;
		if (var6 != null) {
			this.field553 = var6.request(var5.method82(), var3, var4.method7641(), "");
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field550);
			this.field551 = this.field546.method173(var7);
		}
	}

	void method1369(String var1) throws IOException {
		URL var2 = new URL(MusicPatchNode2.field3380 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class407 var3 = new class407();
		var3.method7646(var1);
		class9 var4 = class9.field36;
		OtlTokenRequester var5 = this.field548;
		if (var5 != null) {
			this.field549 = var5.request(var4.method82(), var2, var3.method7641(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field550);
			this.field644 = this.field546.method173(var6);
		}
	}

	void method1206(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(MusicPatchNode2.field3380 + "/game-session/v1/tokens");
		class10 var4 = new class10(var3, class9.field33, this.field550);
		var4.method93().method7646(var1);
		var4.method93().method7649(class448.field4717);
		JSONObject var5 = new JSONObject();
		var5.method8392("accountId", var2);
		var4.method91(new class450(var5));
		this.field644 = this.field546.method173(var4);
	}

	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = BoundaryObject.method5027();
			int var4 = (int) (var2 - class19.field100);
			class19.field100 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0
					&& NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label240: {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200
								&& NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = (NetFileRequest) NetCache.NetCache_pendingPriorityWrites.first();
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium((int) var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						}

						while (NetCache.NetCache_pendingResponsesCount < 200
								&& NetCache.NetCache_pendingWritesCount > 0) {
							var5 = (NetFileRequest) NetCache.NetCache_pendingWritesQueue.removeLast();
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium((int) var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						}

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (ApproximateRouteStrategy.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field4278 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array,
										NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field4282 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4282;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer;
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (ApproximateRouteStrategy.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long) (var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest) NetCache.NetCache_pendingPriorityResponses
											.get(var13);
									class464.field4803 = true;
									if (var15 == null) {
										var15 = (NetFileRequest) NetCache.NetCache_pendingResponses.get(var13);
										class464.field4803 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									ApproximateRouteStrategy.NetCache_currentResponse = var15;
									ModeWhere.NetCache_responseArchiveBuffer = new Buffer(
											var12 + var16 + ApproximateRouteStrategy.NetCache_currentResponse.padding);
									ModeWhere.NetCache_responseArchiveBuffer.writeByte(var11);
									ModeWhere.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field4278 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field4278 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field4278 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										ApproximateRouteStrategy.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = ModeWhere.NetCache_responseArchiveBuffer.array.length
										- ApproximateRouteStrategy.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field4278;
								if (var9 > var8 - ModeWhere.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - ModeWhere.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(ModeWhere.NetCache_responseArchiveBuffer.array,
										ModeWhere.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field4282 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = ModeWhere.NetCache_responseArchiveBuffer.array;
										var10001 = ModeWhere.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4282;
									}
								}

								var24 = ModeWhere.NetCache_responseArchiveBuffer;
								var24.offset += var9;
								NetCache.field4278 += var9;
								if (var8 == ModeWhere.NetCache_responseArchiveBuffer.offset) {
									if (ApproximateRouteStrategy.NetCache_currentResponse.key == 16711935L) {
										class411.field4561 = ModeWhere.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												Fonts.method8576(var19, var10);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(ModeWhere.NetCache_responseArchiveBuffer.array, 0,
												var8);
										var10 = (int) NetCache.NetCache_crc.getValue();
										if (var10 != ApproximateRouteStrategy.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var22) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field4282 = (byte) ((int) (Math.random() * 255.0 + 1.0));
											var1 = false;
											break label240;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										ApproximateRouteStrategy.NetCache_currentResponse.archive.write(
												(int) (ApproximateRouteStrategy.NetCache_currentResponse.key & 65535L),
												ModeWhere.NetCache_responseArchiveBuffer.array,
												16711680L == (ApproximateRouteStrategy.NetCache_currentResponse.key
														& 16711680L),
												class464.field4803);
									}

									ApproximateRouteStrategy.NetCache_currentResponse.remove();
									if (class464.field4803) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field4278 = 0;
									ApproximateRouteStrategy.NetCache_currentResponse = null;
									ModeWhere.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field4278 != 512) {
										break;
									}

									NetCache.field4278 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var21) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			UserComparator8.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					UserComparator8.updateGameState(1000);
					return;
				}

				field761 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field761 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class19.js5SocketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost,
								UserComparator8.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class19.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class19.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class217.js5Socket = ItemLayer.method4271((Socket) class19.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(214);
						class217.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class183.field1893 = BoundaryObject.method5027();
					}

					if (js5ConnectState == 3) {
						if (class217.js5Socket.available() > 0) {
							int var2 = class217.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (BoundaryObject.method5027() - class183.field1893 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractByteArrayCopier.method6553(class217.js5Socket, gameState > 20);
						class19.js5SocketTask = null;
						class217.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	void js5Error(int var1) {
		class19.js5SocketTask = null;
		class217.js5Socket = null;
		js5ConnectState = 0;
		if (UserComparator8.currentPort == PcmPlayer.worldPort) {
			UserComparator8.currentPort = SecureRandomFuture.js5Port;
		} else {
			UserComparator8.currentPort = PcmPlayer.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				UserComparator8.updateGameState(1000);
			} else {
				field761 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			UserComparator8.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				UserComparator8.updateGameState(1000);
			} else {
				field761 = 3000;
			}
		}

	}

	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class137.field1603 == null && (secureRandomFuture.isDone() || field558 > 250)) {
					class137.field1603 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class137.field1603 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					Interpreter.field858 = null;
					hadNetworkError = false;
					field558 = 0;
					if (field633.method9212()) {
						if (this.method1201()) {
							try {
								this.method1204(class4.field8);
								class347.method6613(21);
							} catch (Throwable var25) {
								class260.RunException_sendStackTrace((String) null, var25);
								WorldMapSprite.getLoginError(65);
								return;
							}
						} else {
							if (!this.method1202()) {
								WorldMapSprite.getLoginError(65);
								return;
							}

							try {
								this.method1206(WorldMapDecorationType.field3788, Ignored.field4610);
								class347.method6613(20);
							} catch (Exception var24) {
								class260.RunException_sendStackTrace((String) null, var24);
								WorldMapSprite.getLoginError(65);
								return;
							}
						}
					} else {
						class347.method6613(1);
					}
				}
			}

			class20 var27;
			if (loginState == 21) {
				if (this.field553 != null) {
					if (!this.field553.isDone()) {
						return;
					}

					if (this.field553.isCancelled()) {
						WorldMapSprite.getLoginError(65);
						this.field553 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse) this.field553.get();
						if (!var3.isSuccess()) {
							WorldMapSprite.getLoginError(65);
							this.field553 = null;
							return;
						}

						PcmPlayer.field300 = var3.getAccessToken();
						class4.field8 = var3.getRefreshToken();
						this.field553 = null;
					} catch (Exception var23) {
						class260.RunException_sendStackTrace((String) null, var23);
						WorldMapSprite.getLoginError(65);
						this.field553 = null;
						return;
					}
				} else {
					if (this.field551 == null) {
						WorldMapSprite.getLoginError(65);
						return;
					}

					if (!this.field551.method275()) {
						return;
					}

					if (this.field551.method280()) {
						class260.RunException_sendStackTrace(this.field551.method274(), (Throwable) null);
						WorldMapSprite.getLoginError(65);
						this.field551 = null;
						return;
					}

					var27 = this.field551.method276();
					if (var27.method299() != 200) {
						WorldMapSprite.getLoginError(65);
						this.field551 = null;
						return;
					}

					field558 = 0;
					class450 var4 = new class450(var27.method302());

					try {
						PcmPlayer.field300 = var4.method8238().getString("access_token");
						class4.field8 = var4.method8238().getString("refresh_token");
					} catch (Exception var22) {
						class260.RunException_sendStackTrace("Error parsing tokens", var22);
						WorldMapSprite.getLoginError(65);
						this.field551 = null;
						return;
					}
				}

				this.method1369(PcmPlayer.field300);
				class347.method6613(20);
			}

			if (loginState == 20) {
				if (this.field549 != null) {
					if (!this.field549.isDone()) {
						return;
					}

					if (this.field549.isCancelled()) {
						WorldMapSprite.getLoginError(65);
						this.field549 = null;
						return;
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse) this.field549.get();
						if (!var28.isSuccess()) {
							WorldMapSprite.getLoginError(65);
							this.field549 = null;
							return;
						}

						this.field708 = var28.getToken();
						this.field549 = null;
					} catch (Exception var21) {
						class260.RunException_sendStackTrace((String) null, var21);
						WorldMapSprite.getLoginError(65);
						this.field549 = null;
						return;
					}
				} else {
					if (this.field644 == null) {
						WorldMapSprite.getLoginError(65);
						return;
					}

					if (!this.field644.method275()) {
						return;
					}

					if (this.field644.method280()) {
						class260.RunException_sendStackTrace(this.field644.method274(), (Throwable) null);
						WorldMapSprite.getLoginError(65);
						this.field644 = null;
						return;
					}

					var27 = this.field644.method276();
					if (var27.method299() != 200) {
						class260.RunException_sendStackTrace(
								"Response code: " + var27.method299() + "Response body: " + var27.method302(),
								(Throwable) null);
						WorldMapSprite.getLoginError(65);
						this.field644 = null;
						return;
					}

					List var30 = (List) var27.method298().get("Content-Type");
					if (var30 != null && var30.contains(class448.field4717.method8223())) {
						try {
							JSONObject var5 = new JSONObject(var27.method302());
							this.field708 = var5.getString("token");
						} catch (JSONException var20) {
							class260.RunException_sendStackTrace((String) null, var20);
							WorldMapSprite.getLoginError(65);
							this.field644 = null;
							return;
						}
					} else {
						this.field708 = var27.method302();
					}

					this.field644 = null;
				}

				field558 = 0;
				class347.method6613(1);
			}

			if (loginState == 1) {
				if (Interpreter.field858 == null) {
					Interpreter.field858 = GameEngine.taskHandler.newSocketTask(class17.worldHost,
							UserComparator8.currentPort);
				}

				if (Interpreter.field858.status == 2) {
					throw new IOException();
				}

				if (Interpreter.field858.status == 1) {
					var1 = ItemLayer.method4271((Socket) Interpreter.field858.result, 40000, 5000);
					packetWriter.setSocket(var1);
					Interpreter.field858 = null;
					class347.method6613(2);
				}
			}

			PacketBufferNode var29;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var29 = EnumComposition.method3666();
				var29.packetBuffer.writeByte(LoginPacket.field3342.id);
				packetWriter.addNode(var29);
				packetWriter.flush();
				var2.offset = 0;
				class347.method6613(3);
			}

			int var13;
			if (loginState == 3) {
				if (MouseRecorder.pcmPlayer0 != null) {
					MouseRecorder.pcmPlayer0.method748();
				}

				if (class290.pcmPlayer1 != null) {
					class290.pcmPlayer1.method748();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (MouseRecorder.pcmPlayer0 != null) {
						MouseRecorder.pcmPlayer0.method748();
					}

					if (class290.pcmPlayer1 != null) {
						class290.pcmPlayer1.method748();
					}

					if (var13 != 0) {
						WorldMapSprite.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class347.method6613(4);
				}
			}

			if (loginState == 4) {
				if (var2.offset < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					MusicPatchNode.field3475 = var2.readLong();
					class347.method6613(5);
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var32 = new int[] { class137.field1603.nextInt(), class137.field1603.nextInt(),
						class137.field1603.nextInt(), class137.field1603.nextInt() };
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var32[0]);
				var31.writeInt(var32[1]);
				var31.writeInt(var32[2]);
				var31.writeInt(var32[3]);
				var31.writeLong(MusicPatchNode.field3475);
				if (gameState == 40) {
					var31.writeInt(FloorOverlayDefinition.field2268[0]);
					var31.writeInt(FloorOverlayDefinition.field2268[1]);
					var31.writeInt(FloorOverlayDefinition.field2268[2]);
					var31.writeInt(FloorOverlayDefinition.field2268[3]);
				} else {
					if (gameState == 50) {
						var31.writeByte(class138.field1610.rsOrdinal());
						var31.writeInt(GameObject.field2850);
					} else {
						var31.writeByte(field677.rsOrdinal());
						switch (field677.field1611) {
						case 0:
						case 4:
							var31.writeMedium(class322.field3521);
							++var31.offset;
							break;
						case 1:
							var31.writeInt(class10.clientPreferences.method2459(Login.Login_username));
							break;
						case 2:
							var31.offset += 4;
						case 3:
						}
					}

					if (field633.method9212()) {
						var31.writeByte(class505.field5073.rsOrdinal());
						var31.writeStringCp1252NullTerminated(this.field708);
					} else {
						var31.writeByte(class505.field5074.rsOrdinal());
						var31.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var31.encryptRsa(class74.field913, class74.field907);
				FloorOverlayDefinition.field2268 = var32;
				PacketBufferNode var35 = EnumComposition.method3666();
				var35.packetBuffer.offset = 0;
				if (gameState == 40) {
					var35.packetBuffer.writeByte(LoginPacket.field3344.id);
				} else {
					var35.packetBuffer.writeByte(LoginPacket.field3343.id);
				}

				var35.packetBuffer.writeShort(0);
				var6 = var35.packetBuffer.offset;
				var35.packetBuffer.writeInt(214);
				var35.packetBuffer.writeInt(1);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeByte(field510);
				byte var7 = 0;
				var35.packetBuffer.writeByte(var7);
				var35.packetBuffer.writeBytes(var31.array, 0, var31.offset);
				int var8 = var35.packetBuffer.offset;
				var35.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var35.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var35.packetBuffer.writeShort(class448.canvasWidth);
				var35.packetBuffer.writeShort(WorldMapID.canvasHeight);
				PacketBuffer var9 = var35.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = WorldMapCacheName.method5532();
					var9.writeBytes(var10, 0, var10.length);
				}

				var35.packetBuffer.writeStringCp1252NullTerminated(class443.field4710);
				var35.packetBuffer.writeInt(class156.field1726);
				if (field512 > 213) {
					var35.packetBuffer.writeByte(0);
				}

				Buffer var43 = new Buffer(ChatChannel.platformInfo.size());
				ChatChannel.platformInfo.write(var43);
				var35.packetBuffer.writeBytes(var43.array, 0, var43.array.length);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeInt(0);
				var35.packetBuffer.writeInt(Language.archive17.hash);
				var35.packetBuffer.writeIntIME(class180.archive8.hash);
				var35.packetBuffer.writeIntME(0);
				var35.packetBuffer.writeInt(ViewportMouse.field2770.hash);
				var35.packetBuffer.writeIntLE(class291.archive20.hash);
				var35.packetBuffer.writeInt(class17.archive15.hash);
				var35.packetBuffer.writeInt(class53.archive10.hash);
				var35.packetBuffer.writeIntIME(BuddyRankComparator.archive4.hash);
				var35.packetBuffer.writeIntME(Language.field4347.hash);
				var35.packetBuffer.writeIntIME(class350.archive18.hash);
				var35.packetBuffer.writeInt(MouseRecorder.archive2.hash);
				var35.packetBuffer.writeInt(class466.field4812.hash);
				var35.packetBuffer.writeIntLE(class310.archive13.hash);
				var35.packetBuffer.writeIntIME(Actor.archive7.hash);
				var35.packetBuffer.writeInt(ReflectionCheck.archive6.hash);
				var35.packetBuffer.writeIntIME(class33.archive12.hash);
				var35.packetBuffer.writeIntLE(FontName.archive11.hash);
				var35.packetBuffer.writeInt(GrandExchangeOffer.archive14.hash);
				var35.packetBuffer.writeIntIME(ChatChannel.archive19.hash);
				var35.packetBuffer.writeIntME(LoginScreenAnimation.field1244.hash);
				var35.packetBuffer.writeIntIME(class305.archive9.hash);
				var35.packetBuffer.xteaEncrypt(var32, var8, var35.packetBuffer.offset);
				var35.packetBuffer.writeLengthShort(var35.packetBuffer.offset - var6);
				packetWriter.addNode(var35);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var32);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var32[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class347.method6613(6);
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					class112.field1401 = var14 == 1 && var1.readUnsignedByte() == 1;
					class347.method6613(5);
				}

				if (var13 == 21 && gameState == 20) {
					class347.method6613(12);
				} else if (var13 == 2) {
					class347.method6613(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class347.method6613(19);
				} else if (var13 == 64) {
					class347.method6613(10);
				} else if (var13 == 23 && field782 < 1) {
					++field782;
					class347.method6613(0);
				} else if (var13 == 29) {
					class347.method6613(17);
				} else {
					if (var13 != 69) {
						WorldMapSprite.getLoginError(var13);
						return;
					}

					class347.method6613(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class134.field1570 = var2.readUnsignedShort();
				class347.method6613(8);
			}

			if (loginState == 8 && var1.available() >= class134.field1570) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class134.field1570);
				class6[] var33 = new class6[] { class6.field17 };
				class6 var34 = var33[var2.readUnsignedByte()];

				try {
					switch (var34.field15) {
					case 0:
						class0 var37 = new class0();
						this.field652 = new class7(var2, var37);
						class347.method6613(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					WorldMapSprite.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field652.method37()) {
				this.field746 = this.field652.method40();
				this.field652.method50();
				this.field652 = null;
				if (this.field746 == null) {
					WorldMapSprite.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var29 = EnumComposition.method3666();
				var29.packetBuffer.writeByte(LoginPacket.field3345.id);
				var29.packetBuffer.writeShort(this.field746.offset);
				var29.packetBuffer.writeBuffer(this.field746);
				packetWriter.addNode(var29);
				packetWriter.flush();
				this.field746 = null;
				class347.method6613(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				Varcs.field1366 = var1.readUnsignedByte();
				class347.method6613(11);
			}

			if (loginState == 11 && var1.available() >= Varcs.field1366) {
				var1.read(var2.array, 0, Varcs.field1366);
				var2.offset = 0;
				class347.method6613(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field542 = (var1.readUnsignedByte() + 3) * 60;
				class347.method6613(13);
			}

			if (loginState == 13) {
				field558 = 0;
				class478.setLoginResponseString("You have only just left another world.",
						"Your profile will be transferred in:", field542 / 60 + " seconds.");
				if (--field542 <= 0) {
					class347.method6613(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					class323.field3524 = var1.readUnsignedByte();
					class347.method6613(15);
				}

				if (loginState == 15 && var1.available() >= class323.field3524) {
					boolean var45 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var44 = false;
					if (var45) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class10.clientPreferences.method2457(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class10.clientPreferences.method2432(Login.Login_username);
					} else {
						class10.clientPreferences.method2432((String) null);
					}

					class100.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field630 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.field560 = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					field631 = var2.readLong();
					if (field512 >= 214) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						var2.readLong();
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var40 = class260.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var40.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var40[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method378(class347.client, "zap");
					} catch (Throwable var18) {
					}

					class347.method6613(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class394.field4443 = var2.readUnsignedShort();
						class347.method6613(18);
					}

					if (loginState == 18 && var1.available() >= class394.field4443) {
						var2.offset = 0;
						var1.read(var2.array, 0, class394.field4443);
						var2.offset = 0;
						String var42 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated();
						String var41 = var2.readStringCp1252NullTerminated();
						class478.setLoginResponseString(var42, var38, var41);
						UserComparator8.updateGameState(10);
						if (field633.method9212()) {
							class390.method7249(9);
						}
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (var1.available() >= packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method7625();
							PendingSpawn.method2350();
							ClanSettings.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field558;
						if (field558 > 2000) {
							if (field782 < 1) {
								if (PcmPlayer.worldPort == UserComparator8.currentPort) {
									UserComparator8.currentPort = SecureRandomFuture.js5Port;
								} else {
									UserComparator8.currentPort = PcmPlayer.worldPort;
								}

								++field782;
								class347.method6613(0);
							} else {
								WorldMapSprite.getLoginError(-3);
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7610();
						mouseLastLastPressedTimeMillis = 1L;
						class85.mouseRecorder.index = 0;
						class31.hasFocus = true;
						hadFocus = true;
						field744 = -1L;
						class14.method186();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1390 = null;
						packetWriter.field1393 = null;
						packetWriter.field1392 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1388 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						Player.method2340();
						MouseHandler.MouseHandler_idleCycles = 0;
						Messages.Messages_channels.clear();
						Messages.Messages_hashTable.clear();
						Messages.Messages_queue.clear();
						Messages.Messages_count = 0;
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class30.field152 = null;
						minimapState = 0;
						field747 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						MouseRecorder.method2260();

						for (var13 = 0; var13 < 2048; ++var13) {
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) {
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var13 = 0; var13 < 4; ++var13) {
							for (var14 = 0; var14 < 104; ++var14) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var13][var14][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						ApproximateRouteStrategy.friendSystem.clear();

						for (var13 = 0; var13 < VarpDefinition.field1903; ++var13) {
							VarpDefinition var36 = class100.VarpDefinition_get(var13);
							if (var36 != null) {
								Varps.Varps_temp[var13] = 0;
								Varps.Varps_main[var13] = 0;
							}
						}

						MouseHandler.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							class294.method5664(rootInterface);
						}

						for (InterfaceParent var39 = (InterfaceParent) interfaceParents
								.first(); var39 != null; var39 = (InterfaceParent) interfaceParents.next()) {
							SoundCache.closeInterface(var39, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						Player.method2340();
						playerAppearance.method6011((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);

						for (var13 = 0; var13 < 8; ++var13) {
							playerMenuActions[var13] = null;
							playerOptionsPriorities[var13] = false;
						}

						class6.method36();
						isLoading = true;

						for (var13 = 0; var13 < 100; ++var13) {
							field723[var13] = true;
						}

						var29 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING,
								packetWriter.isaacCipher);
						var29.packetBuffer.writeByte(class237.getWindowedMode());
						var29.packetBuffer.writeShort(class448.canvasWidth);
						var29.packetBuffer.writeShort(WorldMapID.canvasHeight);
						packetWriter.addNode(var29);
						class406.friendsChat = null;
						class389.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object) null);
						VerticalAlignment.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object) null);

						for (var13 = 0; var13 < 8; ++var13) {
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = null;
						ClanSettings.updatePlayer(var2);
						class208.field2314 = -1;
						class19.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var26) {
			if (field782 < 1) {
				if (PcmPlayer.worldPort == UserComparator8.currentPort) {
					UserComparator8.currentPort = SecureRandomFuture.js5Port;
				} else {
					UserComparator8.currentPort = PcmPlayer.worldPort;
				}

				++field782;
				class347.method6613(0);
			} else {
				WorldMapSprite.getLoginError(-2);
			}
		}
	}

	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Interpreter.method2034();
		} else {
			if (!isMenuOpen) {
				class442.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck) class36.reflectionChecks.last();
					boolean var29;
					if (var2 == null) {
						var29 = false;
					} else {
						var29 = true;
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4499) {
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS,
									packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method7617();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						PacketBuffer var10000;
						synchronized (class85.mouseRecorder.lock) {
							if (!field522) {
								class85.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class85.mouseRecorder.index >= 40) {
								var30 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class85.mouseRecorder.index
										&& (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class85.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class85.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field519 || var8 != field520) {
										if (var30 == null) {
											var30 = ObjectComposition.getPacketBufferNode(ClientPacket.field3170,
													packetWriter.isaacCipher);
											var30.packetBuffer.writeByte(0);
											var3 = var30.packetBuffer.offset;
											var10000 = var30.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										int var12;
										if (field571 != -1L) {
											var10 = var9 - field519;
											var11 = var8 - field520;
											var12 = (int) ((class85.mouseRecorder.millis[var7] - field571) / 20L);
											var5 = (int) ((long) var5
													+ (class85.mouseRecorder.millis[var7] - field571) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field519 = var9;
										field520 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128
												&& var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var30.packetBuffer.writeByte(var12 + 128);
											var30.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var30.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + '\ue000');
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field571 = class85.mouseRecorder.millis[var7];
									}
								}

								if (var30 != null) {
									var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
									var7 = var30.packetBuffer.offset;
									var30.packetBuffer.offset = var3;
									var30.packetBuffer.writeByte(var5 / var6);
									var30.packetBuffer.writeByte(var5 % var6);
									var30.packetBuffer.offset = var7;
									packetWriter.addNode(var30);
								}

								if (var4 >= class85.mouseRecorder.index) {
									class85.mouseRecorder.index = 0;
								} else {
									MouseRecorder var52 = class85.mouseRecorder;
									var52.index -= var4;
									System.arraycopy(class85.mouseRecorder.xs, var4, class85.mouseRecorder.xs, 0,
											class85.mouseRecorder.index);
									System.arraycopy(class85.mouseRecorder.ys, var4, class85.mouseRecorder.ys, 0,
											class85.mouseRecorder.index);
									System.arraycopy(class85.mouseRecorder.millis, var4, class85.mouseRecorder.millis,
											0, class85.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1
								|| !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4
								|| MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis
									- mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > WorldMapID.canvasHeight) {
								var3 = WorldMapID.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class448.canvasWidth) {
								var4 = class448.canvasWidth;
							}

							var5 = (int) var16;
							var18 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK,
									packetWriter.isaacCipher);
							var18.packetBuffer
									.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (field739.field2338 > 0) {
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD,
									packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = BoundaryObject.method5027();

							for (var5 = 0; var5 < field739.field2338; ++var5) {
								long var21 = var19 - field744;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field744 = var19;
								var14.packetBuffer.writeByteNeg(field739.field2339[var5]);
								var14.packetBuffer.writeMediumLE((int) var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field637 > 0) {
							--field637;
						}

						if (field739.method4134(96) || field739.method4134(97) || field739.method4134(98)
								|| field739.method4134(99)) {
							field604 = true;
						}

						if (field604 && field637 <= 0) {
							field637 = 20;
							field604 = false;
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION,
									packetWriter.isaacCipher);
							var14.packetBuffer.writeShortAddLE(camAngleX);
							var14.packetBuffer.writeShortAdd(camAngleY);
							packetWriter.addNode(var14);
						}

						if (class31.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS,
									packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class31.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS,
									packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ScriptFrame.worldMap != null) {
							ScriptFrame.worldMap.method8387();
						}

						class448.method8227();
						if (class155.field1722) {
							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								Player var31 = players[Players.Players_indices[var1]];
								var31.method2290();
							}

							class155.field1722 = false;
						}

						PlatformInfo.method8309();
						if (gameState != 30) {
							return;
						}

						for (PendingSpawn var36 = (PendingSpawn) pendingSpawns
								.last(); var36 != null; var36 = (PendingSpawn) pendingSpawns.previous()) {
							if (var36.hitpoints > 0) {
								--var36.hitpoints;
							}

							ObjectComposition var23;
							boolean var37;
							if (var36.hitpoints == 0) {
								if (var36.objectId >= 0) {
									var3 = var36.objectId;
									var4 = var36.field1133;
									var23 = class175.getObjectDefinition(var3);
									if (var4 == 11) {
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) {
										var4 = 4;
									}

									var37 = var23.method3908(var4);
									if (!var37) {
										continue;
									}
								}

								class251.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y,
										var36.objectId, var36.field1140, var36.field1133, var36.field1143);
								var36.remove();
							} else {
								if (var36.delay > 0) {
									--var36.delay;
								}

								if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102
										&& var36.y <= 102) {
									if (var36.field1148 >= 0) {
										var3 = var36.field1148;
										var4 = var36.field1142;
										var23 = class175.getObjectDefinition(var3);
										if (var4 == 11) {
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) {
											var4 = 4;
										}

										var37 = var23.method3908(var4);
										if (!var37) {
											continue;
										}
									}

									class251.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y,
											var36.field1148, var36.field1141, var36.field1142, var36.field1143);
									var36.delay = -1;
									if (var36.field1148 == var36.objectId && var36.objectId == -1) {
										var36.remove();
									} else if (var36.field1148 == var36.objectId && var36.field1140 == var36.field1141
											&& var36.field1133 == var36.field1142) {
										var36.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var32 = soundEffects[var1];
								if (var32 == null) {
									var10000 = null;
									var32 = SoundEffect.readSoundEffect(LoginScreenAnimation.field1244,
											soundEffectIds[var1], 0);
									if (var32 == null) {
										continue;
									}

									int[] var53 = queuedSoundEffectDelays;
									var53[var1] += var32.calculateDelay();
									soundEffects[var1] = var32;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - Projectile.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - Projectile.localPlayer.y;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = var6 + var8 - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = (var4 - var9) * class10.clientPreferences.method2450() / var4;
									} else {
										var3 = class10.clientPreferences.method2445();
									}

									if (var3 > 0) {
										RawSound var24 = var32.toRawSound().resample(FloorOverlayDefinition.decimator);
										RawPcmStream var41 = RawPcmStream.createRawPcmStream(var24, 100, var3);
										var41.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										KitDefinition.pcmStreamMixer.addSubStream(var41);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (playingJingle) {
							if (class304.musicPlayerStatus != 0) {
								var29 = true;
							} else {
								var29 = class304.midiPcmStream.isReady();
							}

							if (!var29) {
								if (class10.clientPreferences.method2488() != 0 && currentTrackGroupId != -1) {
									class368.method6892(ReflectionCheck.archive6, currentTrackGroupId, 0,
											class10.clientPreferences.method2488(), false);
								}

								playingJingle = false;
							}
						}

						++packetWriter.field1388;
						if (packetWriter.field1388 > 750) {
							Interpreter.method2034();
							return;
						}

						var1 = Players.Players_count;
						int[] var33 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var43 = players[var33[var3]];
							if (var43 != null) {
								class298.updateActorSequence(var43, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var25 = npcs[var15];
							if (var25 != null) {
								class298.updateActorSequence(var25, var25.definition.size);
							}
						}

						class1.method3();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var38 = ClanChannel.mousedOverWidgetIf1;
						Widget var34 = class19.field99;
						ClanChannel.mousedOverWidgetIf1 = null;
						class19.field99 = null;
						draggedOnWidget = null;
						field693 = false;
						field639 = false;
						field741 = 0;

						while (field739.method4133() && field741 < 128) {
							if (staffModLevel >= 2 && field739.method4134(82) && field739.field2349 == 66) {
								StringBuilder var45 = new StringBuilder();

								Message var39;
								for (Iterator var42 = Messages.Messages_hashTable.iterator(); var42.hasNext(); var45
										.append(var39.text).append('\n')) {
									var39 = (Message) var42.next();
									if (var39.sender != null && !var39.sender.isEmpty()) {
										var45.append(var39.sender).append(':');
									}
								}

								String var47 = var45.toString();
								class347.client.method465(var47);
							} else if (oculusOrbState != 1 || field739.field2348 <= 0) {
								field545[field741] = field739.field2349;
								field676[field741] = field739.field2348;
								++field741;
							}
						}

						if (RouteStrategy.method4214() && field739.method4134(82) && field739.method4134(81)
								&& mouseWheelRotation != 0) {
							var3 = Projectile.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != Projectile.localPlayer.plane) {
								var4 = Projectile.localPlayer.pathX[0] + class213.baseX * 64;
								var5 = Projectile.localPlayer.pathY[0] + class101.baseY * 64;
								var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field3182,
										packetWriter.isaacCipher);
								var18.packetBuffer.writeShortLE(var5);
								var18.packetBuffer.writeByte(var3);
								var18.packetBuffer.writeShortAddLE(var4);
								var18.packetBuffer.writeIntIME(0);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (MouseHandler.MouseHandler_lastButton == 1) {
							field740.method4102();
						}

						if (rootInterface != -1) {
							RouteStrategy.updateRootInterface(rootInterface, 0, 0, class448.canvasWidth,
									WorldMapID.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var44;
							Widget var46;
							ScriptEvent var49;
							do {
								var49 = (ScriptEvent) field717.removeLast();
								if (var49 == null) {
									while (true) {
										do {
											var49 = (ScriptEvent) field710.removeLast();
											if (var49 == null) {
												while (true) {
													do {
														var49 = (ScriptEvent) scriptEvents.removeLast();
														if (var49 == null) {
															while (true) {
																while (true) {
																	class210 var51;
																	do {
																		do {
																			do {
																				var51 = (class210) field742
																						.removeLast();
																				if (var51 == null) {
																					this.menu();
																					InterfaceParent.method2243();
																					if (clickedWidget != null) {
																						this.method1508();
																					}

																					if (Scene.shouldSendWalk()) {
																						var3 = Scene.Scene_selectedX;
																						var4 = Scene.Scene_selectedY;
																						PacketBufferNode var48 = ObjectComposition
																								.getPacketBufferNode(
																										ClientPacket.MOVE_GAMECLICK,
																										packetWriter.isaacCipher);
																						var48.packetBuffer.writeByte(5);
																						var48.packetBuffer.writeByteNeg(
																								field739.method4134(
																										82) ? (field739.method4134(81) ? 2 : 1) : 0);
																						var48.packetBuffer.writeShort(
																								class213.baseX * 64
																										+ var3);
																						var48.packetBuffer
																								.writeShortAddLE(
																										class101.baseY
																												* 64
																												+ var4);
																						packetWriter.addNode(var48);
																						Scene.method4554();
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																						mouseCrossColor = 1;
																						mouseCrossState = 0;
																						destinationX = var3;
																						destinationY = var4;
																					}

																					if (var38 != ClanChannel.mousedOverWidgetIf1) {
																						if (var38 != null) {
																							Messages.invalidateWidget(
																									var38);
																						}

																						if (ClanChannel.mousedOverWidgetIf1 != null) {
																							Messages.invalidateWidget(
																									ClanChannel.mousedOverWidgetIf1);
																						}
																					}

																					if (var34 != class19.field99
																							&& field664 == field665) {
																						if (var34 != null) {
																							Messages.invalidateWidget(
																									var34);
																						}

																						if (class19.field99 != null) {
																							Messages.invalidateWidget(
																									class19.field99);
																						}
																					}

																					if (class19.field99 != null) {
																						if (field664 < field665) {
																							++field664;
																							if (field665 == field664) {
																								Messages.invalidateWidget(
																										class19.field99);
																							}
																						}
																					} else if (field664 > 0) {
																						--field664;
																					}

																					HealthBar.method2549();
																					if (field691) {
																						class408.method7686();
																					} else if (isCameraLocked) {
																						if (!field764) {
																							var3 = class126.field1469
																									* 128 + 64;
																							var4 = class217.field2401
																									* 128 + 64;
																							var5 = Renderable
																									.getTileHeight(var3,
																											var4,
																											Clock.Client_plane)
																									- class85.field1044;
																							ApproximateRouteStrategy
																									.method1186(var3,
																											var5, var4);
																						} else if (field540 != null) {
																							class208.cameraX = field540
																									.vmethod8351();
																							ByteArrayPool.cameraZ = field540
																									.vmethod8348();
																							if (field581) {
																								class152.cameraY = field540
																										.vmethod8347();
																							} else {
																								class152.cameraY = Renderable
																										.getTileHeight(
																												class208.cameraX,
																												ByteArrayPool.cameraZ,
																												Clock.Client_plane)
																										- field540
																												.vmethod8347();
																							}

																							field540.method8359();
																						}

																						if (!field725) {
																							var3 = HealthBarUpdate.field1233
																									* 128 + 64;
																							var4 = class137.field1605
																									* 16384 + 64;
																							var5 = Renderable
																									.getTileHeight(var3,
																											var4,
																											Clock.Client_plane)
																									- HitSplatDefinition.field2142;
																							var6 = var3
																									- class208.cameraX;
																							var7 = var5
																									- class152.cameraY;
																							var8 = var4
																									- ByteArrayPool.cameraZ;
																							var9 = (int) Math
																									.sqrt((double) (var8
																											* var8
																											+ var6 * var6));
																							var10 = (int) (Math.atan2(
																									(double) var7,
																									(double) var9)
																									* 325.9490051269531)
																									& 2047;
																							var11 = (int) (Math.atan2(
																									(double) var6,
																									(double) var8)
																									* -325.9490051269531)
																									& 2047;
																							InvDefinition.method3561(
																									var10, var11);
																						} else {
																							if (field769 != null) {
																								MusicPatchNode.cameraPitch = field769
																										.method8343();
																								MusicPatchNode.cameraPitch = Math
																										.min(Math.max(
																												MusicPatchNode.cameraPitch,
																												128),
																												383);
																								field769.method8359();
																							}

																							if (field768 != null) {
																								class291.cameraYaw = field768
																										.method8343()
																										& 2047;
																								field768.method8359();
																							}
																						}
																					}

																					for (var3 = 0; var3 < 5; ++var3) {
																						var10002 = field763[var3]++;
																					}

																					MouseHandler.varcs.tryWrite();
																					var3 = MenuAction.method2055();
																					var4 = GameEngine.keyHandler
																							.method348();
																					if (var3 > 15000 && var4 > 15000) {
																						logoutTimer = 250;
																						MouseHandler.MouseHandler_idleCycles = 14500;
																						var18 = ObjectComposition
																								.getPacketBufferNode(
																										ClientPacket.EVENT_MOUSE_IDLE,
																										packetWriter.isaacCipher);
																						packetWriter.addNode(var18);
																					}

																					ApproximateRouteStrategy.friendSystem
																							.processFriendUpdates();
																					WorldMapEvent.method5599();
																					++packetWriter.pendingWrites;
																					if (packetWriter.pendingWrites > 50) {
																						var18 = ObjectComposition
																								.getPacketBufferNode(
																										ClientPacket.NO_TIMEOUT,
																										packetWriter.isaacCipher);
																						packetWriter.addNode(var18);
																					}

																					try {
																						packetWriter.flush();
																					} catch (IOException var27) {
																						Interpreter.method2034();
																					}

																					return;
																				}
																			} while (var51 == null);
																		} while (var51.field2332 == null);

																		if (var51.field2332.childIndex < 0) {
																			break;
																		}

																		var46 = FriendSystem
																				.getWidget(var51.field2332.parentId);
																	} while (var46 == null || var46.children == null
																			|| var46.children.length == 0
																			|| var51.field2332.childIndex >= var46.children.length
																			|| var51.field2332 != var46.children[var51.field2332.childIndex]);

																	if (var51.field2332.type == 11
																			&& var51.field2331 == 0) {
																		if (var51.field2332.method6369(var51.field2335,
																				var51.field2330, 0, 0)) {
																			switch (var51.field2332.method6373()) {
																			case 0:
																				class27.openURL(
																						var51.field2332.method6375(),
																						true, false);
																				break;
																			case 1:
																				var5 = StudioGame.getWidgetFlags(
																						var51.field2332);
																				boolean var35 = (var5 >> 22 & 1) != 0;
																				if (var35) {
																					int[] var40 = var51.field2332
																							.method6385();
																					if (var40 != null) {
																						PacketBufferNode var26 = ObjectComposition
																								.getPacketBufferNode(
																										ClientPacket.field3167,
																										packetWriter.isaacCipher);
																						var26.packetBuffer
																								.writeIntME(var40[2]);
																						var26.packetBuffer
																								.writeIntME(var40[0]);
																						var26.packetBuffer
																								.writeIntIME(var40[1]);
																						var26.packetBuffer.writeInt(
																								var51.field2332
																										.method6374());
																						var26.packetBuffer.writeShort(
																								var51.field2332.childIndex);
																						var26.packetBuffer.writeIntLE(
																								var51.field2332.id);
																						packetWriter.addNode(var26);
																					}
																				}
																			}
																		}
																	} else if (var51.field2332.type == 12) {
																		class327 var50 = var51.field2332.method6380();
																		if (var50 != null && var50.method6156()) {
																			switch (var51.field2331) {
																			case 0:
																				field740.method4120(var51.field2332);
																				var50.method6056(true);
																				var50.method6159(var51.field2335,
																						var51.field2330,
																						field739.method4134(82),
																						field739.method4134(81));
																				break;
																			case 1:
																				var50.method6096(var51.field2335,
																						var51.field2330);
																			}
																		}
																	}
																}
															}
														}

														var46 = var49.widget;
														if (var46.childIndex < 0) {
															break;
														}

														var44 = FriendSystem.getWidget(var46.parentId);
													} while (var44 == null || var44.children == null
															|| var46.childIndex >= var44.children.length
															|| var46 != var44.children[var46.childIndex]);

													Clock.runScriptEvent(var49);
												}
											}

											var46 = var49.widget;
											if (var46.childIndex < 0) {
												break;
											}

											var44 = FriendSystem.getWidget(var46.parentId);
										} while (var44 == null || var44.children == null
												|| var46.childIndex >= var44.children.length
												|| var46 != var44.children[var46.childIndex]);

										Clock.runScriptEvent(var49);
									}
								}

								var46 = var49.widget;
								if (var46.childIndex < 0) {
									break;
								}

								var44 = FriendSystem.getWidget(var46.parentId);
							} while (var44 == null || var44.children == null
									|| var46.childIndex >= var44.children.length
									|| var46 != var44.children[var46.childIndex]);

							Clock.runScriptEvent(var49);
						}
					}

					var30 = ObjectComposition.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY,
							packetWriter.isaacCipher);
					var30.packetBuffer.writeByte(0);
					var3 = var30.packetBuffer.offset;
					World.performReflectionCheck(var30.packetBuffer);
					var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
					packetWriter.addNode(var30);
				}
			}
		}
	}

	public void vmethod5914(int var1, int var2) {
		if (var1 > -1 && class10.clientPreferences.method2488() > 0 && !playingJingle) {
			PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3130,
					packetWriter.isaacCipher);
			var3.packetBuffer.writeInt(var1);
			packetWriter.addNode(var3);
		}

	}

	void resizeJS() {
		int var1 = class448.canvasWidth;
		int var2 = WorldMapID.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class10.clientPreferences != null) {
			try {
				Client var3 = class347.client;
				Object[] var4 = new Object[] { class237.getWindowedMode() };
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (loadInterface(var1)) {
				class213.drawModelComponents(class16.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field723[var1]) {
				field724[var1] = true;
			}

			field743[var1] = field723[var1];
			field723[var1] = false;
		}

		field722 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Renderable.drawWidgets(rootInterface, 0, 0, class448.canvasWidth, WorldMapID.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class12.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class12.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = class132.method3034();
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var4 = "Use" + " " + field667 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var5;
						if (var3 < 0) {
							var5 = "";
						} else if (menuTargets[var3].length() > 0) {
							var5 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var5 = menuActions[var3];
						}

						var4 = var5;
					}

					if (menuOptionsCount > 2) {
						var4 = var4 + Strings.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2)
								+ " more options";
					}

					class166.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			class7.method44();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field743[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1],
							rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field724[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1],
							rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = Clock.Client_plane;
		var2 = Projectile.localPlayer.x;
		var3 = Projectile.localPlayer.y;
		int var12 = graphicsCycle;

		for (ObjectSound var14 = (ObjectSound) ObjectSound.objectSounds
				.last(); var14 != null; var14 = (ObjectSound) ObjectSound.objectSounds.previous()) {
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var14.maxX * 128) {
					var6 += var2 - var14.maxX * 128;
				} else if (var2 < var14.x * 16384) {
					var6 += var14.x * 16384 - var2;
				}

				if (var3 > var14.maxY * 128) {
					var6 += var3 - var14.maxY * 128;
				} else if (var3 < var14.y * 16384) {
					var6 += var14.y * 16384 - var3;
				}

				if (var6 - 64 <= var14.field843 && class10.clientPreferences.method2450() != 0 && var1 == var14.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var14.field843 - var6) * class10.clientPreferences.method2450() / var14.field843;
					Object var10000;
					if (var14.stream1 == null) {
						if (var14.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(LoginScreenAnimation.field1244,
									var14.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(FloorOverlayDefinition.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								KitDefinition.pcmStreamMixer.addSubStream(var10);
								var14.stream1 = var10;
							}
						}
					} else {
						var14.stream1.method853(var7);
					}

					if (var14.stream2 == null) {
						if (var14.soundEffectIds != null && (var14.field848 -= var12) <= 0) {
							int var13 = (int) (Math.random() * (double) var14.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(LoginScreenAnimation.field1244,
									var14.soundEffectIds[var13], 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(FloorOverlayDefinition.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var16, 100, var7);
								var11.setNumLoops(0);
								KitDefinition.pcmStreamMixer.addSubStream(var11);
								var14.stream2 = var11;
								var14.field848 = var14.field845
										+ (int) (Math.random() * (double) (var14.field836 - var14.field845));
							}
						}
					} else {
						var14.stream2.method853(var7);
						if (!var14.stream2.hasNext()) {
							var14.stream2 = null;
						}
					}
				} else {
					if (var14.stream1 != null) {
						KitDefinition.pcmStreamMixer.removeSubStream(var14.stream1);
						var14.stream1 = null;
					}

					if (var14.stream2 != null) {
						KitDefinition.pcmStreamMixer.removeSubStream(var14.stream2);
						var14.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	boolean method1220(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class406.friendsChat = null;
		} else {
			if (class406.friendsChat == null) {
				class406.friendsChat = new FriendsChat(WorldMapScaleHandler.loginType, class347.client);
			}

			class406.friendsChat.method7749(var1.packetBuffer, var2);
		}

		ClanChannel.method3348();
		var1.serverPacket = null;
		return true;
	}

	boolean method1612(PacketWriter var1) {
		if (class406.friendsChat != null) {
			class406.friendsChat.method7768(var1.packetBuffer);
		}

		ClanChannel.method3348();
		var1.serverPacket = null;
		return true;
	}

	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var21;
			int var25;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1387) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1388 = 0;
						var1.field1387 = false;
					}

					var3.offset = 0;
					if (var3.method8881()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1388 = 0;
					}

					var1.field1387 = true;
					ServerPacket[] var4 = class260.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1388 = 0;
				timer.method7612();
				var1.field1392 = var1.field1393;
				var1.field1393 = var1.field1390;
				var1.field1390 = var1.serverPacket;
				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class149.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				byte var64;
				if (ServerPacket.field3274 == var1.serverPacket) {
					FloorUnderlayDefinition.method3803();
					var64 = var3.readByte();
					class145 var73 = new class145(var3);
					ClanSettings var60;
					if (var64 >= 0) {
						var60 = currentClanSettings[var64];
					} else {
						var60 = class389.guestClanSettings;
					}

					var73.method3141(var60);
					var1.serverPacket = null;
					return true;
				}

				int var20;
				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field734 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var7;
				long var22;
				String var24;
				String var48;
				boolean var59;
				int var61;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var22 = (long) var3.readUnsignedShort();
					var7 = (long) var3.readMedium();
					PlayerType var9 = (PlayerType) GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(),
							var3.readUnsignedByte());
					long var10 = var7 + (var22 << 32);
					var59 = false;

					for (var61 = 0; var61 < 100; ++var61) {
						if (crossWorldMessageIds[var61] == var10) {
							var59 = true;
							break;
						}
					}

					if (ApproximateRouteStrategy.friendSystem
							.isIgnored(new Username(var48, WorldMapScaleHandler.loginType))) {
						var59 = true;
					}

					if (!var59 && field626 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var10;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(var3)));
						byte var63;
						if (var9.isPrivileged) {
							var63 = 7;
						} else {
							var63 = 3;
						}

						if (var9.modIcon != -1) {
							class59.addGameMessage(var63, class100.method2624(var9.modIcon) + var48, var24);
						} else {
							class59.addGameMessage(var63, var48, var24);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var8;
				long var27;
				int var74;
				if (ServerPacket.field3238 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readInt();
					var25 = var3.readUnsignedIntLE();
					var74 = var3.readUnsignedShort();
					if (var74 == 65535) {
						var74 = -1;
					}

					for (var8 = var74; var8 <= var20; ++var8) {
						var27 = (long) var8 + ((long) var25 << 32);
						Node var57 = widgetFlags.get(var27);
						if (var57 != null) {
							var57.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3292 == var1.serverPacket) {
					class213.method4211(class294.field3203);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class393.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3248 == var1.serverPacket) {
					class213.method4211(class294.field3206);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByte();
					publicChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				int var29;
				if (ServerPacket.field3233 == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field725 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var25 = class322.method5990(var5 + MusicPatchNode.cameraPitch & 2027);
					var74 = var20 + class291.cameraYaw;
					var8 = var3.readUnsignedShort();
					var29 = var3.readUnsignedByte();
					field769 = new class466(MusicPatchNode.cameraPitch, var25, var8, var29);
					field768 = new class466(class291.cameraYaw, var74, var8, var29);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					WorldMapSection2.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3310 == var1.serverPacket) {
					FloorUnderlayDefinition.method3803();
					var64 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var64 >= 0) {
							currentClanSettings[var64] = null;
						} else {
							class389.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var64 >= 0) {
						currentClanSettings[var64] = new ClanSettings(var3);
					} else {
						class389.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3316 == var1.serverPacket) {
					PlatformInfo.method8310();
					weight = var3.readShort();
					field711 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var30;
				Widget var53;
				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var53 = FriendSystem.getWidget(var20);
					} else {
						var53 = null;
					}

					if (var53 != null) {
						for (var74 = 0; var74 < var53.itemIds.length; ++var74) {
							var53.itemIds[var74] = 0;
							var53.itemQuantities[var74] = 0;
						}
					}

					ClientPacket.clearItemContainer(var5);
					var74 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var74; ++var8) {
						var29 = var3.readUnsignedByteSub();
						if (var29 == 255) {
							var29 = var3.readInt();
						}

						var30 = var3.readUnsignedShortAddLE();
						if (var53 != null && var8 < var53.itemIds.length) {
							var53.itemIds[var8] = var30;
							var53.itemQuantities[var8] = var29;
						}

						class74.itemContainerSetItem(var5, var8, var30 - 1, var29);
					}

					if (var53 != null) {
						Messages.invalidateWidget(var53);
					}

					PlatformInfo.method8310();
					changedItemContainers[++field701 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var20 = var3.readUnsignedShortLE();
					var25 = var3.readUnsignedByteSub();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var83 = npcs[var20];
					if (var83 != null) {
						if (var5 == var83.sequence && var5 != -1) {
							var8 = WorldMapLabelSize.SequenceDefinition_get(var5).field2299;
							if (var8 == 1) {
								var83.sequenceFrame = 0;
								var83.sequenceFrameCycle = 0;
								var83.sequenceDelay = var25;
								var83.field1200 = 0;
							} else if (var8 == 2) {
								var83.field1200 = 0;
							}
						} else if (var5 == -1 || var83.sequence == -1
								|| WorldMapLabelSize.SequenceDefinition_get(var5).field2278 >= WorldMapLabelSize
										.SequenceDefinition_get(var83.sequence).field2278) {
							var83.sequence = var5;
							var83.sequenceFrame = 0;
							var83.sequenceFrameCycle = 0;
							var83.sequenceDelay = var25;
							var83.field1200 = 0;
							var83.field1226 = var83.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var65;
				if (ServerPacket.field3264 == var1.serverPacket) {
					var65 = var3.readUnsignedByte() == 1;
					if (var65) {
						ParamComposition.field2112 = BoundaryObject.method5027() - var3.readLong();
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = null;
					}

					field712 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					var53 = FriendSystem.getWidget(var5);
					if (var53.modelType != 2 || var20 != var53.modelId) {
						var53.modelType = 2;
						var53.modelId = var20;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3276 == var1.serverPacket) {
					class350.method6623(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3226 == var1.serverPacket) {
					var65 = var3.readBoolean();
					if (var65) {
						if (class30.field152 == null) {
							class30.field152 = new class367();
						}
					} else {
						class30.field152 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					MusicPatch.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3236 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readMedium();
					HealthBarUpdate.method2400(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				int var12;
				int var15;
				int var32;
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var29 = var3.readUnsignedByte();
					var30 = var29 >> 2;
					var32 = var29 & 3;
					var12 = field570[var30];
					var61 = var3.readUnsignedShortLE();
					var25 = var3.method9106();
					var20 = var25 >> 16;
					var5 = var25 >> 8 & 255;
					var74 = var20 + (var25 >> 4 & 7);
					var8 = var5 + (var25 & 7);
					if (var74 >= 0 && var8 >= 0 && var74 < 103 && var8 < 103) {
						if (var12 == 0) {
							BoundaryObject var87 = class36.scene.method4534(Clock.Client_plane, var74, var8);
							if (var87 != null) {
								var15 = class215.Entity_unpackID(var87.tag);
								if (var30 == 2) {
									var87.renderable1 = new DynamicObject(var15, 2, var32 + 4, Clock.Client_plane,
											var74, var8, var61, false, var87.renderable1);
									var87.renderable2 = new DynamicObject(var15, 2, var32 + 1 & 3, Clock.Client_plane,
											var74, var8, var61, false, var87.renderable2);
								} else {
									var87.renderable1 = new DynamicObject(var15, var30, var32, Clock.Client_plane,
											var74, var8, var61, false, var87.renderable1);
								}
							}
						} else if (var12 == 1) {
							WallDecoration var85 = class36.scene.method4535(Clock.Client_plane, var74, var8);
							if (var85 != null) {
								var15 = class215.Entity_unpackID(var85.tag);
								if (var30 != 4 && var30 != 5) {
									if (var30 == 6) {
										var85.renderable1 = new DynamicObject(var15, 4, var32 + 4, Clock.Client_plane,
												var74, var8, var61, false, var85.renderable1);
									} else if (var30 == 7) {
										var85.renderable1 = new DynamicObject(var15, 4, (var32 + 2 & 3) + 4,
												Clock.Client_plane, var74, var8, var61, false, var85.renderable1);
									} else if (var30 == 8) {
										var85.renderable1 = new DynamicObject(var15, 4, var32 + 4, Clock.Client_plane,
												var74, var8, var61, false, var85.renderable1);
										var85.renderable2 = new DynamicObject(var15, 4, (var32 + 2 & 3) + 4,
												Clock.Client_plane, var74, var8, var61, false, var85.renderable2);
									}
								} else {
									var85.renderable1 = new DynamicObject(var15, 4, var32, Clock.Client_plane, var74,
											var8, var61, false, var85.renderable1);
								}
							}
						} else if (var12 == 2) {
							GameObject var82 = class36.scene.getGameObject(Clock.Client_plane, var74, var8);
							if (var30 == 11) {
								var30 = 10;
							}

							if (var82 != null) {
								var82.renderable = new DynamicObject(class215.Entity_unpackID(var82.tag), var30, var32,
										Clock.Client_plane, var74, var8, var61, false, var82.renderable);
							}
						} else if (var12 == 3) {
							FloorDecoration var84 = class36.scene.getFloorDecoration(Clock.Client_plane, var74, var8);
							if (var84 != null) {
								var84.renderable = new DynamicObject(class215.Entity_unpackID(var84.tag), 22, var32,
										Clock.Client_plane, var74, var8, var61, false, var84.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var31;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var25 = var3.readUnsignedIntME();
					var31 = FriendSystem.getWidget(var20);
					ItemComposition var93;
					if (!var31.isIf3) {
						if (var5 == -1) {
							var31.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var93 = class300.ItemDefinition_get(var5);
						var31.modelType = 4;
						var31.modelId = var5;
						var31.modelAngleX = var93.xan2d;
						var31.modelAngleY = var93.yan2d;
						var31.modelZoom = var93.zoom2d * 100 / var25;
						Messages.invalidateWidget(var31);
					} else {
						var31.itemId = var5;
						var31.itemQuantity = var25;
						var93 = class300.ItemDefinition_get(var5);
						var31.modelAngleX = var93.xan2d;
						var31.modelAngleY = var93.yan2d;
						var31.modelAngleZ = var93.zan2d;
						var31.modelOffsetX = var93.offsetX2d;
						var31.modelOffsetY = var93.offsetY2d;
						var31.modelZoom = var93.zoom2d;
						if (var93.isStackable == 1) {
							var31.itemQuantityMode = 1;
						} else {
							var31.itemQuantityMode = 2;
						}

						if (var31.field3667 > 0) {
							var31.modelZoom = var31.modelZoom * 32 / var31.field3667;
						} else if (var31.rawWidth > 0) {
							var31.modelZoom = var31.modelZoom * 32 / var31.rawWidth;
						}

						Messages.invalidateWidget(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				long var36;
				InterfaceParent var76;
				if (ServerPacket.field3228 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var25 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class136.Widget_resetModelFrames(rootInterface);
						class149.runWidgetOnLoadListener(rootInterface);

						for (var74 = 0; var74 < 100; ++var74) {
							field723[var74] = true;
						}
					}

					InterfaceParent var90;
					for (; var25-- > 0; var90.field1057 = true) {
						var74 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedByte();
						var90 = (InterfaceParent) interfaceParents.get((long) var74);
						if (var90 != null && var8 != var90.group) {
							SoundCache.closeInterface(var90, true);
							var90 = null;
						}

						if (var90 == null) {
							var90 = VarpDefinition.method3580(var74, var8, var29);
						}
					}

					for (var76 = (InterfaceParent) interfaceParents
							.first(); var76 != null; var76 = (InterfaceParent) interfaceParents.next()) {
						if (var76.field1057) {
							var76.field1057 = false;
						} else {
							SoundCache.closeInterface(var76, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var74 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedShort();
						var30 = var3.readInt();

						for (var32 = var8; var32 <= var29; ++var32) {
							var36 = (long) var32 + ((long) var74 << 32);
							widgetFlags.put(new IntegerNode(var30), var36);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3291 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntIME();
					var53 = FriendSystem.getWidget(var5);
					if (!var48.equals(var53.text)) {
						var53.text = var48;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				int var62;
				boolean var78;
				if (ServerPacket.field3335 == var1.serverPacket) {
					var64 = var3.readByte();
					var22 = (long) var3.readUnsignedShort();
					var7 = (long) var3.readMedium();
					var27 = (var22 << 32) + var7;
					var78 = false;
					ClanChannel var94 = var64 >= 0 ? currentClanChannels[var64] : VerticalAlignment.guestClanChannel;
					if (var94 == null) {
						var78 = true;
					} else {
						for (var61 = 0; var61 < 100; ++var61) {
							if (var27 == crossWorldMessageIds[var61]) {
								var78 = true;
								break;
							}
						}
					}

					if (!var78) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var27;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = class16.method218(var3);
						var62 = var64 >= 0 ? 43 : 46;
						ApproximateRouteStrategy.addChatMessage(var62, "", var24, var94.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3266 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.resizeRoot(false);
					class136.Widget_resetModelFrames(var20);
					class149.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field723[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3260 == var1.serverPacket) {
					class213.method4211(class294.field3201);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var55;
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var20 = var3.readInt();
					var55 = var3.readUnsignedByteNeg() == 1;
					var53 = FriendSystem.getWidget(var20);
					if (var55 != var53.isHidden) {
						var53.isHidden = var55;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var25 = class132.getGcDuration();
					PacketBufferNode var79 = ObjectComposition.getPacketBufferNode(ClientPacket.PING_STATISTICS,
							packetWriter.isaacCipher);
					var79.packetBuffer.writeByteSub(GameEngine.fps);
					var79.packetBuffer.writeByteSub(var25);
					var79.packetBuffer.writeIntIME(var20);
					var79.packetBuffer.writeIntLE(var5);
					packetWriter.addNode(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Player.FriendSystem_invalidateIgnoreds();
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					FriendSystem.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var53 = FriendSystem.getWidget(var5);
					if (var53.modelType != 1 || var20 != var53.modelId) {
						var53.modelType = 1;
						var53.modelId = var20;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				NPC var88;
				if (ServerPacket.field3229 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedByteAdd();
					short var80 = (short) var3.method8953();
					var74 = var3.readInt();
					var88 = npcs[var20];
					if (var88 != null) {
						var88.method2565(var5, var74, var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3313 == var1.serverPacket) {
					class213.method4211(class294.field3200);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3317 == var1.serverPacket) {
					WorldMapIcon_0.field2950 = var3.readUnsignedByteSub();
					Archive.field4231 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class149.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAdd() * 30;
					field711 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3311 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedShort();
					SpriteMask.queueSoundEffect(var20, var5, var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					class74.updatePlayers(var3, var1.serverPacketLength);
					PendingSpawn.method2354();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3337 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByteAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					ServerPacket.performPlayerAnimation(Projectile.localPlayer, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					Archive.field4231 = var3.readUnsignedByteSub();
					WorldMapIcon_0.field2950 = var3.readUnsignedByteAdd();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class294 var72 = class135.method3046()[var20];
						class213.method4211(var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3284 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field601) {
						field601 = var20;
						class327.method6341();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3261 == var1.serverPacket) {
					for (var20 = 0; var20 < players.length; ++var20) {
						if (players[var20] != null) {
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) {
						if (npcs[var20] != null) {
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var54;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method8876(var52, 0, var52.length);
					Buffer var71 = new Buffer(var52);
					var54 = var71.readStringCp1252NullTerminated();
					class27.openURL(var54, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3301 == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.method1804();
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3263 == var1.serverPacket) {
					class213.method4211(class294.field3208);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3227 == var1.serverPacket) {
					return this.method1612(var1);
				}

				Widget var68;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var68 = FriendSystem.getWidget(var20);

					for (var25 = 0; var25 < var68.itemIds.length; ++var25) {
						var68.itemIds[var25] = -1;
						var68.itemIds[var25] = 0;
					}

					Messages.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3325 == var1.serverPacket) {
					class213.method4211(class294.field3202);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3312 == var1.serverPacket) {
					return this.method1220(var1, 2);
				}

				if (ServerPacket.field3328 == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field764 = true;
					class126.field1469 = var3.readUnsignedByte() * 16384;
					class217.field2401 = var3.readUnsignedByte() * 16384;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field581 = var3.readBoolean();
					var25 = var3.readUnsignedByte();
					var74 = class126.field1469 * 128 + 64;
					var8 = class217.field2401 * 128 + 64;
					boolean var81 = false;
					boolean var77 = false;
					if (field581) {
						var29 = class152.cameraY;
						var30 = Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var20;
					} else {
						var29 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane)
								- class152.cameraY;
						var30 = var20;
					}

					field540 = new class465(class208.cameraX, ByteArrayPool.cameraZ, var29, var74, var8, var30, var5,
							var25);
					var1.serverPacket = null;
					return true;
				}

				Widget var91;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var58 = (InterfaceParent) interfaceParents.get((long) var20);
					var76 = (InterfaceParent) interfaceParents.get((long) var5);
					if (var76 != null) {
						SoundCache.closeInterface(var76, var58 == null || var76.group != var58.group);
					}

					if (var58 != null) {
						var58.remove();
						interfaceParents.put(var58, (long) var5);
					}

					var91 = FriendSystem.getWidget(var20);
					if (var91 != null) {
						Messages.invalidateWidget(var91);
					}

					var91 = FriendSystem.getWidget(var5);
					if (var91 != null) {
						Messages.invalidateWidget(var91);
						Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var91.id >>> 16], var91,
								true);
					}

					if (rootInterface != -1) {
						class453.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3293 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntME();
					var53 = FriendSystem.getWidget(var20);
					ItemComposition.method4019(var53, var5);
					Messages.invalidateWidget(var53);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3249 == var1.serverPacket) {
					class127.field1495 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field691 = false;
					isCameraLocked = false;
					field764 = false;
					field725 = false;
					HealthBarUpdate.field1233 = 0;
					class137.field1605 = 0;
					HitSplatDefinition.field2142 = 0;
					field581 = false;
					BufferedSource.field4636 = 0;
					class209.field2322 = 0;
					LoginScreenAnimation.field1255 = 0;
					UserComparator4.field1410 = 0;
					class126.field1469 = 0;
					class217.field2401 = 0;
					class85.field1044 = 0;
					field540 = null;
					field769 = null;
					field768 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field771[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field725 = false;
					HealthBarUpdate.field1233 = var3.readUnsignedByte() * 16384;
					class137.field1605 = var3.readUnsignedByte() * 128;
					HitSplatDefinition.field2142 = var3.readUnsignedShort();
					BufferedSource.field4636 = var3.readUnsignedByte();
					class209.field2322 = var3.readUnsignedByte();
					if (class209.field2322 >= 100) {
						var20 = HealthBarUpdate.field1233 * 128 + 64;
						var5 = class137.field1605 * 16384 + 64;
						var25 = Renderable.getTileHeight(var20, var5, Clock.Client_plane)
								- HitSplatDefinition.field2142;
						var74 = var20 - class208.cameraX;
						var8 = var25 - class152.cameraY;
						var29 = var5 - ByteArrayPool.cameraZ;
						var30 = (int) Math.sqrt((double) (var29 * var29 + var74 * var74));
						MusicPatchNode.cameraPitch = (int) (Math.atan2((double) var8, (double) var30)
								* 325.9490051269531) & 2047;
						class291.cameraYaw = (int) (Math.atan2((double) var74, (double) var29) * -325.9490051269531)
								& 2047;
						if (MusicPatchNode.cameraPitch < 128) {
							MusicPatchNode.cameraPitch = 128;
						}

						if (MusicPatchNode.cameraPitch > 383) {
							MusicPatchNode.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var51 = new World();
					var51.host = var3.readStringCp1252NullTerminated();
					var51.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var51.properties = var5;
					UserComparator8.updateGameState(45);
					var2.close();
					var2 = null;
					class14.changeWorld(var51);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					Archive.field4231 = var3.readUnsignedByte();
					WorldMapIcon_0.field2950 = var3.readUnsignedByte();

					for (var20 = WorldMapIcon_0.field2950; var20 < WorldMapIcon_0.field2950 + 8; ++var20) {
						for (var5 = Archive.field4231; var5 < Archive.field4231 + 8; ++var5) {
							if (groundItems[Clock.Client_plane][var20][var5] != null) {
								groundItems[Clock.Client_plane][var20][var5] = null;
								class128.updateItemPile(var20, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn) pendingSpawns
							.last(); var50 != null; var50 = (PendingSpawn) pendingSpawns.previous()) {
						if (var50.x >= WorldMapIcon_0.field2950 && var50.x < WorldMapIcon_0.field2950 + 8
								&& var50.y >= Archive.field4231 && var50.y < Archive.field4231 + 8
								&& var50.plane == Clock.Client_plane) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3297 == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field725 = true;
					var20 = GrandExchangeOfferTotalQuantityComparator.method6812(var3.readShort() & 2027);
					var5 = class322.method5990(var3.readShort() & 2027);
					var25 = var3.readUnsignedShort();
					var74 = var3.readUnsignedByte();
					field769 = new class466(MusicPatchNode.cameraPitch, var5, var25, var74);
					field768 = new class466(class291.cameraYaw, var20, var25, var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var64 = var3.readByteAdd();
					var5 = var3.readUnsignedShortAddLE();
					Varps.Varps_temp[var5] = var64;
					if (Varps.Varps_main[var5] != var64) {
						Varps.Varps_main[var5] = var64;
					}

					class393.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var21 = var3.readStringCp1252NullTerminated();
					var25 = var3.readUnsignedByte();
					if (var25 >= 1 && var25 <= 8) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var25 - 1] = var21;
						playerOptionsPriorities[var25 - 1] = var20 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var53 = FriendSystem.getWidget(var20);
					} else {
						var53 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class74.itemContainerSetItem(var5, var74, var8 - 1,
							var29)) {
						var74 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var29 = 0;
						if (var8 != 0) {
							var29 = var3.readUnsignedByte();
							if (var29 == 255) {
								var29 = var3.readInt();
							}
						}

						if (var53 != null && var74 >= 0 && var74 < var53.itemIds.length) {
							var53.itemIds[var74] = var8;
							var53.itemQuantities[var74] = var29;
						}
					}

					if (var53 != null) {
						Messages.invalidateWidget(var53);
					}

					PlatformInfo.method8310();
					changedItemContainers[++field701 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3315 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedByte();
					var74 = var3.readUnsignedByte();
					field771[var20] = true;
					field772[var20] = var5;
					field695[var20] = var25;
					field774[var20] = var74;
					field763[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3280 == var1.serverPacket) {
					var20 = var3.method8953();
					var5 = var3.readInt();
					var53 = FriendSystem.getWidget(var5);
					if (var20 != var53.sequenceId || var20 == -1) {
						var53.sequenceId = var20;
						var53.modelFrame = 0;
						var53.modelFrameCycle = 0;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var29 = var3.readUnsignedShort();
					var32 = var3.readUnsignedShortAddLE();
					var25 = var3.method9106();
					var20 = var25 >> 16;
					var5 = var25 >> 8 & 255;
					var74 = var20 + (var25 >> 4 & 7);
					var8 = var5 + (var25 & 7);
					var30 = var3.readUnsignedByteSub();
					if (var74 >= 0 && var8 >= 0 && var74 < 104 && var8 < 104) {
						var74 = var74 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var38 = new GraphicsObject(var29, Clock.Client_plane, var74, var8,
								Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var30, var32, cycle);
						graphicsObjects.addFirst(var38);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3299 == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field725 = true;
					HealthBarUpdate.field1233 = var3.readUnsignedByte() * 16384;
					class137.field1605 = var3.readUnsignedByte() * 128;
					HitSplatDefinition.field2142 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var25 = HealthBarUpdate.field1233 * 128 + 64;
					var74 = class137.field1605 * 16384 + 64;
					var8 = Renderable.getTileHeight(var25, var74, Clock.Client_plane) - HitSplatDefinition.field2142;
					var29 = var25 - class208.cameraX;
					var30 = var8 - class152.cameraY;
					var32 = var74 - ByteArrayPool.cameraZ;
					double var92 = Math.sqrt((double) (var29 * var29 + var32 * var32));
					var62 = class322.method5990((int) (Math.atan2((double) var30, var92) * 325.9490051269531) & 2047);
					var15 = GrandExchangeOfferTotalQuantityComparator
							.method6812((int) (Math.atan2((double) var29, (double) var32) * -325.9490051269531) & 2047);
					field769 = new class466(MusicPatchNode.cameraPitch, var62, var20, var5);
					field768 = new class466(class291.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3244 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortLE();
					var25 = var3.readUnsignedIntME();
					var31 = FriendSystem.getWidget(var25);
					var31.field3659 = var20 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortAdd();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					class393.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3298 == var1.serverPacket) {
					class213.method4211(class294.field3207);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3230 == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field764 = true;
					class126.field1469 = var3.readUnsignedByte() * 16384;
					class217.field2401 = var3.readUnsignedByte() * 16384;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var25 = var3.readUnsignedByte() * 128 + 64;
					var74 = var3.readUnsignedShort();
					field581 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var29 = class126.field1469 * 128 + 64;
					var30 = class217.field2401 * 128 + 64;
					var78 = false;
					var59 = false;
					if (field581) {
						var32 = class152.cameraY;
						var12 = Renderable.getTileHeight(var29, var30, Clock.Client_plane) - var20;
					} else {
						var32 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane)
								- class152.cameraY;
						var12 = var20;
					}

					field540 = new class464(class208.cameraX, ByteArrayPool.cameraZ, var32, var29, var30, var12, var5,
							var25, var74, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					PlatformInfo.method8310();
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntLE();
					var25 = var3.readUnsignedByteNeg();
					experience[var20] = var5;
					currentLevels[var20] = var25;
					levels[var20] = 1;

					for (var74 = 0; var74 < 98; ++var74) {
						if (var5 >= Skills.Skills_experienceTable[var74]) {
							levels[var20] = var74 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3241 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					WorldMapSection0.method5416(var20);
					var1.serverPacket = null;
					return true;
				}

				int var16;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					int var18 = var3.readUnsignedByte();
					var12 = var3.readUnsignedShortAdd();
					var15 = var3.readUnsignedShortAddLE();
					int var17 = var3.readUnsignedByteSub();
					byte var75 = var3.readByteSub();
					var25 = var3.method8957();
					var20 = var25 >> 16;
					var5 = var25 >> 8 & 255;
					var74 = var20 + (var25 >> 4 & 7);
					var8 = var5 + (var25 & 7);
					var30 = var3.readByteAdd();
					var32 = var3.method9027();
					var16 = var3.readUnsignedShortAddLE();
					var61 = var3.readUnsignedByteSub() * 4;
					var62 = var3.readUnsignedByteAdd() * 4;
					var29 = var75 + var74;
					var30 += var8;
					if (var74 >= 0 && var8 >= 0 && var74 < 104 && var8 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104
							&& var30 < 104 && var12 != 65535) {
						var74 = var74 * 128 + 64;
						var8 = var8 * 128 + 64;
						var29 = var29 * 128 + 64;
						var30 = var30 * 128 + 64;
						Projectile var19 = new Projectile(var12, Clock.Client_plane, var74, var8,
								Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var61, var15 + cycle,
								var16 + cycle, var17, var18, var32, var62);
						var19.setDestination(var29, var30,
								Renderable.getTileHeight(var29, var30, Clock.Client_plane) - var62, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var70 = (InterfaceParent) interfaceParents.get((long) var20);
					if (var70 != null) {
						SoundCache.closeInterface(var70, true);
					}

					if (meslayerContinueWidget != null) {
						Messages.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3331 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAddLE();
					var53 = FriendSystem.getWidget(var20);
					if (var53.modelType != 6 || var5 != var53.modelId) {
						var53.modelType = 6;
						var53.modelId = var5;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					var25 = var3.readUnsignedIntLE();
					var74 = var3.readUnsignedShortLE();
					var91 = FriendSystem.getWidget(var25);
					if (var20 != var91.modelAngleX || var5 != var91.modelAngleY || var74 != var91.modelZoom) {
						var91.modelAngleX = var20;
						var91.modelAngleY = var5;
						var91.modelZoom = var74;
						Messages.invalidateWidget(var91);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class60.method1120(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3285 == var1.serverPacket) {
					class127.field1495 = new class442(HealthBar.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class19.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3245 == var1.serverPacket) {
					if (class127.field1495 == null) {
						class127.field1495 = new class442(HealthBar.HitSplatDefinition_cached);
					}

					class509 var49 = HealthBar.HitSplatDefinition_cached.method8197(var3);
					class127.field1495.field4708.vmethod8642(var49.field5084, var49.field5083);
					field704[++field705 - 1 & 31] = var49.field5084;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3256 == var1.serverPacket) {
					field690 = cycleCntr;
					var64 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var64 >= 0) {
							currentClanChannels[var64] = null;
						} else {
							VerticalAlignment.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var64 >= 0) {
						currentClanChannels[var64] = new ClanChannel(var3);
					} else {
						VerticalAlignment.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var74 = var3.readUnsignedByteSub();
					var5 = var3.readInt();
					var20 = var3.readUnsignedShortAdd();
					var88 = npcs[var20];
					var25 = var3.readUnsignedShortAddLE();
					if (var88 != null) {
						var88.updateSpotAnimation(var74, var25, var5 >> 16, var5 & '\uffff');
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					ParamComposition.method3838(var20);
					changedItemContainers[++field701 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1903; ++var20) {
						VarpDefinition var69 = class100.VarpDefinition_get(var20);
						if (var69 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					PlatformInfo.method8310();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var68 = FriendSystem.getWidget(var20);
					var68.modelType = 3;
					var68.modelId = Projectile.localPlayer.appearance.getChatHeadId();
					Messages.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3330 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3326 == var1.serverPacket) {
					class213.method4211(class294.field3204);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					Object[] var67 = new Object[var48.length() + 1];

					for (var25 = var48.length() - 1; var25 >= 0; --var25) {
						if (var48.charAt(var25) == 's') {
							var67[var25 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var67[var25 + 1] = new Integer(var3.readInt());
						}
					}

					var67[0] = new Integer(var3.readInt());
					ScriptEvent var56 = new ScriptEvent();
					var56.args = var67;
					Clock.runScriptEvent(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var74 = var3.readUnsignedByte();
					var25 = var3.readUnsignedIntLE();
					var20 = var3.readUnsignedShortAdd();
					Player var86;
					if (var20 == localPlayerIndex) {
						var86 = Projectile.localPlayer;
					} else {
						var86 = players[var20];
					}

					var5 = var3.readUnsignedShortAddLE();
					if (var86 != null) {
						var86.updateSpotAnimation(var74, var5, var25 >> 16, var25 & '\uffff');
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3308 == var1.serverPacket) {
					class213.method4211(class294.field3199);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntIME();
					var25 = var20 >> 10 & 31;
					var74 = var20 >> 5 & 31;
					var8 = var20 & 31;
					var29 = (var74 << 11) + (var25 << 19) + (var8 << 3);
					Widget var89 = FriendSystem.getWidget(var5);
					if (var29 != var89.color) {
						var89.color = var29;
						Messages.invalidateWidget(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3304 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedIntIME();
					var76 = (InterfaceParent) interfaceParents.get((long) var25);
					if (var76 != null) {
						SoundCache.closeInterface(var76, var20 != var76.group);
					}

					VarpDefinition.method3580(var25, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field691 = false;
					field764 = false;
					class126.field1469 = var3.readUnsignedByte() * 16384;
					class217.field2401 = var3.readUnsignedByte() * 16384;
					class85.field1044 = var3.readUnsignedShort();
					UserComparator4.field1410 = var3.readUnsignedByte();
					LoginScreenAnimation.field1255 = var3.readUnsignedByte();
					if (LoginScreenAnimation.field1255 >= 100) {
						class208.cameraX = class126.field1469 * 128 + 64;
						ByteArrayPool.cameraZ = class217.field2401 * 128 + 64;
						class152.cameraY = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ,
								Clock.Client_plane) - class85.field1044;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var55 = var3.readUnsignedByte() == 1;
					var54 = "";
					boolean var26 = false;
					if (var55) {
						var54 = var3.readStringCp1252NullTerminated();
						if (ApproximateRouteStrategy.friendSystem
								.isIgnored(new Username(var54, WorldMapScaleHandler.loginType))) {
							var26 = true;
						}
					}

					String var34 = var3.readStringCp1252NullTerminated();
					if (!var26) {
						class59.addGameMessage(var20, var54, var34);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3268 == var1.serverPacket) {
					PlatformInfo.method8310();
					runEnergy = var3.readUnsignedShort();
					field711 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3254 == var1.serverPacket) {
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntIME();
					var53 = FriendSystem.getWidget(var5);
					MusicPatchPcmStream.method5941(var53, Projectile.localPlayer.appearance.gender, var20);
					Messages.invalidateWidget(var53);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class453.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3265 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedByteNeg();
					var31 = FriendSystem.getWidget(var20);
					class199.method3808(var31, var5, var25);
					Messages.invalidateWidget(var31);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class19.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var53 = FriendSystem.getWidget(var20);
					if (var53 != null && var53.type == 0) {
						if (var5 > var53.scrollHeight - var53.height) {
							var5 = var53.scrollHeight - var53.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var53.scrollY) {
							var53.scrollY = var5;
							Messages.invalidateWidget(var53);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readUnsignedIntLE();
					var25 = var3.readShort();
					var31 = FriendSystem.getWidget(var5);
					if (var20 != var31.rawX || var25 != var31.rawY || var31.xAlignment != 0 || var31.yAlignment != 0) {
						var31.rawX = var20;
						var31.rawY = var25;
						var31.xAlignment = 0;
						var31.yAlignment = 0;
						Messages.invalidateWidget(var31);
						this.alignWidget(var31);
						if (var31.type == 0) {
							Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var5 >> 16], var31,
									false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3273 == var1.serverPacket) {
					return this.method1220(var1, 1);
				}

				if (ServerPacket.field3306 == var1.serverPacket) {
					var65 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readInt();
					var53 = FriendSystem.getWidget(var5);
					GraphicsObject.method2043(var53, Projectile.localPlayer.appearance, var65);
					Messages.invalidateWidget(var53);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3222 == var1.serverPacket) {
					class213.method4211(class294.field3205);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(var3)));
					class59.addGameMessage(6, var48, var21);
					var1.serverPacket = null;
					return true;
				}

				String var39;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var22 = var3.readLong();
					var7 = (long) var3.readUnsignedShort();
					var27 = (long) var3.readMedium();
					PlayerType var11 = (PlayerType) GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(),
							var3.readUnsignedByte());
					var36 = var27 + (var7 << 32);
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var36) {
							var14 = true;
							break;
						}
					}

					if (var11.isUser && ApproximateRouteStrategy.friendSystem
							.isIgnored(new Username(var48, WorldMapScaleHandler.loginType))) {
						var14 = true;
					}

					if (!var14 && field626 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var39 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(var3)));
						if (var11.modIcon != -1) {
							ApproximateRouteStrategy.addChatMessage(9, class100.method2624(var11.modIcon) + var48,
									var39, MusicPatchPcmStream.base37DecodeLong(var22));
						} else {
							ApproximateRouteStrategy.addChatMessage(9, var48, var39,
									MusicPatchPcmStream.base37DecodeLong(var22));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3318 == var1.serverPacket) {
					field690 = cycleCntr;
					var64 = var3.readByte();
					class159 var66 = new class159(var3);
					ClanChannel var6;
					if (var64 >= 0) {
						var6 = currentClanChannels[var64];
					} else {
						var6 = VerticalAlignment.guestClanChannel;
					}

					var66.method3313(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3239 == var1.serverPacket) {
					class213.method4211(class294.field3198);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3302 == var1.serverPacket && isCameraLocked) {
					field691 = true;
					field725 = false;
					field764 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field771[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					SpotAnimationDefinition.privateChatMode = class404.method7633(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3309 == var1.serverPacket) {
					var20 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var40 = (long) var3.readUnsignedShort();
					long var42 = (long) var3.readMedium();
					PlayerType var35 = (PlayerType) GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(),
							var3.readUnsignedByte());
					long var44 = (var40 << 32) + var42;
					boolean var13 = false;
					ClanChannel var33 = null;
					var33 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel;
					if (var33 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var35.isUser && ApproximateRouteStrategy.friendSystem
										.isIgnored(new Username(var21, WorldMapScaleHandler.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var44) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var44;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var39 = AbstractFont.escapeBrackets(class16.method218(var3));
						var16 = var20 >= 0 ? 41 : 44;
						if (var35.modIcon != -1) {
							ApproximateRouteStrategy.addChatMessage(var16, class100.method2624(var35.modIcon) + var21,
									var39, var33.name);
						} else {
							ApproximateRouteStrategy.addChatMessage(var16, var21, var39, var33.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				class260.RunException_sendStackTrace(
						"" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + ","
								+ (var1.field1393 != null ? var1.field1393.id : -1) + ","
								+ (var1.field1392 != null ? var1.field1392.id : -1) + "," + var1.serverPacketLength,
						(Throwable) null);
				FriendSystem.logOut();
			} catch (IOException var46) {
				Interpreter.method2034();
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + ","
						+ (var1.field1393 != null ? var1.field1393.id : -1) + ","
						+ (var1.field1392 != null ? var1.field1392.id : -1) + "," + var1.serverPacketLength + ","
						+ (Projectile.localPlayer.pathX[0] + class213.baseX * 64) + ","
						+ (Projectile.localPlayer.pathY[0] + class101.baseY * 64) + ",";

				for (var25 = 0; var25 < var1.serverPacketLength && var25 < 50; ++var25) {
					var21 = var21 + var3.array[var25] + ",";
				}

				class260.RunException_sendStackTrace(var21, var47);
				FriendSystem.logOut();
			}

			return true;
		}
	}

	final void menu() {
		MouseRecorder.menuSort();
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			int var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (isMenuOpen) {
				if (var1 != 1 && (class305.mouseCam || var1 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class180.menuX - 10 || var2 > class237.menuWidth + class180.menuX + 10
							|| var3 < NewStuff.menuY - 10 || var3 > class60.menuHeight + NewStuff.menuY + 10) {
						isMenuOpen = false;
						class20.method305(class180.menuX, NewStuff.menuY, class237.menuWidth, class60.menuHeight);
					}
				}

				if (var1 == 1 || !class305.mouseCam && var1 == 4) {
					var2 = class180.menuX;
					var3 = NewStuff.menuY;
					var4 = class237.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					var6 = MouseHandler.MouseHandler_lastPressedY;
					var7 = -1;

					int var15;
					int var16;
					for (var15 = 0; var15 < menuOptionsCount; ++var15) {
						var16 = (menuOptionsCount - 1 - var15) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var6 > var16 - 13 && var6 < var16 + 3) {
							var7 = var15;
						}
					}

					if (var7 != -1 && var7 >= 0) {
						var15 = menuArguments1[var7];
						var16 = menuArguments2[var7];
						int var10 = menuOpcodes[var7];
						int var11 = menuIdentifiers[var7];
						int var12 = menuItemIds[var7];
						String var13 = menuActions[var7];
						String var14 = menuTargets[var7];
						WorldMapIcon_0.menuAction(var15, var16, var10, var11, var12, var13, var14,
								MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					isMenuOpen = false;
					class20.method305(class180.menuX, NewStuff.menuY, class237.menuWidth, class60.menuHeight);
				}
			} else {
				var2 = class132.method3034();
				if ((var1 == 1 || !class305.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !class305.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
					var3 = menuArguments1[var2];
					var4 = menuArguments2[var2];
					var5 = menuOpcodes[var2];
					var6 = menuIdentifiers[var2];
					var7 = menuItemIds[var2];
					String var8 = menuActions[var2];
					String var9 = menuTargets[var2];
					WorldMapIcon_0.menuAction(var3, var4, var5, var6, var7, var8, var9,
							MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}

				if (var1 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	final boolean shouldLeftClickOpenMenu() {
		int var1 = class132.method3034();
		boolean var2 = leftClickOpensMenu && menuOptionsCount > 2;
		if (!var2) {
			boolean var3;
			if (var1 < 0) {
				var3 = false;
			} else {
				int var4 = menuOpcodes[var1];
				if (var4 >= 2000) {
					var4 -= 2000;
				}

				if (var4 == 1007) {
					var3 = true;
				} else {
					var3 = false;
				}
			}

			var2 = var3;
		}

		return var2 && !menuShiftClick[var1];
	}

	final void openMenu(int var1, int var2) {
		int var3 = class166.fontBold12.stringWidth("Choose Option");

		int var4;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			Font var8 = class166.fontBold12;
			String var9;
			if (var4 < 0) {
				var9 = "";
			} else if (menuTargets[var4].length() > 0) {
				var9 = menuActions[var4] + " " + menuTargets[var4];
			} else {
				var9 = menuActions[var4];
			}

			int var7 = var8.stringWidth(var9);
			if (var7 > var3) {
				var3 = var7;
			}
		}

		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		int var5 = var1 - var3 / 2;
		if (var5 + var3 > class448.canvasWidth) {
			var5 = class448.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if (var2 + var4 > WorldMapID.canvasHeight) {
			var6 = WorldMapID.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class180.menuX = var5;
		NewStuff.menuY = var6;
		class237.menuWidth = var3;
		class60.menuHeight = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class36.scene.menuOpen(Clock.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	final void resizeRoot(boolean var1) {
		class13.method170(rootInterface, class448.canvasWidth, WorldMapID.canvasHeight, var1);
	}

	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : FriendSystem.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class448.canvasWidth;
			var4 = WorldMapID.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		SoundSystem.alignWidgetSize(var1, var3, var4, false);
		class140.alignWidgetPosition(var1, var3, var4);
	}

	final void method1508() {
		Messages.invalidateWidget(clickedWidget);
		++class348.widgetDragDuration;
		if (field693 && field639) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field534) {
				var1 = field534;
			}

			if (var1 + clickedWidget.width > field534 + clickedWidgetParent.width) {
				var1 = field534 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field692) {
				var2 = field692;
			}

			if (var2 + clickedWidget.height > field692 + clickedWidgetParent.height) {
				var2 = field692 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field694;
			int var4 = var2 - field735;
			int var5 = clickedWidget.dragZoneSize;
			if (class348.widgetDragDuration > clickedWidget.dragThreshold
					&& (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field534 + clickedWidgetParent.scrollX;
			int var7 = var2 - field692 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Clock.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						Clock.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = Interpreter.method1961(StudioGame.getWidgetFlags(var9));
						Widget var13;
						if (var10 == 0) {
							var13 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9;
									break;
								}

								var9 = FriendSystem.getWidget(var9.parentId);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							}
						}

						if (var13 != null) {
							PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.OPHELDD,
									packetWriter.isaacCipher);
							var12.packetBuffer.writeShortAdd(clickedWidget.itemId);
							var12.packetBuffer.writeShortAdd(draggedOnWidget.childIndex);
							var12.packetBuffer.writeInt(draggedOnWidget.id);
							var12.packetBuffer.writeIntIME(clickedWidget.id);
							var12.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
							var12.packetBuffer.writeShortLE(draggedOnWidget.itemId);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field694 + widgetClickX, widgetClickY + field735);
				} else if (menuOptionsCount > 0) {
					class382.method7141(widgetClickX + field694, widgetClickY + field735);
				}

				clickedWidget = null;
			}

		} else {
			if (class348.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					class382.method7141(field694 + widgetClickX, widgetClickY + field735);
				}

				clickedWidget = null;
			}

		}
	}

	public Username username() {
		return Projectile.localPlayer != null ? Projectile.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch (var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							int var4 = Integer.parseInt(var2);
							Language var10;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var10 = Language.Language_valuesOrdered[var4];
							} else {
								var10 = null;
							}

							TriBool.clientLanguage = var10;
							break;
						case 7:
							KeyHandler.field132 = class177.method3517(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class443.field4710 = var2;
							break;
						case 10:
							StudioGame[] var5 = new StudioGame[] { StudioGame.game3, StudioGame.game5, StudioGame.game4,
									StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape };
							GameBuild.field3841 = (StudioGame) GameObject.findEnumerated(var5, Integer.parseInt(var2));
							if (GameBuild.field3841 == StudioGame.oldscape) {
								WorldMapScaleHandler.loginType = LoginType.oldscape;
							} else {
								WorldMapScaleHandler.loginType = LoginType.field4924;
							}
							break;
						case 11:
							MusicPatchNode2.field3380 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							class156.field1726 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							FillMode.field5098 = var2;
							break;
						case 21:
							field508 = Integer.parseInt(var2);
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								field512 = Integer.parseInt(var2);
							} else {
								field512 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class17.worldHost = this.getCodeBase().getHost();
				String var6 = KeyHandler.field132.name;
				byte var7 = 0;

				try {
					ItemComposition.method4004("oldschool", var6, var7, 22);
				} catch (Exception var8) {
					class260.RunException_sendStackTrace((String) null, var8);
				}

				class347.client = this;
				class451.clientType = clientType;
				class490.method8769();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field550 = true;
				}

				if (field510 == -1) {
					if (!this.method1201() && !this.method1202()) {
						field510 = 0;
					} else {
						field510 = 5;
					}
				}

				this.startThread(765, 503, 214, 1);
			}
		} catch (RuntimeException var9) {
			throw MilliClock.newRunException(var9, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		ObjectComposition.method3947(this);
		super.finalize();
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field548 = var1;
			class390.method7249(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.field560;
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field552 = var1;
		}
	}

	public static boolean loadInterface(int var0) {
		if (class143.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class143.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (class16.Widget_interfaceComponents[var0] == null) {
					class16.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (class16.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							class16.Widget_interfaceComponents[var0][var2] = new Widget();
							class16.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								class16.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class16.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class143.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	public static boolean method1203(int var0) {
		return var0 >= WorldMapDecorationType.field3803.id && var0 <= WorldMapDecorationType.field3809.id;
	}

	static int method1335(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
