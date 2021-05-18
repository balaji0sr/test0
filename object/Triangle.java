package object;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test.
 *         Created Jan 21, 2021.
 */
public class Triangle {
int a , b , c;
public double getarea () {
	double s = getparimeter();
	System.out.println("s " + s );
	System.out.println(s*(s-a)*(s-b)*(s-c));
	return Math.pow((s*(s-a)*(s-b)*(s-c)), .5);
}
public double getparimeter() {
	return (double)(a+b+c)/2;
}
}
