package forloop;

public class Magic_number_in_forloop {


		public static void main(String args[])
		{
			Magic_number_in_forloop obj=new Magic_number_in_forloop();
			obj.check(1458);
			obj.check(8788);
		
		}
		public void check(int n)
		{
			int num=n;
			int sum=0;
			int rev=0;
			for(;n>0;n=n/10)
			{
				int a=n%10;
				sum=sum+a;
				
			}
			int value=sum;
			for(;value>0;value=value/10)
			{
				int a=value%10;
				 rev=rev*10+a;
				
			}
			int magic=sum*rev;
			if(magic==num)
			{
				System.out.println("magic");
			}
			else
			{
				System.out.println(" not magic");
			}
				
		}
		}




