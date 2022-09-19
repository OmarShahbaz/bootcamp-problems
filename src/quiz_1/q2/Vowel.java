package quiz_1.q2;

public class Vowel {
	
	String isVowel(char value){
		switch(value) {
		case 'A':
		case 'a':
			System.out.println(value+" is vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(value+" is vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(value+" is vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(value+" is vowel");
			break;
			default:
				System.out.println(value+"is a constant");
		}
		return null;
		
	}

}
