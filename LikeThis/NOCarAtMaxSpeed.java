//$Id$
package LikeThis;

import java.util.Scanner;

public class NOCarAtMaxSpeed {
	public static void main(String[] arg) {
		Scanner input1 = new Scanner(System.in);
		System.out.print("Input no of cars : ");
		int car = input1.nextInt();
		System.out.println(car);
		
		System.out.print("Input speed of cars : ");
		int[] speedarr = new int[car];
		for (int a = 0; a < car; a++) {
			Scanner speedinarray = new Scanner(System.in);
			speedarr[a] = speedinarray.nextInt();
			System.out.println(speedarr[a]);
		}

		int CarAtMaxSpeed = 1;
		System.out.println(CarAtMaxSpeed);
		if (car == 1) {
			System.out.println(CarAtMaxSpeed);
		} else if (car <= 0) {
			System.out.println(0);
		} else {
			for (int a = 1; a < car; a++) {
				boolean maxspeed = false;
			
				for (int b = 0; b < a; b++) {
				if (speedarr[a]  speedarr[a - 1]) {
					CarAtMaxSpeed++;
				}
			}
		}

		System.out.println(CarAtMaxSpeed);

	}
}