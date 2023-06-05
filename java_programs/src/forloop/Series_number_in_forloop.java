package forloop;

public class Series_number_in_forloop {
	

		public static void main(String args[]) {
			Series_number_in_forloop obj = new Series_number_in_forloop();
			obj.print();
			obj.hundred();
			obj.ten();
			obj.forward();
			obj.backword();
		}

		// print hai 5 times in for loop
		public void print() {
			
			System.out.println(" Print hai 5 times in while loop ");
			for (int count=1;count <= 5;count++) {
				System.out.println(" Hai = " + count);
				
			}
			System.out.println("--------------------------------------------------------------------------------");
		}

		// print hundred 10 times in for loop
		public void hundred() {
			
			System.out.println(" Print hundred 10 times in while loop ");
			for(int count=1;count <= 10;count++) {

				System.out.println(" 100 = " + count);
			
			}
			System.out.println("-------------------------------------------------------------------------------------");
		}

		// print 1 to 10 in for loop
		public void ten() {
			
			
			System.out.println(" Print 1 to 10 in while loop ");
			for(int count=1;count <= 10;count++) {

				System.out.println("  " + count);
				
			}
			System.out.println("-------------------------------------------------------------------------------------");
		}

		// print 2,4,6,8,10 in for loop
		public void forward() {
			
			int ans = 2;
			System.out.println(" Sum the 2 value with the given answer   ");
			for (int count=1;count <= 5;count++) {

				System.out.println("  " + ans);
				ans = ans + 2;
			}
			System.out.println("-------------------------------------------------------------------------------------");
		}

		// print 10,8,6,4,2 in for loop
		public void backword() {
			
			int ans = 10;
			System.out.println(" Subtract the 2 value with the given answer   ");
			for (int count=1;count <= 5;count++)

			{
				System.out.println("  " + ans);
				ans = ans - 2;
			}

			System.out.println("-------------------------------------------------------------------------------------");
		}
	}


