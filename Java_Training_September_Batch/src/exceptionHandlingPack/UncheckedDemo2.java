package exceptionHandlingPack;

public class UncheckedDemo2 {

	public static void method1(int age) {
		if (!(age > 17)) {
			throw new RuntimeException("invalid age for voting");
		} else {
			System.out.println("user can vote");
		}
	}

	public static void method2(int age) {
		method1(age);
	}

	public static void main(String[] args) {

		try {
			method2(16);
		} catch (RuntimeException ex) {

			System.out.println(ex.getMessage());
		}

		System.out.print("rest of the code.....");
	}

}
