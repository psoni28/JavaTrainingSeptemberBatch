package hieraricalInheritancePack;

public class BaseA {

	int a;

	BaseA() {
		a = 10;
		System.out.println("BaseA constructor called");
	}

	BaseA(int a) {
		this.a = a;
	}

	public void displayA() {
		System.out.println("a = " + a);
	}

}
