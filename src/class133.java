import java.awt.FontMetrics;
import java.util.concurrent.Callable;

class class133 implements Callable {

	static FontMetrics loginScreenFontMetrics;
	// $FF: synthetic field

	final class136 this$0;
	// $FF: synthetic field

	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	class133(class136 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3069(this.val$p, this.val$version);
		return null;
	}

	public static void method3038(AbstractArchive var0) {
	}

	public static boolean method3039(int var0) {
		return var0 >= WorldMapDecorationType.field3801.id && var0 <= WorldMapDecorationType.field3786.id
				|| var0 == WorldMapDecorationType.field3799.id;
	}
}
