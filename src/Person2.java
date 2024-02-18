
abstract class Person2 {
	public String name = "Yamin";
	public String major = "Math";
	public String email = "Yamin@gmail.com";
	public int age = 23;
	public abstract void study();
}

class Student2 extends Person2 {
	public int graduationyear = 2020;
	public void study() {
		System.out.println("Studying all day long");
	}
}
