import java.util.ArrayList;

//$Id$

public class Test13 {

	public static void main (String [] args){
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		for(int i : al){

			System.out.println(i);
			al.add(70);
			System.out.println(i);

		}
	}
	

	
}
