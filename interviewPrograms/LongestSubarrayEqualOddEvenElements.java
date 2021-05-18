package interviewPrograms;

import java.util.Scanner;

public class LongestSubarrayEqualOddEvenElements {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int x = arraylength1.nextInt();
				if (x > 0) {
					int[] nums1 = new int[x];

					System.out.println("input values to the array");
					for (int a = 0; a < x; a++) {
						Scanner numsinarray = new Scanner(System.in);
						nums1[a] = numsinarray.nextInt();
					}
					
		   			int oddcount = 0 ;
					int evencount = 0 ;
					for (int a = 0; a < x; a++) {
						if (nums1[a]%2 == 0){
							evencount++;
						}else{
							oddcount++;
						}
					}
					if (evencount < oddcount){
						System.out.println(evencount*2);
					}else{
						System.out.println(oddcount*2);
					}
					
					
					continueLoop = false;
				}
				} catch (Exception string) {
					System.out.println("can't process the given input");
				}
			}
		}
	}
