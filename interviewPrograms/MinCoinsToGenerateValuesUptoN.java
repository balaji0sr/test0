package interviewPrograms;

import java.util.Scanner;

public class MinCoinsToGenerateValuesUptoN {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int x = arraylength1.nextInt();

				int i = 0;
				for (i = 0; Math.pow(2, i) <= x; i++) {

					int a = (int) Math.pow(2, i);
					System.out.print(a + " ");

				}

				System.out.println(" ");

				System.out.println("no of coins : " + i);

				continueLoop = false;

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
