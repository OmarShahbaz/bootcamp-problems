package assignment.shapes;

public class ShapeImpl implements Shape {

	@Override
	public String rightAngleTriangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return "Size of right angle triangle is: "+size;
	}

	@Override
	public String reverseRightAngleTriangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return "Size of reverse right angle triangle is: "+size;
	}
	
	@Override
	public String inverseRightAngleTriangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		return "Size of inverse right angle triangle is: "+size;
	}
	
	@Override
	public String inverseReverseRightAngleTriangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<size;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return "Size of inverse reverse right angle triangle is: "+size;
	}
	
	@Override
	public String equilateralTriangle(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=i;j<size;j++) {
				System.out.print(" ");
			}
			for(int stars=0; stars<(2*i)-1;stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return "Size of equilateral triangle is: "+size;
	}
	
	@Override
	public String reverseEquilateralTriangle(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int stars=2*size;stars>(2*i)-1;stars--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return "Size of reverse equilateral triangle is: "+size;
	}

	@Override
	public String diamond(int size) {
		for(int i=1;i<size;i++){
			for(int j=size;j>i;j--){
				System.out.print(" ");
			}
			for(int stars=0;stars<(2*i)-1;stars++){
				System.out.print("*");
			}System.out.println();
		}
			for(int i=1;i<=size;i++){
				for(int j=1;j<i;j++){
					System.out.print(" ");
				}
				for(int stars=2*size;stars>(2*i)-1;stars--){
					System.out.print("*");
				}
				System.out.println();
			}
		return "Size of Diamond is: "+size;
	}

	@Override
	public String square(int size) {
		if(size>=4){
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					System.out.print("*  ");
				}System.out.println();
			}
			return "Size of square is: "+size;
		}
		else {
			return "Size is too small.";
		}
	}

	@Override
	public String rectangle(int size) {
		if(size>=4) {
			for(int i=0;i<size/2;i++){
				for(int j=0;j<size;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
			return "";
		}
		else
			return "Size is too small";
	}
}
