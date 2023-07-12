import java.util.HashMap;
import java.util.Map;

public class Messages {

	static final Map Messages_channels = new HashMap();

	static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);

	static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();

	

	static int Messages_count = 0;

	static Archive field1377;

	static TextureProvider textureProvider;

	static class343[] method2772() {
		return new class343[] { class343.field3838, class343.field3837 };
	}

	static void method2771() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class10.clientPreferences.method2529() != null) {
				Login.Login_username = class10.clientPreferences.method2529();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field722) {
			Client.field723[var0.rootIndex] = true;
		}

	}
}
