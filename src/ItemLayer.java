import java.io.IOException;
import java.net.Socket;

public final class ItemLayer {

	

	int z;

	

	int x;

	

	int y;

	Renderable first;

	Renderable second;

	Renderable third;

	

	long tag;

	

	int height;

	ItemLayer() {
	}

	public static AbstractSocket method4271(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
