package variablepack;

public class TestMain2 {

	int x; // instance/ object variable - declared inside the class which is non static
	int y;// instance/ object variable - declared inside the class which is non static
// declaration
	
	TestMain2() { // non paramterize construtor
		x = 100; // initilization only
		y = 200;
	}

	TestMain2(int a, int b) { // parameterize constructor
		x = a;
		y = b;
	}

	public void show() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

	public static void main(String[] args) {

		TestMain2 obj1 = new TestMain2();

		//obj1.show();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);

	
		TestMain2 obj2= new TestMain2(300,400);
		
		//obj2.show();
		
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		
		
	}
	

}
