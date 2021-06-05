package automation.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();

		System.out.println(circle.draw());
		System.out.println(rectangle.draw());
		System.out.println(triangle.draw());
		System.out.println(square.draw());

		System.out.println(square);
		System.out.println(rectangle);

	}

}
