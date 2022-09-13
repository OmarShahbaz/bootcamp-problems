package assignment.shapes;

import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {
		
		boolean check=true;
		
		Shape shape = new ShapeImpl();
		
		String[] selectOperation = {"Triangle", "Diamond","Square","Rectangle"};
		String[] selectOperationTriangle = {"Right Angle", "Mirror Right Angle", "Right Angle Inverse", "Mirror Right Angle Reverse","Equilateral Triangle","Reverse Equilateral Triangle"};
		String formatSelection = "| %2d | %9s |";
		String formatSelectionTriangle = "| %2d | %30s |";
		do {
			System.out.println("+----+-----------+");
			System.out.println("| ID | Operation |");
			System.out.println("+----+-----------+");
			for(int i=0;i<4;i++) {
				System.out.format(formatSelection, i+1 , selectOperation[i]);
				System.out.println();
			}
			System.out.println("+----+-----------+");
			try {
				System.out.print("Choose Operation: ");
				Scanner input = new Scanner(System.in);
			
				switch(input.nextInt()) {
				case 1:
					System.out.println("+----+--------------------------------+");
					System.out.println("| ID |          Operation             |");
					System.out.println("+----+--------------------------------+");
					for(int i=0;i<6;i++) {
						System.out.format(formatSelectionTriangle,i+1,selectOperationTriangle[i]);
						System.out.println();
					}
					System.out.println("+----+--------------------------------+");
					System.out.print("Choose Triangle: ");
					switch(input.nextInt()) {
					case 1:
						System.out.print("Input size: ");
						System.out.println(shape.rightAngleTriangle(input.nextInt()));
						break;
					case 2:
						System.out.print("Input size: ");
						System.out.println(shape.reverseRightAngleTriangle(input.nextInt()));
						break;
					case 3:
						System.out.print("Input size: ");
						System.out.println(shape.inverseRightAngleTriangle(input.nextInt()));
						break;
					case 4:
						System.out.print("Input size: ");
						System.out.println(shape.inverseReverseRightAngleTriangle(input.nextInt()));
						break;
					case 5:
						System.out.print("Input size: ");
						System.out.println(shape.equilateralTriangle(input.nextInt()));
						break;
					case 6:
						System.out.print("Input size: ");
						System.out.println(shape.reverseEquilateralTriangle(input.nextInt()));
						break;
					default:
						System.out.println("Invalid input! choose operation from 1-6");

					}
					break;
				case 2:
					System.out.print("Input size: ");
					System.out.println(shape.diamond(input.nextInt()));
					break;
					
				case 3:
					System.out.print("Input size: ");
					System.out.println(shape.square(input.nextInt()));
					break;
					
				case 4:
					System.out.print("Input size: ");
					System.out.println(shape.rectangle(input.nextInt()));
					break;
					
				default: System.out.println("Invalid Input, choose operation from 1-4");
				}

				System.out.print("Do you want to continue (y/n)? :");
				char selection = input.next().charAt(0);
				if(selection=='y' | selection=='Y') {
					check=true;
				}
				else {
					check=false;
					input.close();
				}
			}catch (Exception e) {
				System.out.println("Input should be an integer number");
			}
		}while(check);
		System.out.println("Program ends");
	}
}