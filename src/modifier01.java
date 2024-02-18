
public class modifier01 {
	public static void main(String args[]) {
		Student3 myObj = new Student3();
		Courses myObj2 = new Courses();
		
		System.out.println("name : "+myObj.fname+" "+myObj.lname);
		System.out.println("email : "+myObj.email);
		System.out.println("age : "+myObj.age);
		System.out.println("Major : "+myObj.major);
		System.out.println("----------Core Subject ------------");
		System.out.println("1 : "+myObj2.subject);
		System.out.println("2 : "+myObj2.subject2);
		System.out.println("3 : "+myObj2.subject3);
		System.out.println("4 : "+myObj2.subject4);
		
	}
}
