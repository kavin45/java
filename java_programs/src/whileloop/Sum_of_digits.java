package whileloop;

public class Sum_of_digits {
	
	public static void main(String args[])
	{
	Sum_of_digits obj=new Sum_of_digits();
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
	while(n>0)
	{
	int a=n%10;
	sum=sum+a;
	n=n/10;
	}
	System.out.println(" Sum the given number = "+sum);
	}

	else
	{
	System.out.println("check the number = "+c); 
	}
	}
	}



