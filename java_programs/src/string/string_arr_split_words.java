package string;

import java.util.Scanner;

public class string_arr_split_words {
	public static void main(String[] args) {
		string_arr_split_words obj = new string_arr_split_words();
		obj.words();
	}

	public void words() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		System.out.println();
		System.out.println("String array elements : ");

		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		String a[] = new String[count];
		String c = "";
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				c = c + s.charAt(i);
			}
			if (s.charAt(i) == ' ' || i == s.length() - 1) {
				a[temp] = c;
				temp++;
				c = "";
			}
		}
        for (int j = 0; j < count; j++) {
			System.out.println(j + " " + a[j]);
		}
	}
}
