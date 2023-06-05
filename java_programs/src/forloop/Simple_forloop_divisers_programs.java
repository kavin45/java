package forloop;

public class Simple_forloop_divisers_programs {

		
		public static void main(String args[])
		{
			Simple_forloop_divisers_programs obj=new Simple_forloop_divisers_programs();
		obj.nine();
		obj.five();
		obj.range();
		obj.divisible();
		obj.divisers();
		obj.without_and();
		obj.seven();
		obj.two();
		}

		//print the numbers which are divisible by 9 in reverse order from 200 to 300

		public void nine()
		 {
		System.out.println(" print the numbers which are divisible by 9 in reverse order from 200 to 300");
	
		 for(int i=200;i>=150;i--)
		 {
		  if(i%9==0)
		   {  
		     System.out.println(i);
		   }
		     
		  }

		        System.out.println("-------------------------------------------------------------------------------------");
		 }
		//print the first 5 odd numbers 
		public void five()
		{
		System.out.println(" print the first 5 odd numbers ");
		   int a=1;
		   
		   for(int i=0;i<5;i++)
		     {
		        System.out.println(a);
		         a=a+2;
		          
		     }

		      
		      System.out.println("-------------------------------------------------------------------------------------");

		  }
		//print the odd numbers to 200 to 300
		   public void range()
		   {
		    System.out.println(" print the odd numbers to 200 to 300 ");
		     
		     for(int i=200;i<300;i++)
		     {
		        if(i%2!=0)
		          {
		             System.out.println(i);
		          }
		        
		      }
		       System.out.println("-------------------------------------------------------------------------------------");
		     }


		//print the  numbers which are divisible by 3 and 5
		   public void divisible()
		   {
		    System.out.println(" print the numbers which are divisible by 3 and 5 ");
		     
		     for(int i=1;i<=100;i++)
		     {
		        if(i%3==0 && i%5==0)
		          {
		             System.out.println(i);
		          }
		         
		      }
		       System.out.println("-------------------------------------------------------------------------------------");
		     }

		//print the  number of devises from 1 to 100 for 9 divisers
		   public void divisers()
		   {
		    System.out.println(" print the  number of devises from 1 to 100 for 9 divisers ");
		     int nine_divisers=0;
		     
		     for(int count=1;count<=100;count++)
		     {
		        if(count%9==0)
		          {
		             nine_divisers++;
		          }
		          
		      }
		       System.out.println(nine_divisers);
		       System.out.println("-------------------------------------------------------------------------------------");
		     }
		 
		//print the  number of devises from 1 to 100 for 9 divisers and 2 divisers without using and  operator
		   public void without_and()
		   {
		    System.out.println(" print the  number of devises from 1 to 100 for 9 divisers and 2 divisers without using and  operator ");
		     int nine_divisers=0;
		     
		     for(int count=1;count<=100;count++)
		     {
		        if(count%9==0)
		          {
		            if(count%2==0)
		            {
		           System.out.println(count);
		             nine_divisers++;
		            }
		          }
		          
		      }
		       System.out.println(" count the given answers = " +nine_divisers);
		       System.out.println("-------------------------------------------------------------------------------------");
		     }

		//print the divisers of 7 from 100 to 200 which are greater than 150
		   
		public void seven()
		   {
		    System.out.println(" print the divisers of 7 from 100 to 200 which are greater than 150");
		     
		     
		     for(int count=100;count<=200;count++)
		     {
		        if(count%7==0)
		          {
		            if(count>=150)
		            {
		           System.out.println(count);
		             
		            }
		          }
		          
		      }
		       
		       System.out.println("-------------------------------------------------------------------------------------");
		     }

		//print the divisors of 2
		   public void two()
		   {
		    System.out.println(" print the divisors of twelve");
		     
		     int num=12;
		     for(int i=1;i<=num;i++)
		     {
		        if(num%i==0)
		          {
		             System.out.println(i);
		          }
		          
		      }
		       System.out.println("-------------------------------------------------------------------------------------");
		     }



		





}
