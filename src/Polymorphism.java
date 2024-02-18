class Animal{
	public void AnimalSound() {
		System.out.println("the animals are cute");
	}	
}

class Cat extends Animal{
	public void AnimalSound() {
		System.out.println("Meow Meow");
	}
}

class Dog extends Animal{
	public void AnimalSound() {
		System.out.println("Wow Wow");
	}
}


public class Polymorphism {
	public static void main(String args[]) {
		Animal myAnimal = new Animal();
		Animal myCat = new Cat();
		Animal myDog = new Dog();
		
		myAnimal.AnimalSound();
		myCat.AnimalSound();
		myDog.AnimalSound();
	}
}
