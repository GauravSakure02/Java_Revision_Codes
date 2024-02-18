import java.io.File;
import java.io.IOException;

public class JavaFileCreate {
	public static void main(String args[]) {
		try {
			File myObj = new File("zayarmyat.txt");
			if(myObj.createNewFile()) {
				System.out.println("File name :"+myObj.getName());
			}else {
				System.out.println("File already exist");
			}
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
