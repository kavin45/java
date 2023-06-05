package forloop;

public class Prime_in_forloop {


		public static void main(String args[]) {
			Prime_in_forloop obj = new Prime_in_forloop();
			obj.two1();
		}

		// print the prime number for given number
		public void two1() {

			
			int num = 35;
			int count = 0;
		for(int i=2;i<=num;i++)
		{
				if (num % i == 0) {
					count++;
				}
				i++;
				
			}
		
			if (count == 1) {
				System.out.println("Given number is a prime number = " + num);
			} else {
				System.out.println("Given number is not a prime number = " + num);
			}
		}
	}



