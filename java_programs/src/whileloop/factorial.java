package whileloop;

public class factorial {
	public static void main(String arg[])
    {
  factorial object=new factorial();
  object.num();
 }
	public void num()
	{
		int n=5;
		int fact=1,i=1;
		while(n>=i)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
