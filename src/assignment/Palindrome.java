package assignment;

import java.util.Scanner;

public class Palindrome {

	String isPalindrome(String word){
		String revWord = "";
		for(int i=word.length()-1;i>=0;i--) {
			revWord += word.charAt(i);
		}
		if(word.equals(revWord)) {
			return word+" is a palindrome";
		}
		else {
			return word+" is not a palindrome";
		}	
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		do {
			System.out.print("Input String: ");
			Scanner input = new Scanner(System.in);
			System.out.println(palindrome.isPalindrome(input.nextLine()));
		}while(true);

	}

}
