
/**
 * TODO Put here a description of what this class does.
 *33.417
 * @author balaji.
 *         Created Oct 7, 2020.
 */
public class FD {
public static void main(String args[]){
	int a = 1500;
	int year = 10;
	int m = year*12;
	double r =  7/100;
	 System.out.println(r);

	double fa = 0 ;
	 for (int i = 0 ; i < m ; i ++){
		 
		 fa = fa + a;
		 fa = fa + (fa*r);
		
		 System.out.println(i+1);
		 System.out.println(fa);

	 }
	 System.out.println(fa);
}
}
