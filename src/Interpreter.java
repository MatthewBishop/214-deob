import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Interpreter {

	static int[] Interpreter_intLocals;

	static String[] Interpreter_stringLocals;

	static int[] Interpreter_arrayLengths = new int[5];

	static int[][] Interpreter_arrays = new int[5][5000];

	static int[] Interpreter_intStack = new int[1000];

	

	static int Interpreter_intStackSize;

	static String[] Interpreter_stringStack = new String[1000];

	

	static int Interpreter_frameDepth = 0;

	static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];

	static Widget scriptActiveWidget;

	static ClanChannel field872;

	
	static int field865;

	static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();

	static final String[] Interpreter_MONTHS = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
			"Sep", "Oct", "Nov", "Dec" };

	static boolean field852 = false;

	static boolean field875 = false;

	static ArrayList field873 = new ArrayList();

	
	static int field871 = 0;

	static final double field868 = Math.log(2.0);

	static Task field858;

	public static final SpritePixels method2032(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized (ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	public static int method1961(int var0) {
		return var0 >> 17 & 7;
	}

	static final void method2034() {
		if (Client.logoutTimer > 0) {
			FriendSystem.logOut();
		} else {
			Client.timer.method7608();
			UserComparator8.updateGameState(40);
			ArchiveLoader.field1037 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
