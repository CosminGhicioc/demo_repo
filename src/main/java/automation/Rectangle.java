package automation;

/**
 *
 * @author cosminghicioc
 *
 */
public class Rectangle {

	public static void main(String[] args) {

		// drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		// drawShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		// drawShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		// drawFullShape(5, 7);
		// drawShapeOutline(4, 5);
		// drawShapeCorners(5, 7);
		short length = 5;
		drawSquare(length);
		drawSquare((short) 5);

	}

	/**
	 * Draws a square out of ("*")
	 *
	 * @param length
	 *        length of square
	 */
	public static void drawSquare(int length) {

		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= length; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void drawSquare(short length) {

		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= length; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}
	}

	public static void drawFullShape(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void drawShapeOutline(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	public static void drawShapeCorners(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				if ((i == 1 || i == height) && (j == 1 || j == width)) {
					// if (i == 1 && j == 1 || i == 1 && j == width || i == height && j == 1 || i == height && j == width) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

}
