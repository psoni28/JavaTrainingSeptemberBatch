package inheritancePack;

public class ClassA {

	int a;

	ClassA() {
		a = 10;
		System.out.println("class A constructor called");
	}
	
	ClassA(int a)
	{
		this.a=a;
	}

	public void displayA() {
		System.out.println("a = " + a);
	}

}
