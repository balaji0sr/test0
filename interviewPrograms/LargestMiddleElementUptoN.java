package interviewPrograms;

import java.util.Scanner;

public class LargestMiddleElementUptoN {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner integer = new Scanner(System.in);
				System.out.print("no of intervels : ");
				int x = integer.nextInt();
				
				int count = 0 ;
				if (x > 2) {
					
					for (int i = 1 ; i < x ; i++ ){
						for (int j = 1 ; j <= x ; j++ ){
							if (i < j){
							for (int k = 1 ; k < x ; k++ ){
								System.out.println(i + " " + j + " " + k);

									if (i < j && j > k && i != k ){
										count++;
									
									}
									}
							}
						}
					}
				

					System.out.println(count);
				continueLoop = false;
			}

		} catch (Exception string) {
			System.out.println("can't process the given input");
		}
	}
}
}


