package forloop;

public class Armstrong_in_forloop {
		
		public static void main(String args[])
		{
			Armstrong_in_forloop obj=new Armstrong_in_forloop();
		obj.check(153);
		}
		public void check(int n)
		{
		 int num=n;
		  int sum=0;
		for(;n>0;n=n/10)
		{
		int a=n%10;
		int mod_value=a*a*a;
		sum=sum+mod_value;
		
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







