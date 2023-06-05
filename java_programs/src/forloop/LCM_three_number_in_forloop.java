package forloop;

public class LCM_three_number_in_forloop {
	

		public static void main(String args[])
		{
			LCM_three_number_in_forloop obj=new LCM_three_number_in_forloop();
			obj.check(17,3,5);
		}
		public void check(int a ,int b,int c)
		{
			int range=a*b*c;
			int large=a>b?a:b;
			int larger=large>c? large:c;
			for(int i=larger;i<=range;larger++)
			{
				if(larger%a==0 && larger%b==0 && larger%c==0)
				{
					System.out.println("LCM THREE NUMBER = " +larger);
					break;
				}
				
			}
		
	}
	}


