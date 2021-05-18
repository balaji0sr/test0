package recursion;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Dec 1, 2020.
 */
public class PrintNnumbers {
/**
 * TODO Put here a description of what this method does.
 *
 * @param args
 */
	public static void main(String[] args) {
	int n = 10;
	print(1 , n);
}
/**
 * TODO Put here a description of what this method does.
 *
 * @param i
 * @param x
 */
public static void print(int i ,int x){
	if(x>i){
		System.out.print(i);
		print(i+1 , x);
	}
	System.out.println(i);

}
}
