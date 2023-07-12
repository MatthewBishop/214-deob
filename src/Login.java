import java.text.DecimalFormat;

public class Login {

	static boolean clearLoginScreen;

	

	static int xPadding = 0;

	static IndexedSprite[] runesSprite;

	static IndexedSprite titlebuttonSprite;

	static SpritePixels rightTitleSprite;

	

	static int loginBoxX;

	

	static int Login_loadingPercent;

	static String Login_loadingText;

	

	static int Login_banType;

	
	static int field929;

	

	static int loginIndex;

	static String Login_response0;

	static String Login_response1;

	static String Login_response2;

	static String Login_response3;

	static String Login_username;

	static String Login_password;

	
	static int field935;

	static String[] field938;

	static String field939;

	static boolean field947;

	static boolean field941;

	static boolean field942;

	

	static int currentLoginField;

	static boolean worldSelectOpen;

	

	static int hoveredWorldIndex;

	

	static int worldSelectPage;

	

	static int worldSelectPagesCount;

	
	static long field949;

	
	static long field930;

	static String[] field952;

	static String[] field953;

	static String[] field933;

	
	static int field917;

	static {
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field929 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field935 = 0;
		field938 = new String[8];
		field939 = "";
		field947 = false;
		field941 = false;
		field942 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class132();
		field949 = -1L;
		field930 = -1L;
		field952 = new String[] { "title.jpg" };
		field953 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton",
				"titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute",
				"options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4",
				"options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
		field933 = new String[] { "logo_speedrunning" };
	}

	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3678 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3678 = new byte[11][];
			var0.field3671 = new byte[11][];
			var0.field3639 = new int[11];
			var0.field3681 = new int[11];
		}

		var0.field3678[var1] = var2;
		if (var2 != null) {
			var0.field3677 = true;
		} else {
			var0.field3677 = false;

			for (int var4 = 0; var4 < var0.field3678.length; ++var4) {
				if (var0.field3678[var4] != null) {
					var0.field3677 = true;
					break;
				}
			}
		}

		var0.field3671[var1] = var3;
	}
}
