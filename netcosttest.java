import java.util.Arrays;
import java.util.Scanner;

public class netcosttest {
	public static void main(String[] arg) {

		Scanner inputno = new Scanner(System.in);
		System.out.print("No of string:");
		int no = inputno.nextInt();
		float[] cost = new float[no];
		float[] date = new float[no];
		//float[] data = new float[no];
		float []costperday = new float[no];

		for (int i = 0; i < no; i++) {
			System.out.println("no " + i);

			Scanner inputno1 = new Scanner(System.in);
			System.out.println("cost : ");
			cost[i] = inputno1.nextFloat();

			Scanner inputno2 = new Scanner(System.in);
			System.out.println("date : ");
			date[i] = inputno2.nextFloat();

			/*Scanner inputno3 = new Scanner(System.in);
			System.out.println("data : ");
			data[i] = inputno3.nextFloat();*/
		}

		for (int i = 0; i < no; i++) {

			costperday[i] = cost[i] / date[i];

			System.out.println("cost : " + cost[i] + " date : " + date[i] +/* " data : " + data[i] +*/" costperday = " + costperday[i]);

		}
		Arrays.sort(costperday);
		System.out.println(Arrays.toString(costperday));

	}

}
