
public class Constructors {
	int x;
	public Constructors(int y){
		 x = y;
	}
	public static void main(String args[]) {
		Constructors myObj = new Constructors(13);
		System.out.println(myObj.x);
	}
}
