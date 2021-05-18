public class HCForGCD {
	public static int gcd(int a, int b) {
		System.out.println( a + " , " + b);
		if (a == 0) {
			return b;
		}

		return gcd(b % a, a);
	}

	public static void main(String[] args) {
		int a = 0, b = 20, g;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b + ") = " + g);

		a = 35;
		b = 11;
		g = gcd(a, b);
		System.out.println("GCD(" + a + " , " + b + ") = " + g);

		a = 31;
		b = 4;
		g = gcd(a , b);
		System.out.println("GCD(" + a + " , " + b + ") = " + g);

	}
}
