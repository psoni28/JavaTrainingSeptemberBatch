package abstractPack;

public class Circle extends Shape {

	double r;

	Circle() {
		r = 12.32;
	}

	Circle(double r) {
		this.r = r;
	}

	@Override
	public void findArea() {
		super.area = (22/7) * this.r * this.r;

		super.displayedArea();
	}

	public static void main(String[] args) {

		Shape reference = new Circle();

		reference.findArea();

	}

	@Override
	public void findShapeName() {
		
	}

}
