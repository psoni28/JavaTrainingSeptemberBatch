package operatorsPack;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 10, b = 5;

		boolean result = false;

		result = (a > b) && (a == b);

		System.out.println(result);

		result = (a > b) || (a != b);

		System.out.println(result);

		result = (a > b) || (a == b);

		System.out.println(result);

		result = !((a > b) && (a == b));
		System.out.println(result);

	}

}
