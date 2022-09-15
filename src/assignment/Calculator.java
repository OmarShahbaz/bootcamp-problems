package assignment;

import java.util.Scanner;

public class Calculator {
	static int selection;
	
	int calculate(int x, int y) {
		if(selection==1) {
			int res = x+y;
			System.out.println(res);
			return res;	
		}
		else if(selection==2) {
			int res = x-y;
			System.out.println(res);
			return res;	
		}
		else if(selection==3) {
			int res = x*y;
			System.out.println(res);
			return res;	
		}
		else if(selection==4) {
			int res = x/y;
			System.out.println(res);
			return res;	
		}
		return 0;
		
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String menuFormat = "|%2d|%15s|";
		String[] menuItems = {"Addition","Subtraction","Multiplication","Division"};
		do {
			Scanner input1 = new Scanner(System.in);
			System.out.print("input num 1 : ");
			int num1 = input1.nextInt();
			
			Scanner input2 = new Scanner(System.in);
			System.out.print("input num 2 : ");
			int num2 = input2.nextInt();
			System.out.println();
			System.out.println("+--+---------------+");
			System.out.println("|ID|   Operation   |");
			System.out.println("+--+---------------+");
			for(int i=0;i<4;i++) {
				System.out.format(menuFormat, i+1, menuItems[i]);
				System.out.println();
			}
			System.out.println("+--+---------------+");
			
			System.out.print("Choose Operation: ");
			Scanner input = new Scanner(System.in);
			switch(input.nextInt()) {
			case 1:
				selection = 1;
				System.out.print("Addition is : ");
				calculator.calculate(num1, num2);
				break;
			case 2:
				selection = 2;
				System.out.print("Subtraction is : ");
				calculator.calculate(num1, num2);
				break;
			case 3:
				selection = 3;
				System.out.print("Multiplication is : ");
				calculator.calculate(num1, num2);
				break;
			case 4:
				selection = 4;
				System.out.print("Division is : ");
				calculator.calculate(num1, num2);
				break;
			}
		}while(true);
	}
}
