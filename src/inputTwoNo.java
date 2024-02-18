import java.util.Scanner;

public class inputTwoNo {
	public static void main(String args[]) {
		int x, y, sum;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Type input no : ");
		x = myObj.nextInt();
		
		System.out.println("Type another no : ");
		y = myObj.nextInt();
		
		sum = x+y;
		System.out.println("sum is : " + sum);	
	}
}
