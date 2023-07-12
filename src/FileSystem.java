import java.io.File;
import java.util.Hashtable;

public class FileSystem {

	static boolean FileSystem_hasPermissions = false;

	static File FileSystem_cacheDir;

	static Hashtable FileSystem_cacheFiles = new Hashtable(16);
}
