package greedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength = new Scanner(System.in);
				System.out.print("lenth of array : ");
				int al = arraylength.nextInt();
				int[] x = new int[al];

				System.out.print("element of array : ");
				for (int y = 0; y < al; y++) {
					Scanner numsinarray = new Scanner(System.in);
					x[y] = numsinarray.nextInt();
				}
				
				Scanner arraylength2 = new Scanner(System.in);
				System.out.print("lenth of subarray : ");
				int al2 = arraylength2.nextInt();
				int[] w = new int[al2];
				
				Arrays.sort( x );

				int min = Integer.MAX_VALUE;
				for (int j = 0; j <= al - al2 ; j++) {

					int l = 0 ;
					for (int i = j; i < j + al2 ; i++) {
						w[l] = x[i];
						l++;
					}					

					if (w[al2 - 1] - w[0] < min){
						min = w[al2 - 1] - w[0] ;  
					}
				}
				System.out.println(min);
				continueLoop = false ;

			} catch (Exception string) {
				System.out.println("Can't process the given input ");
			}
		}
	}
}
