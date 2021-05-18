package greedyAlgorithms;
import java.util.*;

import java.util.Arrays;
import java.util.Scanner;

public class LuckBalance {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner value = new Scanner(System.in);
				System.out.print("input no of contests : ");
				int c = value .nextInt();
				
				Scanner value2  = new Scanner(System.in);
				System.out.print("no of important contest can lose : ");
				int w = value2.nextInt();
				
				int[][] a = new int[c][2];
				if (c > 0) {
					for (int i = 0; i < c; i++) {
						System.out.println("contests no " + (i + 1) );
						System.out.println("amount of luck " );

							Scanner input1 = new Scanner(System.in);
							a[i][0] = input1.nextInt();
							System.out.println("contest type " );

							Scanner input2 = new Scanner(System.in);
							a[i][1] = input2.nextInt();
						}

			        List<Integer> list = new ArrayList<Integer>();
			        int listlength = 0 ;
					int sum = 0 ;
					for (int i = 0; i < c; i++) {
						sum = sum + a[i][0] ;

						if (a[i][1] > 0 ){
						
							 list.add(a[i][0]);
							 listlength++ ;
						}
					}
					
					 Collections.sort(list); 
					
					 for(int i=0;i<listlength-w;i++){
				            sum = sum - list.get(i)*2;
				        }
					
					System.out.println(sum);
					 
				}
				continueLoop = false;
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
