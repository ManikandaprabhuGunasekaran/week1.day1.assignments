package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {

		int i, m = 0;
		boolean flag = false;
		int input = 27;
		m = input / 2;
		if (input == 0 || input == 1) {
			flag = true;
		} else {
			for (i = 2; i <= m; i++) {
				if (input % i == 0) {
					
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(input + " is a prime number.");
			}
			else {
				System.out.println(input + " is not a prime number.");
			}
		}
	}
}
