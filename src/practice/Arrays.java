package practice;

public class Arrays {
	int[] array = new int[10];
	
	void add(int value) {
		int[] temp = new int[array.length+1];
		for(int i =0;i<array.length;i++) {
			temp[i] = i;
		}
		array = temp;
		array[array.length-1]=value;
		for(int j = 0;j<array.length-1;j++) {
			System.out.print(array[j]);
		}
	}
	
	void get() {}
	void remove() {}
	void size() {}
	

	public static void main(String[] args) {

		Arrays arrays = new Arrays();
		arrays.add(0);
	}

}
