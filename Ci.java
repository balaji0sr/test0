
public class Ci {
	public static void main(String[] arg) {
	     double p = 80000 ;
		double r = 0.075/12;
		double  t = 7.5 ;
		int n = 12 ; 
		double  powerfactor = n * t;
		double x = p;
		for(int y = 1 ;y < powerfactor; y++){
			 p = (p *(1+r)) + x ;
		}
		System.out.println(p);
	}
}
