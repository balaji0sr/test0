package interviewPrograms;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength = new Scanner(System.in);
				System.out.print("Input 2d array length : ");
				int x = arraylength.nextInt();
				
				int[] arr = new int[x];
				
				Scanner arrayvalues = new Scanner(System.in);
				System.out.print("Input 2d array length : ");
				for (int i = 0 ; i < x ; i++){
					 arr[i] = arrayvalues.nextInt();
				}
				
				int largest = INT_MIN;
				for (int i = 0 ; i < x ; i++){
					
				}
				
				
				
				
				
				
				
				
				
				
				continueLoop = false;
			} catch (Exception e) {
				System.out.println("can't process the given input");
			}
		}
	}
}
