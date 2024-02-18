import java.util.Scanner;

public class packageAPI {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = myObj.nextLine();
		
		System.out.println("Enter age");
		String age = myObj.nextLine();
		
		System.out.println("Enter Company Name");
		String company = myObj.nextLine();
		
		System.out.println("Enter Department Name");
		String department = myObj.nextLine();
		
		System.out.println("your name is : "+name);
		System.out.println("your age is : "+age);
		System.out.println("Company name is : "+company);
		System.out.println("Department name is : "+department);
	}
	
}
