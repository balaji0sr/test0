package justsolving;

import java.util.Scanner;

public class year {
	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		System.out.print("input year : ");
		int r = line.nextInt();

		int a = 0, b = 0, c = 1, count = 0;

		while (r > 0) {

			a = r % 10;
			b = (a * c) + b;
			c *= 10;
			r /= 10;
			// System.out.println(r + " + " + b);
			if (b > r & a != 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
