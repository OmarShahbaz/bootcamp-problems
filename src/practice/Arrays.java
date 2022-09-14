package practice;

import java.util.Scanner;

public class Arrays {
	int[] array;
	
	Arrays(int[] arr){
		this.array = arr;
	}
	
	int[] add(int value) {
		int[] temp = new int[array.length+1];
		for(int i = 0;i<temp.length-1;i++) {
			temp[i] += i;
		}
		array = temp;
		array[array.length-1] = value;
		System.out.println("number added");
		return array;
	}
	
	void get() {
		if(array.length==0) {
			System.out.println("Array is empty!! Add elements to the array");
		}
		else {
			System.out.print("[");
			for(int i=0;i<array.length;i++) {
				System.out.print(" "+array[i]+" ");
			}
			System.out.println("]");
		}
	}
	void remove(int index) {
		if(array.length!=0) {
			array[index]=0;
			System.out.print("[");
			for(int i=0;i<array.length;i++) {
				System.out.print(" "+array[i]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
		else System.out.println("Nothing to remove array is empty");
	}
	int size() {
		System.out.println();
		if(array.length==0) {
			return 0;
		}
		else
			System.out.print("Size of original array is: ");
			return array.length;
	}
	

	public static void main(String[] args) {
		System.out.print("Enter size of an array: ");
		Scanner input = new Scanner(System.in);
		Arrays arrays = new Arrays(new int[input.nextInt()]);
		String[] menuItems = new String[4];
		menuItems[0] = "Add Item";
		menuItems[1] = "Get items";
		menuItems[2] = "Remove Item";
		menuItems[3] = "Size";
		while(true) {
			String formatMenu = "|%2d|%12s|";
			System.out.println("+--+------------+");
			System.out.println("|ID|  Operation |");
			System.out.println("+--+------------+");
			for(int i=0;i<4;i++) {
				System.out.format(formatMenu, i+1, menuItems[i]);
				System.out.println();
			}
			System.out.println("+--+------------+");
			System.out.print("Choose Operation: ");
			switch(input.nextInt()) {
			case 1:
				System.out.print("Add number to the end of an array: ");
				arrays.add(input.nextInt());
				break;
			case 2:
				arrays.get();
				break;
			case 3:
				System.out.print("Remove an element by index: ");
				arrays.remove(input.nextInt());
				break;
			case 4:
				System.out.println(arrays.size());
				break;
				default : System.out.println("Input exclusive 1-4");
			}
		}
	}
}