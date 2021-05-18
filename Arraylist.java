import java.util.ArrayList;
import java.util.Arrays;


/**
 * TODO Put here a description of what this class does.
 * 
 * @author sathish kumar. Created Oct 12, 2020.
 */
public class Arraylist {
	public static void main(String args[]) {
		// initialize ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		// add elements to ArrayList object
		al.add(3);
		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);
		System.out.println("Using Advanced For Loop");
		// printing ArrayList
		for (Integer Al : al) {
			System.out.println(Al);
		}

		int[] arr = new int[al.size()];

		for (int i = 0; i < al.size(); i++) {
			arr[i] = al.get(i);
		}

		System.out.println(Arrays.toString(arr));

	}
}
