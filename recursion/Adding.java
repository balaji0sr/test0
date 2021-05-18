package recursion;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Oct 23, 2020.
 */
public class Adding {
	public static void main(String[] args) {
	    int result = sum(5, 10);
	    System.out.println(result);
	  }
	  public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } 
	      return end;
	  }
}
