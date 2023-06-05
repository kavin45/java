package whileloop;

public class LCMnumber {
	
	public static void main(String args[])
	{
		LCMnumber obj=new LCMnumber();
		obj.check(17,3);
	}
	
	public void check(int a ,int b)
	{
		
		int large=a>b?a:b;
		//int range = a*b;
		int first = large; 
		while(large<=a*b)
		{
			if(large%a==0 && large%b==0)
			{
				System.out.println(large);
				break;
			} 
			
	    large = large+first;// increment large multiply 
		}
		
	}

}
