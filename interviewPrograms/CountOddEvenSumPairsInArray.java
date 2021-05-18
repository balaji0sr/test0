package interviewPrograms;

import java.util.Scanner;

public class CountOddEvenSumPairsInArray {
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
					
					int oddcount = 0 ;
					int evencount = 0 ;
					
					for (int i = 0 ; i < x ; i++){
						if (nums[i] % 2 == 0){
							evencount++;
						}else{
							oddcount++;
						}
					}
					
					int oddsumpairs = oddcount * evencount ;
					int evensumpair = ((evencount * (evencount - 1)) + (oddcount * (oddcount - 1))) / 2 ;
					
					System.out.println("no of pairs with odd sum" + oddsumpairs);
					System.out.println("no of pairs with even sum" + evensumpair);
					continueLoop = false;
				}          

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}