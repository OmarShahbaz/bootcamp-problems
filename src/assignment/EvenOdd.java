package assignment;

import java.util.Scanner;

public class EvenOdd {
	
	String isEven(int num){
		if(num%2==0) {
			return num+" is an even number";
		}
		return num+" is an odd number";
	}

	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		do {
			System.out.print("Input number: ");
			Scanner input = new Scanner(System.in);
			System.out.println(evenOdd.isEven(input.nextInt()));
		}while(true);

	}

}
