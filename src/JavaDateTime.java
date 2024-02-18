import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDateTime {
	public static void main(String args[]) {
		LocalDate myObj = LocalDate.now();
		LocalTime myObj2 = LocalTime.now();
		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println(myObj);
		System.out.println(myObj2);
		System.out.println(myObj3);
	}
}
