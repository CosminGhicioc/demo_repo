package automation;

public class Operatii {
	public static void main(String[] args) {
		int sum = 0;
		boolean isOddNr;
		for (int n = 0; n < 100; n++) {
			sum += n;
			System.out.println("Suma intermediara:" + sum);
		}
		System.out.println(sum);
		isOddNr = OddNmbers.isOddNumber(sum);
		System.out.println(isOddNr);
	}
}
