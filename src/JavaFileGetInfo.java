import java.io.File;

public class JavaFileGetInfo {
	public static void main(String args[]) {
		File myObj = new File("zayarmyat.txt");
		if(myObj.exists()) {
			System.out.println("File name :"+ myObj.getName());
			System.out.println("File Path :"+ myObj.getAbsolutePath());
			System.out.println("File canWrite :"+ myObj.canWrite());
			System.out.println("File canRead :"+ myObj.canRead());
			System.out.println("File size byte :"+ myObj.length());
		}else {
			System.out.println("An error Occured");
		}
	}
}
