package communityuni.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeFileFactory {

	public static boolean saveFile(Object data, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
			oos.close();
			fos.close();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public static Object readFile(String path) {
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			
			ois.close();
			fis.close();
			
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
