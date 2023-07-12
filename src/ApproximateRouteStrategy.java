public class ApproximateRouteStrategy extends RouteStrategy {

	public static FriendSystem friendSystem;

	public static NetFileRequest NetCache_currentResponse;

	ApproximateRouteStrategy() {
	}

	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel) Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long) var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	static final void method1186(int var0, int var1, int var2) {
		if (class208.cameraX < var0) {
			class208.cameraX = (var0 - class208.cameraX) * LoginScreenAnimation.field1255 / 1000 + class208.cameraX
					+ UserComparator4.field1410;
			if (class208.cameraX > var0) {
				class208.cameraX = var0;
			}
		}

		if (class208.cameraX > var0) {
			class208.cameraX -= (class208.cameraX - var0) * LoginScreenAnimation.field1255 / 1000
					+ UserComparator4.field1410;
			if (class208.cameraX < var0) {
				class208.cameraX = var0;
			}
		}

		if (class152.cameraY < var1) {
			class152.cameraY = (var1 - class152.cameraY) * LoginScreenAnimation.field1255 / 1000 + class152.cameraY
					+ UserComparator4.field1410;
			if (class152.cameraY > var1) {
				class152.cameraY = var1;
			}
		}

		if (class152.cameraY > var1) {
			class152.cameraY -= (class152.cameraY - var1) * LoginScreenAnimation.field1255 / 1000
					+ UserComparator4.field1410;
			if (class152.cameraY < var1) {
				class152.cameraY = var1;
			}
		}

		if (ByteArrayPool.cameraZ < var2) {
			ByteArrayPool.cameraZ = (var2 - ByteArrayPool.cameraZ) * LoginScreenAnimation.field1255 / 1000
					+ ByteArrayPool.cameraZ + UserComparator4.field1410;
			if (ByteArrayPool.cameraZ > var2) {
				ByteArrayPool.cameraZ = var2;
			}
		}

		if (ByteArrayPool.cameraZ > var2) {
			ByteArrayPool.cameraZ -= (ByteArrayPool.cameraZ - var2) * LoginScreenAnimation.field1255 / 1000
					+ UserComparator4.field1410;
			if (ByteArrayPool.cameraZ < var2) {
				ByteArrayPool.cameraZ = var2;
			}
		}

	}
}
