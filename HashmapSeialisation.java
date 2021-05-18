import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author sathish kumar. Created Oct 13, 2020.
 */
public class HashmapSeialisation {
	public static void main(String args[]) {

		// Creating a HashMap of Integer keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "Value1");
		hashmap.put(2, "Value2");
		hashmap.put(3, "Value3");
		hashmap.put(4, "Value4");
		hashmap.put(5, "Value5");
		try {
			FileOutputStream fos = new FileOutputStream("hashmap.text");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hashmap);
			oos.close();
			fos.close();
			System.out
					.printf("Serialized HashMap data is saved in hashmap.ser");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
