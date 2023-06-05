package forloop;

public class LCM_number_in_java {
	
		
		public static void main(String args[])
		{
			LCM_number_in_java obj=new LCM_number_in_java();
			obj.check(17,3);
		}
		
		public void check(int a ,int b)
		{
			
			int large=a>b?a:b;
			int range = a*b;
			int first = large; 
			for(int i=large;i<=range; large = large+first)
			{
				if(large%a==0 && large%b==0)
				{
					System.out.println(large);
					break;
				} 
				
		   
			}
			
		}

	}



