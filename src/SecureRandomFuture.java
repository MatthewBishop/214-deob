import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SecureRandomFuture {

	

	static int js5Port;

	ExecutorService executor = Executors.newSingleThreadExecutor();

	Future future;

	SecureRandomFuture() {
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	boolean isDone() {
		return this.future.isDone();
	}

	SecureRandom get() {
		try {
			return (SecureRandom) this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}
}
