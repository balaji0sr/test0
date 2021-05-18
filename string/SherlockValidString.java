package string;

import java.util.ArrayList;
import java.util.Scanner;

public class SherlockValidString {
	public static void main(String[] arg) {

		Scanner input1 = new Scanner(System.in);
		System.out.print("Input string: ");
		String str = input1.nextLine();

		boolean present = true ;
		int count ;
		int count1 = 0;
		int count2 = 0;
		int countofcount1 = 0;
		int countofcount2 = 0;
		/*
		 * ArrayList<Character> list = new ArrayList<>();
		 * 
		 * for (int x = 0 ; x < str.length() ; x++ ){ list.add(str.charAt(x)); }
		 */

		for (int x = 0; x < str.length(); x++) {
			char c = str.charAt(x);
			count = 1;
			for (int y = x + 1; y < str.length(); y++) {
				if (c == ' '){
					break ;
				}

				if (str.charAt(x) == c) {
					count ++;
				}

			}
			if (count1 == 0 || count == count1 ){
			count1 = count ;
			countofcount1++;
			}else if (count2 == 0 || count == count2){
				count2 = count ;
				countofcount2++;
			}else if (count1 != count && count2 != count ){
				present = false;
				break;
			}
			if (countofcount1 > 1 && countofcount2 > 1 ){
				present = false;
				break ;
			}
			str = str.replace(c ,' ');

		}
		if (present){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}
}
