package assignment;

public class BookAbstract {

	public static void main(String[] args) {
		Book[] books = new Book[2];
		Fiction fiction = new Fiction("HarryPotter");
		fiction.setprice(24.99);
		NonFiction nonFiction = new NonFiction("Calculus");
		nonFiction.setprice(37.99);
		books[0] = fiction;
		books[1] = nonFiction;
		System.out.println("Title of fiction book:");
		System.out.println(fiction.getTitle());
		System.out.println("Title of non fiction book: ");
		System.out.println(nonFiction.getTitle());
		
		System.out.print("Title-Harry Potter Cost-");
		System.out.println(fiction.getPrice());
		
		System.out.print("Title-Calculus Cost-");
		System.out.println(nonFiction.getPrice());
		
		System.out.println();
		
		Fiction fiction2 = new Fiction("Schooled in Revenge");
		NonFiction nonFiction2 = new NonFiction("Biostatistics");
		
		System.out.println("Title of fiction book:");
		System.out.println(fiction2.getTitle());
		System.out.println("Title of non fiction book: ");
		System.out.println(nonFiction2.getTitle());
		
		System.out.print("Title-Harry Potter Cost-");
		System.out.println(fiction.getPrice());
		
		System.out.print("Title-Calculus Cost-");
		System.out.println(nonFiction.getPrice());
	}

}

abstract class Book{
	String title;
	double price;
	abstract double setprice(double price);
	
	Book(String title){
		this.title=title;
	}
	String getTitle() {
		return title;
	}
	double getPrice() {
		return price;
	}
}

class Fiction extends Book{

	Fiction(String title) {
		super(title);
	}

	@Override
	double setprice(double setPrice) {
		return price = setPrice;
	}
	
}

class NonFiction extends Book{

	NonFiction(String title) {
		super(title);
		
	}

	@Override
	double setprice(double setPrice) {
		return price = setPrice;
	}
	
}
