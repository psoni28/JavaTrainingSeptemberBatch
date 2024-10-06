package abstractPack;

public abstract class Shape {

	double area;

	Shape() {
		area = 0.0;
	}

	public abstract void findArea();
	public abstract void findShapeName();


	public void displayedArea() {
		System.out.print("area = " + this.area);
	}

}
