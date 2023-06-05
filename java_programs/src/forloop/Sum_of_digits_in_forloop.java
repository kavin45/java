package forloop;

public class Sum_of_digits_in_forloop {
	
		
		public static void main(String args[])
		{
		Sum_of_digits_in_forloop obj=new Sum_of_digits_in_forloop();
		obj.check(321);
		obj.check(8945);
		obj.check(67);
		obj.check(3);
		}
		public void check(int n)
		{
		int c=n;
		int sum=0;
		System.out.println("Given number = "+c);
		if(n>9)
		{
		for(int i=0;n>i;n=n/10)
		{
		int a=n%10;
		sum=sum+a;
	
		}
		System.out.println(" Sum the given number = "+sum);
		}

		else
		{
		System.out.println("check the number = "+c); 
		}
		}
		




}
