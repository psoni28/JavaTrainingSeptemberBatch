package training;

public class Employee {

	// data member
	int employeeId = 101;

	double salary = 20000;

	void getSalaryInfo() {

		System.out.println(salary);
	}

	void getEmployeedId() {

		System.out.println(employeeId);
	}

	public static void main(String[] args) {
		Employee obj1 = new Employee();

		Employee obj2 = new Employee();

		obj2.getEmployeedId();

		obj2.getSalaryInfo();

		obj1.getEmployeedId();

		obj1.getSalaryInfo();

	}

}
