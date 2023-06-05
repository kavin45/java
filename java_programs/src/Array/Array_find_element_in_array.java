package Array;

import java.util.Scanner;

public class Array_find_element_in_array {

	public static void main(String args[]) {
		find_element();
	}

	static void find_element() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n = sc.nextInt();
		boolean flag = false;
		int a[] = new int[n];

		System.out.println("please enter " + n + " array value");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Display the Array elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+".Element = "+a[i]);
		}
		System.out.println("Enter the array element : ");
		int c = sc.nextInt();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == c) {
				System.out.println("element is in the array : " + a[i]);
				flag = true;
			}

		}

		if (flag == false) {
			System.out.println("element is not in the array : " + c);
		}

		sc.close();
	}
}
