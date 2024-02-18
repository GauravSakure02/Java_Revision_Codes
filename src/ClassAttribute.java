
public class ClassAttribute {
	int x =10;
	
	public static void main(String args[]) {
		ClassAttribute myObj = new ClassAttribute();
		ClassAttribute myObj2 = new ClassAttribute();
		myObj2.x = 20;
		System.out.println(myObj.x);
		System.out.println(myObj2.x);
		
	}
}
