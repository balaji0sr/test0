package interviewPrograms;

import java.util.*;

public class RemaindersUptoN {
	static void findRemainders(int n) {

		/*HashSet<Integer> vc = new HashSet<Integer>();

		for (int i = 1; i <= Math.ceil(Math.sqrt(n)); i++) {
			vc.add(n / i);
			System.out.print(n / i + " ");

		}
		System.out.println( " ");

		for (int i = (int) (n / Math.ceil(Math.sqrt(n)) - 1); i >= 0; i--){
			System.out.print(i + " ");

			vc.add(i);}
		System.out.println( " ");


		for (long it : vc)
			System.out.print(it + " ");*/

		
		  for (int i = n; i > n / 2; i--) { 
			  System.out.print(n % i + " ");
		  } 
		  System.out.print(n); 
	} 

	public static void main(String[] args) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int n = arraylength1.nextInt();

				findRemainders(n);

				continueLoop = false;

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
