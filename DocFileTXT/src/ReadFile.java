import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {
	public static ArrayList<String> docFileTxt(String path) {
		ArrayList<String> dsData = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();

			while(line!=null) {
				if(line.length()>0) dsData.add(line);
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return dsData;
	}
	public static void main(String[] args) {
		ArrayList<String> datanew = docFileTxt("D:/DuyTuanJava/DocFileTXT/test.txt");
		for(String i: datanew)
			System.out.println(i);
	}
}
