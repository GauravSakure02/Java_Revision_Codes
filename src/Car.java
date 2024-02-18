
public class Car {
	String modelname;
	int modelyear;
	
	public Car(String name, int year) {
		modelname = name;
		modelyear = year;
		
	}
	public static void main(String args[]) {
		Car myObj = new Car("Suzuki",2010);
		System.out.println("Brand : "+ myObj.modelname);
		System.out.println("Year : "+ myObj.modelyear);
	}
}	
