public class GameBuild {

	static final GameBuild LIVE = new GameBuild("LIVE", 0);

	static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);

	static final GameBuild RC = new GameBuild("RC", 1);

	static final GameBuild WIP = new GameBuild("WIP", 2);

	static StudioGame field3841;

	public final String name;

	

	final int buildId;

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}
}
