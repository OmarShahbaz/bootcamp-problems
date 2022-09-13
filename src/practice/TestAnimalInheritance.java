package practice;

class Animal1{
	String sound() {
		return "Any sound";
		
	}
}

class Cat1 extends Animal1{
	String sound() {
		return "Meow";
	}
}

class Dog1 extends Animal1{
	String sound() {
		return "Woof";
	}
}

public class TestAnimalInheritance {

	public static void main(String[] args) {
		Animal1 animal1 = new Cat1();
		System.out.println(animal1.sound());
		animal1 = new Dog1();
		System.out.println(animal1.sound());
	}

}
