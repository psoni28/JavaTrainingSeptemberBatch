package condionalpack;

public class ConditionalStatementDemo {

	public static boolean isNumberEven(int num) {
		boolean result = false;
		if (num % 2 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public static void main(String[] args) {

		boolean res = isNumberEven(200);

		// System.out.print(res);

		int age = 17;

		boolean criminalCaseFlage = true;

		char ch = 'A';

		if (age >= 18) {
			System.out.println("person can vote");

			if (criminalCaseFlage) {
				System.out.println("can not be politician");
			} else if (age > 50) {
				System.out.println("can not be politician");
				System.out.println("can not be eligible for cm candidate");

			}
		} else {
			System.out.println("person can not vote");

		}

	}

}
