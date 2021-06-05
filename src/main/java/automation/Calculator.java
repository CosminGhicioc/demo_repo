package automation;

public class Calculator {

	public static void main(String[] args) {

		if (args.length == 3) {

			double a = Double.parseDouble(args[0]);

			double b = Double.parseDouble(args[2]);

			double result = 0.0;

			String operator = args[1];

			switch (operator) {
			case "+":
				result = a + b;
				break;

			case "-":
				result = a - b;
				break;

			case "*":
				result = a * b;
				break;

			case "/":
				result = a / b;
				break;

			default:
				System.out.printf("Error! operator is not correct");
				return;
			}

			System.out.println("Result is: " + result);

		} else {

			System.err.println("3 arguments are needed!");

		}

	}
}