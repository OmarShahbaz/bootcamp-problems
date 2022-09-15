package assignment;

import java.util.LinkedList;
import java.util.List;

public class AnimalUsingLambdas {

	public static void main(String[] args) {
		List<String> animals = new LinkedList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Goat");
		animals.add("Cow");
		animals.add("Camel");
		animals.forEach((name)->System.out.println(name));
	}

}
