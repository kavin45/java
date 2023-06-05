package whileloop;

public class Matrix_numbers {
	
	public static void main(String args[])
	{
	Matrix_numbers obj=new Matrix_numbers();
	obj.print();
	System.out.println("--------------------------------------");
	obj.even();
	System.out.println("--------------------------------------");
	obj.single();
	System.out.println("--------------------------------------");
	obj.reverse();
	System.out.println("--------------------------------------");
	obj.reverse_single();
	System.out.println("--------------------------------------");
	obj.odd();
	}
	public void print()
	{
	 int row=1;
	 while (row<=3)
	  {
	   int col=1;
	      while(col<=5)
	       {
	       System.out.print(col+ " ");
	       col++;
	       
	        }
	        row++;
	        System.out.println( "  ");
	     }
	   }


	       public void even()
	       {
	         int row=1;
	           
	         while (row<=3)
	          {
	            int a=2;
	            int col=1;
	            while(col<=5)
	            {
	              
	            System.out.print(a+ " ");
	            a=a+2;
	             col++;
	             }
	            row++;
	           System.out.println( "  ");
	     }
	   } 


	        public void single()
	       {
	         int row=1;
	           
	         while (row<=3)
	          {
	            
	            int col=1;
	            
	            while(col<=5)
	            { 
	            
	            System.out.print(row+ " ");
	             col++;
	             }
	            row++;
	           System.out.println( "  ");
	     }
	   } 
	          
	        public void reverse()
	       {
	         int row=1;
	           
	         while (row<=3)
	          {
	            
	            int col=5;
	            
	            while(col>=1)
	            { 
	            
	            System.out.print(col+ " ");
	             col--;
	             }
	            row++;
	           System.out.println( "  ");
	     }
	   } 


	        public void reverse_single()
	       {
	         int row=4;
	           
	         while (row>=1)
	          {
	            
	            int col=1;
	            
	            while(col<=5)
	            { 
	            
	            System.out.print(row+ " ");
	             col++;
	             }
	            row--;
	           System.out.println( "  ");
	     }
	   } 


	        public void odd()
	       {
	         int row=1;
	           
	         while (row<=3)
	          {
	            int a=1;
	            int col=1;
	            while(col<=5)
	            {
	              
	            System.out.print(a+ " ");
	            a=a+2;
	             col++;
	             }
	            row++;
	           System.out.println( "  ");
	     }
	   } 









	







}
