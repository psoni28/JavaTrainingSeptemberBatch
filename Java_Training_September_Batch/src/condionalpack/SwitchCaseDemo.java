package condionalpack;

public class SwitchCaseDemo {

	public static void additin(int x, int y) {
		System.out.println("addition = " + (x + y));
	}

	public static void subtraction(int x, int y) {
		System.out.println("subtraction = " + (x - y));
	}

	public static void main(String[] args) {

		int options = 2;

		int num1 = 100, num2 = 200;

		switch (options) {
		case 1:
			System.out.println("addition");
			additin(num1, num2);
			break;

		case 2:
			System.out.println("subtraction");
			subtraction(num2, num1);
			break;
		case 3:
			System.out.println("Marathi");
			break;

		default:
			System.out.println("Invalid option press");
			break;
		}

	}

}
