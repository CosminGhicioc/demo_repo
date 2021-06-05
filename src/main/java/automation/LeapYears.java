package automation;

public class LeapYears {

	public static void main(String[] args) {

		int year = Integer.parseInt(args[0]);

		if (year > 1900 && year < 2016) {
			// if (year % 4 == 0 && year % 100 != 100 || year % 400 == 0) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 100) {
				System.out.print("Februarie are 29 zile");
			} else {
				System.out.print("Februarie are 28 zile");
			}
			System.out.print(" in anul " + year);
		} else {
			System.out.println("Anul nu este valid");
		}
	}
}
