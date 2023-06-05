package forloop;

public class Fibonacci_in_forloop {
	
		public static void main(String args[])
		{
			Fibonacci_in_forloop obj=new Fibonacci_in_forloop();
			obj.check();
		
		}
		public void check()
		{
			int first=-1;//first=0
			int second=1;//second=1
			
			for(int count=1;count<=10;count++)
			{
				int a=first+second;
				System.out.println(a);
				first=second;
				second=a;
			
			}
		}
		
	}



