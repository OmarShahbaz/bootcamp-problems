package quiz_1.q2;

import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Vowel vowel = new Vowel();
		System.out.print("input character:");
		vowel.isVowel(input.next().charAt(0));

	}

}
