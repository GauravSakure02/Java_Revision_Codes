class Vehicle{
	protected String brand = "Suzuki";
	public void honk() {
		System.out.println("Welcome our showroom");
	}
}

public class Car2 extends Vehicle {
	private String modelname = "Civic2018";
	public static void main(String args[]) {
		Car2 myCar = new Car2();
		myCar.honk();
		
		System.out.println(myCar.brand+" "+myCar.modelname);
	}
}
