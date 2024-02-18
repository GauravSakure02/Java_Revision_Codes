import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTime2 {
	public static void main(String args[]) {
		LocalDateTime myObj = LocalDateTime.now();
		
		System.out.println("Before Formatting : "+ myObj);
		
		DateTimeFormatter myforobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String myformatteddate = myObj.format(myforobj);
		System.out.println("After Formatting : "+ myformatteddate);
	}
}
