package assignment;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		String[] subjects = {"English", "Urdu", "Maths", "Physics", "Chemistry"};
		
		System.out.println("***Input Marks Obtained***");
		System.out.print("English: ");
		Scanner englishMarks = new Scanner(System.in);
		int english = englishMarks.nextInt();
		
		System.out.print("Urdu: ");
		Scanner urduMarks = new Scanner(System.in);
		int urdu = urduMarks.nextInt();
		
		System.out.print("Maths: ");
		Scanner mathMarks = new Scanner(System.in);
		int maths = mathMarks.nextInt();
		
		System.out.print("Physics: ");
		Scanner physicsMarks = new Scanner(System.in);
		int physics = physicsMarks.nextInt();
		
		System.out.print("Physics Practical: ");
		Scanner physicsPractical = new Scanner(System.in);
		String phyPractical = physicsPractical.nextLine();
		
		System.out.print("Chemistry: ");
		Scanner chemistryMarks = new Scanner(System.in);
		int chemistry = chemistryMarks.nextInt();
		
		System.out.print("Chemistry Practical: ");
		Scanner chemistryPractical = new Scanner(System.in);
		String chemPractical = chemistryPractical.nextLine();
		
		int[] obtained = {english,urdu,maths,physics,chemistry};
		int totalMarks = 100;
		String[] practical = {"","","",phyPractical,chemPractical};
		
		String formatTableData = "| %10s | %10d | %10d | %15s |%n";
		System.out.println("+------------+------------+------------+-----------------+");
		System.out.println("|  Subjects  |"+"   Total    |"+"  Obtained  |"+"    Practical    |");
		System.out.println("+------------+------------+------------+-----------------+");
		for(int i=0;i<5;i++) {
			System.out.format(formatTableData, subjects[i], 100 , obtained[i], practical[i]);
		}
		System.out.println("+------------+------------+------------+-----------------+");	
	}
}