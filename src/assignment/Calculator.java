package assignment;

import java.util.Scanner;

public class Calculator {
	int num1, num2, res;
	
	int secondNumber() {
		System.out.print("Second integer:");
		Scanner input = new Scanner(System.in);
		num2 = input.nextInt();
		return num2;
	}

	int add(int num1) {
		res = num1+secondNumber();
		return res;
	}
	
	int subtract(int num1) {
		res = num1-secondNumber();
		return res;
	}
	
	int multiply(int num1) {
		res = num1 * secondNumber();
		return res;
	}
	
	int divide(int num1) {
		res = num1 / secondNumber();
		return res;
	}
	
	String backspace(String number) {
		
		String temp="";
		char[] charArray = number.toCharArray();
		for(int i=0;i<charArray.length-1;i++) {
			temp += Character.toString(charArray[i]);
		}
		if(temp.length()==0) {
			System.out.println("Nothing to display");
		}
		return temp;
	}
	

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.print("First integer: ");
		Scanner input  = new Scanner(System.in);
		calculator.num1 = input.nextInt();
		
		
		System.out.print("Choose Operation: (+ - * / b d):  ");
		char operation = input.next().charAt(0);
		
		switch(operation) {
		case '+':
			System.out.print(calculator.add(calculator.num1));
			break;
		case '-':
			System.out.println(calculator.subtract(calculator.num1));
			break;
		case '*':
			System.out.println(calculator.multiply(calculator.num1));
			break;
		case '/':
			System.out.println(calculator.divide(calculator.num1));
			break;
		case 'b':
			String numberToString = Integer.toString(calculator.num1);
			System.out.println(calculator.backspace(numberToString));
			break;
		case 'd':
			double decimal = calculator.num1;
			System.out.println(decimal);
		}
		
		
	}
}
