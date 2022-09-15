package assignment;

import java.util.Scanner;

public class Fibonacci {
	
	int n1=0, n2=1;
	
	void printFibonacci(int count) {
		if(count>0) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(count-2);
		}
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		System.out.print("input series length: ");
		Scanner input = new Scanner(System.in);
		int takeInput = input.nextInt();
		System.out.print(fibonacci.n1+" "+fibonacci.n2);
		fibonacci.printFibonacci(takeInput);

	}

}
