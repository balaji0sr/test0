package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sockmerchant {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength = new Scanner(System.in);
				System.out.println("lenth of array : ");
				int al = arraylength.nextInt();
				int[] x = new int[al];

				System.out.println("element of array : ");
				for (int y = 0; y < al; y++) {
					Scanner numsinarray = new Scanner(System.in);
					x[y] = numsinarray.nextInt();
				}
				
				int count = 0;

			/*	ArrayList<Integer> list = new ArrayList<>();
				for (int y = 0; y < al ; y++){
					if (list.Contains(x[y])){
						
					}
				}*/
				
				Arrays.sort(x);
				int z = Integer.MIN_VALUE;
				for (int y = 0; y < al ; y++) {
					
					 if (x[y] == z) {
						count++;
						z = Integer.MIN_VALUE;
					} else {
						 z = x[y] ;
					}
				}
				
				System.out.println(" pair of socks : " + count);
				continueLoop = false ;

			} catch (Exception string) {
				System.out.println("Can't process the given input ");
			}
		}
	}
}
