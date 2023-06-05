package forloop;

public class Factorial_in_forloop {
		public static void main(String arg[])
	    {
			Factorial_in_forloop  object=new Factorial_in_forloop ();
	  object.num();
	  object.num2();
	  
	 }
		public void num()
		{
			int n=5;
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
				
			}
			System.out.println(fact);
				}
		public void num2()
		{
		int n=5;
		int fact=1;
		int i=1;
		do
		{
			fact=fact*i;
			i++;
		}
		while(i<=n);
		System.out.println(fact);
			}
		
}
