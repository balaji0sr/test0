package dp;

import java.util.Scanner;

public class fibb {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.println("Input array length: ");
				int x = arraylength.nextInt();
				
				int a = 1;
				int b = 1;
				System.out.print(a + " " + b );
				for (int y = 3 ; y < x ;y++) {
					if (y % 2 != 0) {
						a = a + b;
						System.out.print(" " + a );
					} else {
						
						b = a + b;
						System.out.print(" " + b );
					}
					
				}

				System.out.println(" "  );

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
