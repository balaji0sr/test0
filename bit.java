public class bit {

	@SuppressWarnings("javadoc")
	public static void main(String[] arg) {

		int count = 0;
		int x = 14;
System.out.println(x & (x << 1));
		while (x != 0) {
			// This operation reduces length
			// of every sequence of 1s by one.
			x = (x & (x << 1));

			count++;
		}
	}
}
