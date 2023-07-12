import java.applet.Applet;

public class RunException extends RuntimeException {

	public static Applet RunException_applet;

	public static String field5176;

	String message;

	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
