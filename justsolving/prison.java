//$Id$
package justsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class prison {

	public static void main(String[] arg) {

		Scanner arraylength1 = new Scanner(System.in);
		System.out.print("Input array length of 1st array : ");
		int x = arraylength1.nextInt();

		System.out.println("input values to the array");
		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < x; i++) {
			Scanner numsinarray = new Scanner(System.in);
			int a = numsinarray.nextInt();
			nums.add(a);
		}

		while (nums.size() > 0) {
			boolean loop = true;
			for (int a = 0; a < nums.size() - 1; a++) {
				System.out.println(a);
				if ((nums.get(a) > 0 && nums.get(a + 1) < 0) || (nums.get(a) < 0 && nums.get(a + 1) < 0)) {
					nums.remove(a);
					nums.remove(a + 1);
					
					a--;
					loop = false;
				} else {
					
				}
			}
			if (loop) {
				break;
			}
		}
System.out.println(nums.size());
	}

}
