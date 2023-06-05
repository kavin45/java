package whileloop;

public class Neon {
	
	public static void main(String args[])
	{
	Neon obj=new Neon();
	obj.check(9);
	}
	public void check(int n)
	{
	 int num=n;
	  int sum=0;
	  int squre=n*n;
	 while(squre>0)
	{
	int a=squre%10;

	sum=sum+a;
	squre=squre/10;
	}
	if(sum==num)
	{
	System.out.println("Neon");
	}
	else
	{
	System.out.println("not neon");
	}
	}
	



}
