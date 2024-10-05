package exceptionHandlingPack;

public class UncheckedException {

	public static void main(String[] args) {

		int x = 100;
		int result;
		try {
			result = x / 0;
		} catch (ArithmeticException ex) {

			System.out.println("exception is handled and catch");
		} catch (Exception ex) {

		} finally {
			System.out.println("finally block executed always");
		}
		System.out.println("last line of my code");

	}

}
