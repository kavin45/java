package forloop;

public class reverse_number_prime_forloop {
	public static void main(String args[]) {
		reverse_number_prime_forloop obj = new reverse_number_prime_forloop();
		obj.rev_prime(149327);

	}

	public void rev_prime(int num) {
		int n = num;
		int i = 2;
		int rev_num = 0;

		int count = 0;
		while (num > 0) {
			int a = num % 10;
			rev_num = rev_num * 10 + a;
			num = num / 10;
		}
		while (rev_num >= i) {
			if (rev_num % i == 0) {
				count++;
			}
			i++;
		}

		if (count == 1) {
			System.out.println("Given number is a prime number = " + n);
		} else {
			System.out.println("Given number is not a prime number = " + n);
		}
	}

}
