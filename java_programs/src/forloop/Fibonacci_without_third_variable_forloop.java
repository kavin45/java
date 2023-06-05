package forloop;



public class Fibonacci_without_third_variable_forloop {
	public static void main(String args[]) {
		Fibonacci_without_third_variable_forloop obj = new Fibonacci_without_third_variable_forloop();
		obj.without2();

	}

	public void without2() {
		int n = 10;

		int first = 0;
		int second = 1;

		if (n >= 1) {
			System.out.println(0);
		}
		if (n >= 2) {
			System.out.println(1);
		}

		
		for(int count=3;count<=n;count++) {

			System.out.println(first + second);
			second = first + second;
			first = second - first;
			
		}
	}
}


