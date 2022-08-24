package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilenotrFound {

	public static void main(String[] args) {
		File file = new File("C:/Java2blog.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			while (fis.read() != -1) {
				System.out.println(fis.read());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
