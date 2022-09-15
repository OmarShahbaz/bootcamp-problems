package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeUsingStreams {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.print("Name: ");
		String eName=name.nextLine();
		
		Scanner id = new Scanner(System.in);
		System.out.print("Id: ");
		int eId = id.nextInt();
		
		Scanner designation = new Scanner(System.in);
		System.out.print("Designation: ");
		String eDesig=designation.nextLine();
		
		System.out.print("Salary: ");
		Scanner salary = new Scanner(System.in);
		double eSalary = salary.nextDouble();
		
		List<Employee> details = new ArrayList<>();
		details.add(new Employee(eName,eId,eDesig,eSalary));
		details.add(new Employee("Ana",2,"HR",90_000.00));
		
		List<String> nameofEmployees = details.stream().map(d->d.name).collect(Collectors.toList());
		System.out.println(nameofEmployees);
		
		List<String> salaries = details.stream()
				.filter(s->s.salary>50_000.00)
				.map(n->n.name)
				.collect(Collectors.toList());
		System.out.println(salaries);
	}

}

class Employee{
	String name;
	int id;
	String designation;
	double salary;
	public Employee(String name, int id, String designation, double salary) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	
}
