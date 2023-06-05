package whileloop;

public class Prime_number {

	public static void main(String args[]) {
		Prime_number obj = new Prime_number();
		obj.two();
	}

	// print the prime number for given number
	public void two() {

		int i = 2;
		int num = 35;
		int count = 0;
		while (num >= i) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 1) {
			System.out.println("Given number is a prime number = " + num);
		} else {
			System.out.println("Given number is not a prime number = " + num);
		}
	}
}
