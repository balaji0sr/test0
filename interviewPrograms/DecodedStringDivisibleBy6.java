package interviewPrograms;

import java.util.Scanner;

public class DecodedStringDivisibleBy6 {
	public static void main(String[] arg) {

		Scanner string = new Scanner(System.in);
		System.out.print("string : ");
		String str = string.nextLine();
		int x = str.length();

		if (((int) str.charAt(x - 1) - 96) % 2 == 0) {
			int digisum = 0;

			for (int i = 0; i < x; i++) {

				int y = str.charAt(i);
				y = y - 96;

				while (y > 0) {
					digisum = digisum + (y % 10);
					y = y / 10;
				}
			}
			
			if (digisum % 3 == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		} else {
			System.out.println("no");
		}
	}
}
