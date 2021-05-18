import java.io.*;

public class Box implements Serializable {

	int width;
	int height;

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}
	public static void main (String[] args) {
		Box myBox =new Box() ;
		myBox.setWidth(50);
		myBox.setHeight(20);
		try { 
			FileoutputStream fs = new FileOUtputStream("foo.ser") ;
			ObjectOUtputStream os = new ObjectOUtputStream(fs);
			os.writeObject(myBox);
}
