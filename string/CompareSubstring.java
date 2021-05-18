package string;

import java.util.Scanner;

public class CompareSubstring {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner input1 = new Scanner(System.in);
				System.out.print("Input string: ");
				String str1 = input1.nextLine();

				Scanner input2 = new Scanner(System.in);
				System.out.print("Input string: ");
				String str2 = input2.nextLine();

				boolean present = false;
				
				for (int x = 0; x < str1.length(); x++) {
					if (str2.indexOf(str1.charAt(x)) > -1) {
						present = true;
						break;
					}
				}
				
				if (present){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
				   
				continueLoop = false ;
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
