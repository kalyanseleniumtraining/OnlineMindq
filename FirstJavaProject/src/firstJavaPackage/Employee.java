package firstJavaPackage;

public class Employee {

	String empName;
	String empDesg;
	String empID;
	String empSalary;
	

	// constructor

	public Employee(String empName, String empDesg, String empID, String empSalary) {
		this.empName = empName;
		this.empDesg = empDesg;
		this.empID = empID;
		this.empSalary = empSalary;
	}

	public static void main(String[] args) {
		// 1 st employee joined an org
		Employee obj1 = new Employee("Kalyani", "SE", "E1", "8 lakhs");
		System.out.println(obj1.empName);
		System.out.println(obj1.empDesg);
		System.out.println(obj1.empID);
		System.out.println(obj1.empSalary);

		Employee obj2 = new Employee("Raziya", "ASE", "E2", "5 lakhs");
		System.out.println(obj2.empName);
		System.out.println(obj2.empDesg);
		System.out.println(obj2.empID);
		System.out.println(obj2.empSalary);

	}

}
