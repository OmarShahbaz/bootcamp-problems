package assignment;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		char choice;
		boolean check=true;
		do {
			System.out.print("Input Character: ");
			Scanner input = new Scanner(System.in);
			char exp = input.next().charAt(0);
			
			switch(exp) {
			case 'A':
			case 'a':
				System.out.println(exp+" : is a vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(exp+" : is a vowel");
				break;
			case 'I':
			case 'i':
				System.out.println(exp+" : is a vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(exp+" : is a vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(exp+" : is a vowel");
				break;
			default: System.out.println(exp+" : is not a vowel!");
			}
			
			System.out.println("Do you want to continue? y/n : ");
			Scanner inputChoice = new Scanner(System.in);
			choice = inputChoice.next().charAt(0);
			
			if(choice=='y' || choice == 'Y') 
				continue;
			else  {
				check=false;
				System.out.println("Programs ends!");
			}
		}while(check);
	}
}
