package automation.inheritance;

public class Circle extends Shape {

	@Override
	public String draw() {
		return "Drawing a circle";
	}

	@Override
	public String toString() {
		return "Circle of color:";
	}
}
