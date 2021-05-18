import java.util.*;

public class set {
	/*
	 * public static void main(String[] arg) { int arr[] = {1, 94, 93, 999,
	 * 1000, 5, 92, 78 , 78}; int n = arr.length; HashSet<Integer> s = new
	 * HashSet<Integer>(); for (int i = 0; i < n; i++) { s.add(arr[i]);
	 * System.out.println(s);} } }
	 */
	public static void main(String args[]) {
		int n = 7;
		
		for (int line = 0; line < n; line++) {

			for (int i = 0; i <= line; i++)
				System.out.print(binomialCoeff(line, i) + " ");

			System.out.println();
		}
	}

	static int binomialCoeff(int n, int k) {
		int res = 1;

		if (k > n - k)
			{k = n - k;}

		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

}