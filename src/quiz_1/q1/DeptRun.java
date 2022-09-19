package quiz_1.q1;

public class DeptRun {

	public static void main(String[] args) {
		Department department = new Department("Iqra University", "omar@iqra.edu.pk", "H-8 ISB");
		System.out.println("University info: ");
		department.printInfo("Iqra University", "omar@iqra.edu.pk", "H-8 ISB");
		System.out.println("Department info:");
		System.out.println(department.dept_name);
		System.out.println(department.dept_email);
		System.out.println(department.dept_address);
		System.out.println("Fee Structure:");
		for(int i=0;i<department.fee_structure.length;i++) {
			System.out.println("Semester "+(i+1)+":"+department.fee_structure[i]);
		}
		
		
	}

}
