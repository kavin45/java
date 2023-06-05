package forloop;

public class Fibanocci_with_recursion {
	
	public static void main(String args[])
	{
		Fibanocci_with_recursion obj=new Fibanocci_with_recursion();
		obj.fib(10);
	}
	int first=-1;
	int second=1;
	public int fib(int n)
	
	{
		if(n==0)
		{
			return 1;
		}
		int a=first+second;
		System.out.println(a);
		first=second;
		second=a;
		return fib(n-1);
	}

}
