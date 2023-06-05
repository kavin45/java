package whileloop;

public class Armstrong {
	
	public static void main(String args[])
	{
	Armstrong obj=new Armstrong();
	obj.check(153);
	}
	public void check(int n)
	{
	 int num=n;
	  int sum=0;
	 while(n>0)
	{
	int a=n%10;
	int mod_value=a*a*a;
	sum=sum+mod_value;
	n=n/10;
	}
	if(num==sum)
	{
	System.out.println("armstrong");
	}
	else
	{
	System.out.println("not armstrong");
	}
	}
	}




