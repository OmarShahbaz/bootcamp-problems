package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	String isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()==s2.length()) {
			char[] charArr = s1.toCharArray();
			char[] charArr2 = s2.toCharArray();		
			
			Arrays.sort(charArr);
			Arrays.sort(charArr2);
			
			boolean result = Arrays.equals(charArr, charArr2);
			if(result) {
				return s1+" and "+s2+" are anagram";
			}
			else
				return s1+" and "+s2+" are not anagram";
		}
		else {
			return s1+" and "+s2+" are not anagram";
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("First String: ");
		String s1 = input.nextLine();
		
		System.out.print("Second String: ");
		String s2 = input.nextLine();
		
		Anagram anagram = new Anagram();
		
		System.out.println(anagram.isAnagram(s1, s2));

	}

}
