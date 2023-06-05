package Simple;

import java.util.Scanner;

public class split_num_sum_odd_even {
	public static void main(String args[]) {
		split_num_sum_odd_even obj = new split_num_sum_odd_even();
		obj.split();
	}

	public void split() {
		System.out.println("Enter the number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int given = n;
		int even = 0;
		int odd = 0;
		int count = 0;

		for (int i = 0; i < given; given = given / 10) {
			count++;
		}

		for (int i = 0; n > i; n = n / 10) {
			int a = n % 10;
			System.out.println(count);
			if (count % 2 == 0) {
				even = even + a;
			} else {
				odd = odd + a;
			}
			count--;
		}
		System.out.println("Sum of odd numbers : " + odd);
		System.out.println("Sum of even numbers : " + even);
		int diff = even - odd;
		System.out.println("diff of even numbers and odd numbers : " + diff);
	}
}
