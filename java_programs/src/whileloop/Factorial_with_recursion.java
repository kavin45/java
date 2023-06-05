package whileloop;

public class Factorial_with_recursion {

	public static void main(String arg[])
    {
		Factorial_with_recursion  object=new Factorial_with_recursion ();
 int answer= object.fact(5);
  System.out.println(answer);
 }
	public int fact(int n)
	{
		
		
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (n*fact(n-1));
		}
		
	}

}
