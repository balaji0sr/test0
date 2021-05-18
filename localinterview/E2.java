package localinterview;

public class E2 {
	
		 public static void main(String[] args)
		 {
		   int A=10;
		   {
		     int B=20;
		     System.out.println("Block A: "+A);
		     System.out.println("Block B: "+B);
		   }//scope of B=20 ends here
		   {
		   int B=30;//scope of B=30 starts here
		   System.out.println("Block A: "+A);
		   System.out.println("Block B: "+B);
		   }//scope of B=30 ends here
		   int B=40;//scope of B=40 starts here
		   {
		     System.out.println("Block A: "+A);
		     System.out.println("Block B: "+B);

		   }
		 }//scope of all the variables end here 
		}

