public class class448 {

	public static final class448 field4717 = new class448("application/json");

	static final class448 field4715 = new class448("text/plain");

	

	public static int canvasWidth;

	String field4716;

	class448(String var1) {
		this.field4716 = var1;
	}

	public String method8223() {
		return this.field4716;
	}

	static final void method8227() {
		if (class14.ClanChat_inClanChat) {
			if (class406.friendsChat != null) {
				class406.friendsChat.sort();
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInFriendsChat();
			}

			class14.ClanChat_inClanChat = false;
		}

	}
}
