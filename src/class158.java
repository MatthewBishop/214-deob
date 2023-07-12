import java.util.List;

public abstract class class158 extends Node {

	static List field1737;

	class158() {
	}

	abstract void vmethod3370(Buffer var1);

	abstract void vmethod3371(ClanChannel var1);

	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = FriendSystem.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}
}
