package interviewPrograms;

import java.util.Scanner;

public class LongestUpDownSubsetInsertingAtmostOneInt {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int n = arraylength1.nextInt();

				if (n > 0) {
					int[] arr = new int[n];
					System.out.println("input values to the array");

					for (int a = 0; a < n; a++) {
						Scanner numsinarray = new Scanner(System.in);
						arr[a] = numsinarray.nextInt();
					}

					
					
					
					
					
					
					
					
					
					
					
					
					
					
					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
