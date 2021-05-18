package interviewPrograms;

import java.util.Scanner;

public class SortIncreasingDecreasingArray {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int x = arraylength1.nextInt();
				if (x > 0) {
					int[] nums = new int[x];

					System.out.println("input values to the array");
					for (int a = 0; a < x; a++) {
						Scanner numsinarray = new Scanner(System.in);
						nums[a] = numsinarray.nextInt();
					}
					for (int a = 0; a < x - 1; a++) {
						int temp = nums[a];
						int index = a ;

					
						for (int b = a + 1; b < x; b++) {
							if (nums[b] < temp ){
								temp = nums [b];
								index = b ;
							}
						}
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
