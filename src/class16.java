import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class16 implements ThreadFactory {

	public static Widget[][] Widget_interfaceComponents;

	static SpritePixels[] worldSelectBackSprites;

	final ThreadGroup field81;

	final AtomicInteger field79;
	// $FF: synthetic field

	final class14 this$0;

	class16(class14 var1) {
		this.this$0 = var1;
		this.field79 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field81 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field81, var1,
				this.this$0.field69 + "-rest-request-" + this.field79.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	public static String method218(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class332.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = MusicPatchNode2.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}
}
