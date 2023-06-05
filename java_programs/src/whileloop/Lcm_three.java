package whileloop;

public class Lcm_three {

	public static void main(String args[])
	{
		Lcm_three obj=new Lcm_three();
		obj.check(17,3,5);
	}
	public void check(int a ,int b,int c)
	{
		
		int large=a>b?a:b;
		int larger=large>c? large:c;
		while(true)
		{
			if(larger%a==0 && larger%b==0 && larger%c==0)
			{
				System.out.println("LCM THREE NUMBER = " +larger);
				break;
			}
			larger++;
		}
	
}
}
