package practice;

interface Animal{
	void animalSound(String sound);
}

class Dog implements Animal{

	@Override
	public void animalSound(String sound) {
		System.out.println(sound);	
	}
}
class Cat implements Animal{

	@Override
	public void animalSound(String sound) {
		System.out.println(sound);	
	}
}

class Tiger implements Animal{

	@Override
	public void animalSound(String sound) {
		System.out.println(sound);
	}	
}

public class TestAnimalInterface {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.animalSound("Woof Woof!!!");
		
		animal = new Cat();
		animal.animalSound("Meow!!");
		
		animal = new Tiger();
		animal.animalSound("Hooo!!");
	}

}
