public class UserComparator5 extends AbstractUserComparator {

	static int[] Tiles_hue;

	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy) var1, (Buddy) var2);
	}

	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel) Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	static class137 method2865(int var0) {
		class137 var1 = (class137) GameObject.findEnumerated(LoginScreenAnimation.method2429(), var0);
		if (var1 == null) {
			var1 = class137.field1600;
		}

		return var1;
	}
}
