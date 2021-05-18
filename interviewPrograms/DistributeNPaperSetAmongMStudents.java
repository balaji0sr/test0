package interviewPrograms;

import java.util.Scanner;

public class DistributeNPaperSetAmongMStudents {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner sudents = new Scanner(System.in);
				System.out.print("no of students : ");
				int s = sudents.nextInt();

				Scanner papersets = new Scanner(System.in);
				System.out.print("no of paper sets : ");
				int p = papersets.nextInt();

				int mod = 1000000007;
				long res = 1;

				for (int a = 2; a <= p; a++) {

					res = res * (a % mod);
					res = res % mod;
				}

				System.out.println(res);

				continueLoop = false;

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
