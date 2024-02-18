import java.io.File;

public class JavaFileDelete {
	public static void main(String args[]) {
		File myObj = new File("thura.txt");
		if(myObj.delete()) {		
			System.out.println("Successfully deleted "+myObj.getName());
		}
		else {
			System.out.println("An error occured");
		}
	}
}
