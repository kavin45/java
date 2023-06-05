package forloop;

public class Series_patterns_in_forloop {
	
		
		   public static void main(String args[])
		    {
		      Series_patterns_in_forloop obj=new Series_patterns_in_forloop();
		      obj.check(8);
		      obj.print();
		} 
		 public void check(int n)
		   {
		    
		   for(int i=1;i<=n;i++)
		   {
		     int c=i*10;
		    System.out.println("Print Natural numbers = "+c);
		   }
		   }

		public void print()
		{
		 
		 for (int row=1;row<=3;row++)
		  {
		   
		      for(int col=1;col<=5;col++)
		       {
		        int c=col*10;
		       System.out.print(c+ " ");
		       
		       
		        }
		        
		        System.out.println( "  ");
		     }
		   }
		

	


}
