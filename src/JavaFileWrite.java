import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWrite {
	public static void main(String args[]) {
		try {
			FileWriter myWrite = new FileWriter("zayarmyat.txt");
			myWrite.write("In the following example, we use the FileWriter class");
			myWrite.close();
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
}
