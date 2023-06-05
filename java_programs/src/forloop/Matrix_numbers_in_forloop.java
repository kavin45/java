package forloop;

public class Matrix_numbers_in_forloop {
	
		
		public static void main(String args[])
		{
			Matrix_numbers_in_forloop obj=new Matrix_numbers_in_forloop();
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
		 for (int row=1;row<=3;row++)
		  {
		      for(int col=1;col<=5;col++)
		       {
		       System.out.print(col+ " ");
		       
		        }
		        
		        System.out.println( "  ");
		     }
		   }


		       public void even()
		       {
		           
		         for(int row=1;row<=3;row++)
		          {
		            int a=2;
		            
		            for(int col=1;col<=5;col++)
		            {
		              
		            System.out.print(a+ " ");
		            a=a+2;
		             
		             }
		            
		           System.out.println( "  ");
		     }
		   } 


		        public void single()
		       {
		          for(int row=1;row<=3;row++)
		          {
		            
		            for(int col=1;col<=5;col++)
		            { 
		            
		            System.out.print(row+ " ");
		             
		             }
		            
		           System.out.println( "  ");
		     }
		   } 
		          
		        public void reverse()
		       {
		         for(int row=1;row<=3;row++)
		          {
		            
		            for(int col=5;col>=1;col--)
		            { 
		            
		            System.out.print(col+ " ");
		            
		             }
		           System.out.println( "  ");
		     }
		   } 


		        public void reverse_single()
		       {
		        
		           
		         for(int row=4;row>=1;row--)
		          {
		            
		            
		            
		           for(int col=1;col<=5;col++)
		            { 
		            
		            System.out.print(row+ " ");
		             
		             }
		            
		           System.out.println( "  ");
		     }
		   } 


		        public void odd()
		       {  
		          for (int row=1;row<=3;row++)
		          {
		            int a=1;
		            
		            for(int col=1;col<=5;col++)
		            {
		              
		            System.out.print(a+ " ");
		            a=a+2;
		           
		             }
		           System.out.println( "  ");
		     }
		   }


}
