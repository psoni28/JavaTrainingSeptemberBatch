package multilevelInheritancePack;

public class ClassC extends ClassB {

	int c;

	ClassC() {

		c = 30;
		System.out.println("class C constructor called");

	}

	public void displayALL() {
		super.displayAandBValues();
		System.out.println("c= " + this.c);
	}

	public static void main(String[] args) {

		ClassC obj3 = new ClassC();

		obj3.displayALL();
	}

}
