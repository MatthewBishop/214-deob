import java.io.IOException;

public abstract class AbstractSocket {
	AbstractSocket() {
	}

	public abstract boolean isAvailable(int var1) throws IOException;

	public abstract int available() throws IOException;

	public abstract int readUnsignedByte() throws IOException;

	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	public abstract void close();

	static void method7950(int var0) {
	}

	static final int method7958(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 'ﾀ') + var1;
		}
	}
}
