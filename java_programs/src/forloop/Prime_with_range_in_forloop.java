package forloop;

public class Prime_with_range_in_forloop {
	
		 public static void main(String args[])
		 {
			 Prime_with_range_in_forloop obj=new Prime_with_range_in_forloop();
			 obj.check(15);
			 
		 }
		 public void check(int n) {
			System.out.println(n+" range prime number"); 
			System.out.println("------------------------");
			 int prime=1;
			 for(int count=0;count<=n;prime++)
			 {
				 int div=0;
				 for(int i=1;i<=prime;i++)
				 {
					 if(prime%i==0)
					 {
						 div++;
					 }
					
				  }	
				
				 if(div==2)
				     {
					 System.out.println(prime);
					 count ++;
				     }
			 }
	     	 
			 	 
			 }
			 
		 }

	



