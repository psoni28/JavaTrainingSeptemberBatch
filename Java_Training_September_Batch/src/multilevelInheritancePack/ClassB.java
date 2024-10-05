package multilevelInheritancePack;

public class ClassB extends ClassA {

	// super refer to imediate parent class object
	// super equal to base class object
	// super you can called variable, methods and constructors of your imediate
	// parent class object

	// this keyword refer to current calling object
	// this is available inside not static method of the class
	// this is equal to calling object
	int b;

	ClassB() {
		// super();
		b = 20;
		System.out.println("class B constructor called");
	}

	ClassB(int a, int b) {
		super(a);
		this.b = b;
	}

	public void displayAandBValues() {
		super.displayA();
		System.out.println("b = " + this.b);

	}

	public static void main(String[] args) {

		ClassB obj = new ClassB();
		obj.displayAandBValues();

		ClassB obj2 = new ClassB(30, 40);
		obj2.displayAandBValues();
	}

}
