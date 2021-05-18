package justsolving;

import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author sathish kumar. Created Oct 30, 2020.
 */
public class YearSeparation {
	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		System.out.print("input year : ");
		int r = line.nextInt();

		// for (int i = r ; i > 0 ; i = i/10){

		while (r > 0) {

			int a = r % 10;
			r /= 10;
			System.out.println(r + " + " + a);
			if (a > r) {
				System.out.println(r + " + " + a);
			}

		}

	}

}
