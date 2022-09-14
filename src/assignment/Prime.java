package assignment;

import java.util.Scanner;

public class Prime {
	boolean isPrime=true;

	String isPrime(int num){
		if(num>=2) {
			for(int factor = 2; factor<=num/2;factor++) {
				if(num%factor==0) {
					isPrime=false;
					return num+" is not a prime number";
				}
			}
			if(isPrime) {
				return num+" is a prime number";
			}
		}
		else
			return num+" is not a prime number";
		return "";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Prime prime = new Prime();
		while(true) {
			System.out.print("Input number: ");
			System.out.println(prime.isPrime(input.nextInt()));
		}
	}

}
