public class class336 {

	static void method6569() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				HealthBarUpdate.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
