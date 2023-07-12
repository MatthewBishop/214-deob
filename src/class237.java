import java.awt.Component;

public class class237 {

	public static MusicTrack musicTrack;

	static LoginScreenAnimation loginScreenRunesAnimation;

	

	static int menuWidth;

	static void method4769(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
