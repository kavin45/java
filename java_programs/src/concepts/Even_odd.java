package concepts;

public class Even_odd {
	public static void main(String[] args) {
		Even_odd obj = new Even_odd();
		obj.finding();
	}

	public void finding() {
		int n = 149327;
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		while (n > 0) {
			int a = n % 10;
			count++;

			if (count % 2 == 0) {
				sum1 = sum1 + a;

			} else {
				sum2 = sum2 + a;

			}
			n = n / 10;
		}
		System.out.println("sum of even numbers is = "+sum1);
		System.out.println("sum of odd numbers is = "+sum2);
		int ans = sum1 - sum2;
		System.out.println("Subtraction of odd and even numbers = "+ans);
	}
}
