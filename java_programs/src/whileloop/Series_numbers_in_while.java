package whileloop;

public class Series_numbers_in_while {

	public static void main(String args[]) {
		Series_numbers_in_while obj = new Series_numbers_in_while();
		obj.print();
		obj.hundred();
		obj.ten();
		obj.forward();
		obj.backword();
	}

	// print hai 5 times in while loop
	public void print() {
		int count = 1;
		System.out.println(" Print hai 5 times in while loop ");
		while (count <= 5) {
			System.out.println(" Hai = " + count);
			count++;
		}
		System.out.println("--------------------------------------------------------------------------------");
	}

	// print hundred 10 times in while loop
	public void hundred() {
		int count = 1;
		System.out.println(" Print hundred 10 times in while loop ");
		while (count <= 10) {

			System.out.println(" 100 = " + count);
			count++;
		}
		System.out.println("-------------------------------------------------------------------------------------");
	}

	// print 1 to 10 in while loop
	public void ten() {
		int count = 1;
		int ans = 1;
		System.out.println(" Print 1 to 10 in while loop ");
		while (count <= 10) {

			System.out.println("  " + ans);
			count++;
			ans++;
		}
		System.out.println("-------------------------------------------------------------------------------------");
	}

	// print 2,4,6,8,10 in while loop
	public void forward() {
		int count = 1;
		int ans = 2;
		System.out.println(" Sum the 2 value with the given answer   ");
		while (count <= 5) {

			System.out.println("  " + ans);
			count++;
			ans = ans + 2;
		}
		System.out.println("-------------------------------------------------------------------------------------");
	}

	// print 10,8,6,4,2 in while loop
	public void backword() {
		int count = 1;
		int ans = 10;
		System.out.println(" Subtract the 2 value with the given answer   ");
		while (count <= 5)

		{
			System.out.println("  " + ans);
			count++;
			ans = ans - 2;
		}

		System.out.println("-------------------------------------------------------------------------------------");
	}
}
