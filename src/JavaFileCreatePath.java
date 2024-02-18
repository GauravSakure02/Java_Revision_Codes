import java.io.File;
import java.io.IOException;

public class JavaFileCreatePath {
	public static void main(String args[]) {
		try {
			File myObj = new File("D:\\Tutorial3\\thuraaung.txt");
			if(myObj.createNewFile()) {
				System.out.println("File name :"+myObj.getName());
				System.out.println("File Path :"+myObj.getAbsolutePath());
			}else {
				System.out.println("File already exist");
			}
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
