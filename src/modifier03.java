class Persona {
	  protected String fname = "John";
	  protected String lname = "Doe";
	  protected String email = "john@gmail.com";
	  protected int age = 24;
}

public class modifier03 extends Persona {
	private int graduationYear = 2018;
	  public static void main(String[] args) {
		  modifier03 myObj = new modifier03();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
}
}


