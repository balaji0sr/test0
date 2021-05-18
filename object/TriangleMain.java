package object;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test. Created Jan 21, 2021.
 */
public class TriangleMain {
	public static void main(String[] arg) {
		Triangle t = new Triangle();
		Triangle s = new Triangle();
		s.a = 1;
		s.b = 1;
		s.c = 1;

		t.a = 2;
		t.b = 4;
		t.c = 5;
		t.c = 0;
		System.out.println("parimeter = " + t.getparimeter());
		System.out.println(t.getarea());
		
		System.out.println(s.getparimeter());
		System.out.println(s.getarea());
	}
}
