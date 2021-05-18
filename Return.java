

public class Return {

public static void main(String args[]){
	int x = 3 , y = 3 ;
	System.out.println(dothing(x , y));
}
static int  dothing(int x , int y ){
	if (y==0) return 0 ;
	
	return (x + dothing (x , y - 1));
	
}
}
