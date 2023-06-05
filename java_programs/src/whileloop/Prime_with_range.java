package whileloop;

public class Prime_with_range {
	 public static void main(String args[])
	 {
		 Prime_with_range obj=new Prime_with_range();
		 obj.check();
		 
	 }
	 public void check() {
		 int count=0;     
		 int prime=2;
		 while(count<15)
		 {
			 int div=0;
			 int i=1;
			 while(i<=prime)
			 {
				 if(prime%i==0)
				 {
					 div++;
				 }
				 i++;
			
			  }	  
			 if(div==2)
			     {
				 System.out.println(prime);
				 count++;
			     }
     	 
		 	 prime++;
		 }
	 }

}
