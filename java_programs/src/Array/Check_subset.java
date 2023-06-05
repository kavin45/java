package Array;

import java.util.Scanner;

public class Check_subset {

	public static void main(String args[]) {
		Check_subset obj = new Check_subset();
		obj.subset();
	}

	public void subset() {
		int a[] = { 5, 4, 7, 1, 2 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subset length");
		int n = sc.nextInt();

		int b[] = new int[n];

		System.out.println("Enter the subset elements");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
					break;
				}
			}
		}

		if (count == b.length) {
			System.out.println(" Subset");
		} else {
			System.out.println("NOT subset");
		}

	}

}
