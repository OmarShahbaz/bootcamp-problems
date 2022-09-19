package quiz_1.q1;

abstract class University{
	String name;
	String email;
	String address;
	
	public University(String n, String e, String a) {
		name = n;
		email = e;
		address = a;
	}
	
	public abstract void printInfo(String name, String email, String address);
	
}

public class Department extends University{


	String dept_name="CS Department";
	String dept_email="xyz@gmail.com";
	String dept_address="C-Block";
	String[] fee_structure={"10_000","50_000"};
	
	public Department(String n, String e, String a) {
		super(n, e, a);
	}
	
	@Override
	public void printInfo(String name, String email, String address) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
	}

}

