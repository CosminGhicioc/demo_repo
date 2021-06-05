package automation.inheritance;

public class Shape {

	private String color = "red";

	public String draw() {
		return "drawing a shape";
	}

	public void erase() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
