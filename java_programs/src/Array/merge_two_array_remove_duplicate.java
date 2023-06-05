package Array;

public class merge_two_array_remove_duplicate {
	public static void main(String args[]) {
		int a[] = { 7, 3, 5, 1, 9 };
		int b[] = { 3, 4, 8 };
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
		}
		int c[] = new int[(a.length + b.length) - count];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		System.out.println("After merged first array : ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(" " + c[i]);
		}
		int temp = a.length;
		for (int i = 0; i < b.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					flag = true;
				}
			}
			if (flag == false) {
				c[temp] = b[i];
				temp++;
			}
		}
		System.out.println();
		System.out.println("After  remove the duplicate and merged the second array : ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(" " + c[i]);
		}

	}
}
