package forloop;

public class Find_no_of_digits_in_forloop {
	
		
		public static void main(String args[])
		{
			Find_no_of_digits_in_forloop obj=new Find_no_of_digits_in_forloop();
		obj.check(721);
		obj.check(7291);
		obj.check(72);
		obj.check(8);

		}
		public void check(int n)
		{
		int c=n;
		System.out.println("Given number = "+c);
		if(n>9)
		{
         int count;
		for(count=0;n>0;count++)
		{
		n=n/10;
		}
		System.out.println("Count the digits of given number = " +count);
		}
		else
		{
		System.out.println("check the number = "+c);
		}
		}
		}






