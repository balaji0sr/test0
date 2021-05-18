//$Id$
package array;

import java.util.Scanner;

public class Patternprinting {
	public static void main(String args[]) {

		System.out.println("input");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		int line_no = 1;
		int curr_star = 0;
		
		for (line_no = 1; line_no <= x ;) {

			if (curr_star < line_no) {
				System.out.print("* ");
				curr_star++;
			}

			if (curr_star == line_no) {
				System.out.println(" ");
				line_no++;
				curr_star = 0;
			}
		}
	}
}