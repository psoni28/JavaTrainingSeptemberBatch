package accessMondifiers;

public class TestMainAccessMondiferDemo {

	public int x = 10; // within this class

	void display() {
		System.out.println(x);
	}

	public TestMainAccessMondiferDemo() {
		x = 20;
	}

	public static void main(String[] args) {

		TestMainAccessMondiferDemo obj1 = new TestMainAccessMondiferDemo();

		System.out.println(obj1.x);
	}

}
