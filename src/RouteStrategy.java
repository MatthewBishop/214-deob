public abstract class RouteStrategy {

	

	public int approxDestinationX;

	

	public int approxDestinationY;

	

	public int approxDestinationSizeX;

	

	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.loadInterface(var0)) {
			UserComparator3.updateInterface(class16.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5,
					var6);
		}
	}

	public static boolean method4214() {
		return Client.staffModLevel >= 2;
	}
}
