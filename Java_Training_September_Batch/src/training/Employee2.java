package training;

public class Employee2 {

	// data member
	int employeeId;

	double salary;

	Employee2() {
		employeeId = 201;
		salary = 10000;
		System.out.println("constructor called automatiocally");
	}

	Employee2(int empId, double sal) {
		employeeId = empId;
		salary = sal;
	}
	
	Employee2(int empId) {
		employeeId = empId;
	}
	
	
	Employee2( double sal) {
		salary = sal;
	}

	void getSalaryInfo() {

		System.out.println(salary);
	}

	void getEmployeedId() {

		System.out.println(employeeId);
	}

	public static void main(String[] args) {
		Employee2 obj1 = new Employee2();

		Employee2 obj2 = new Employee2(202, 10500);

		Employee2 obj3 = new Employee2(203, 11000);

		obj1.getEmployeedId();

		obj1.getSalaryInfo();

		obj2.getEmployeedId();

		obj2.getSalaryInfo();

		obj3.getEmployeedId();
		obj3.getSalaryInfo();
	}

}
