import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test. Created Feb 21, 2021.
 */
public class sl {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("cost and date");
		double max = 0, selecteddate = 0;
		for (double i = 1; i != 0;) {
			double c = s.nextDouble();
			i = c;
			double d = s.nextDouble();


			if (c / d > max) {
				max = c / d;
				selecteddate = d;
			}
		}
		System.out.println(selecteddate);
	}
}
