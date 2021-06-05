package automation.exceptions;

public class CatchException {

	public static void main(String[] args) {

		try {
			int age = Integer.parseInt(args[0]);
			// do something with age…
			System.out.println(age + 1);
		} catch (NumberFormatException ex) {
			System.out.println("First argument needs to be an int " + ex.getMessage());

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("A single argument must be provided.");

		}

		catch (Throwable ex) {
			System.out.println("A single argument must be provided..");

		}
	}
}
