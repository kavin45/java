package whileloop;

public class Series_patterns {
	
	   public static void main(String args[])
	    {
	      Series_patterns obj=new Series_patterns();
	      obj.check(8);
	      obj.print();
	} 
	 public void check(int n)
	   {
	    int i=1;
	   while(i<=n)
	   {
	     int c=i*10;
	    System.out.println("Print Natural numbers = "+c);
	    i++;
	   }
	   }

	public void print()
	{
	 int row=1;
	 while (row<=3)
	  {
	   int col=1;
	      while(col<=5)
	       {
	        int c=col*10;
	       System.out.print(c+ " ");
	       col++;
	       
	        }
	        row++;
	        System.out.println( "  ");
	     }
	   }
	

}
