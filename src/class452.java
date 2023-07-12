public class class452 {

	static final int[] field4731 = new int[16384];

	static final int[] field4730 = new int[16384];

	static String operatingSystemName;

	static {
		double var0 = 3.834951969714103E-4;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4731[var2] = (int) (16384.0 * Math.sin((double) var2 * var0));
			field4730[var2] = (int) (16384.0 * Math.cos((double) var2 * var0));
		}

	}
}
