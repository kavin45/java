package whileloop;

public class Magic {

	public static void main(String args[])
	{
		Magic obj=new Magic();
		obj.check(1458);
		obj.check(8788);
	
	}
	public void check(int n)
	{
		int num=n;
		int sum=0;
		int rev=0;
		while(n>0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		int value=sum;
		while(value>0)
		{
			int a=value%10;
			 rev=rev*10+a;
			value=value/10;
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

