package interviewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctIntegers {
	public static void main(String args[]) {
		Scanner arraylength = new Scanner(System.in);
		System.out.print("Input integer ");
		int x = arraylength.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int y = 2; y < x; y++) {
			if (x / y < y) {
				break;
			}

			if (x % y == 0) {
				list.add(y);
				if (x / y != y) {
					list.add(x / y);
				}
			}
		}

		boolean found = false;
		int k = list.size();

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				int b = (list.get(i) * list.get(j));
				int a = x / b;

				boolean ans = list.contains(a);

				if (i != j && ans && x % b == 0 && a != list.get(i)
						&& x / a != list.get(j)) {

					System.out.println(list.get(i) + " " + list.get(j) + " "
							+ (a));
					found = true;
					break;
				}

			}
			if (found) {
				break;
			}
		}
		if (!found) {
			System.out
					.print("no distinct integers of triplet for given product");

		}
	}
}
