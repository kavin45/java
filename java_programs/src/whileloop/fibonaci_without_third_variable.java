package whileloop;

public class fibonaci_without_third_variable {
	public static void main(String args[]) {
		fibonaci_without_third_variable obj = new fibonaci_without_third_variable();
		obj.without1();

	}

	public void without1() {
		int n = 10;

		int first = 0;
		int second = 1;

		if (n >= 1) {
			System.out.println(0);
		}
		if (n >= 2) {
			System.out.println(1);
		}

		int count = 3;
		while (count <= n) {

			System.out.println(first + second);
			second = first + second;
			first = second - first;
			count++;
		}
	}
}
