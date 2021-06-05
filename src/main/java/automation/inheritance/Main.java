package automation.inheritance;

public class Main {
	public static void main(String[] args) {

		Circle c = new Circle();
		Circle c3 = new Circle();
		Circle c4 = new Circle();

		Triangle t = new Triangle();

		Shape t1 = new Triangle();

		Shape c2 = new Circle();

		doSomething(c);

		doSomething(c2);

		doSomething(c3);

		doSomething(c4);

		doSomething(t);

		doSomething(t1);

	}

	public static void doSomething(Shape s) {
		s.draw();

	}
}
