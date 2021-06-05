package automation;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int i = 0; i < 1000000; i++) {
			if (isNumberPrime(i)) {
			}
		}
	}

	public static boolean isNumberPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}