package whileloop;

public class simple_whileloop_programs {
	
	public static void main(String args[])
	{
		simple_whileloop_programs obj=new simple_whileloop_programs();
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
	int i=200;
	 while(i>=150)
	 {
	  if(i%9==0)
	   {  
	     System.out.println(i);
	   }
	     i--;
	  }

	        System.out.println("-------------------------------------------------------------------------------------");
	 }
	//print the first 5 odd numbers 
	public void five()
	{
	System.out.println(" print the first 5 odd numbers ");
	   int a=1;
	   int i=0;
	   while(i<5)
	     {
	        System.out.println(a);
	         a=a+2;
	          i++;
	     }

	      i++;
	      System.out.println("-------------------------------------------------------------------------------------");

	  }
	//print the odd numbers to 200 to 300
	   public void range()
	   {
	    System.out.println(" print the odd numbers to 200 to 300 ");
	     int i=200;
	     while(i<300)
	     {
	        if(i%2!=0)
	          {
	             System.out.println(i);
	          }
	          i++;
	      }
	       System.out.println("-------------------------------------------------------------------------------------");
	     }


	//print the  numbers which are divisible by 3 and 5
	   public void divisible()
	   {
	    System.out.println(" print the numbers which are divisible by 3 and 5 ");
	     int i=1;
	     while(i<=100)
	     {
	        if(i%3==0 && i%5==0)
	          {
	             System.out.println(i);
	          }
	          i++;
	      }
	       System.out.println("-------------------------------------------------------------------------------------");
	     }

	//print the  number of devises from 1 to 100 for 9 divisers
	   public void divisers()
	   {
	    System.out.println(" print the  number of devises from 1 to 100 for 9 divisers ");
	     int nine_divisers=0;
	     int count=1;
	     while(count<=100)
	     {
	        if(count%9==0)
	          {
	             nine_divisers++;
	          }
	          count++;
	      }
	       System.out.println(nine_divisers);
	       System.out.println("-------------------------------------------------------------------------------------");
	     }
	 
	//print the  number of devises from 1 to 100 for 9 divisers and 2 divisers without using and  operator
	   public void without_and()
	   {
	    System.out.println(" print the  number of devises from 1 to 100 for 9 divisers and 2 divisers without using and  operator ");
	     int nine_divisers=0;
	     int count=1;
	     while(count<=100)
	     {
	        if(count%9==0)
	          {
	            if(count%2==0)
	            {
	           System.out.println(count);
	             nine_divisers++;
	            }
	          }
	          count++;
	      }
	       System.out.println(" count the given answers = " +nine_divisers);
	       System.out.println("-------------------------------------------------------------------------------------");
	     }

	//print the divisers of 7 from 100 to 200 which are greater than 150
	   
	public void seven()
	   {
	    System.out.println(" print the divisers of 7 from 100 to 200 which are greater than 150");
	     
	     int count=100;
	     while(count<=200)
	     {
	        if(count%7==0)
	          {
	            if(count>=150)
	            {
	           System.out.println(count);
	             
	            }
	          }
	          count++;
	      }
	       
	       System.out.println("-------------------------------------------------------------------------------------");
	     }

	//print the divisors of 2
	   public void two()
	   {
	    System.out.println(" print the divisors of twelve");
	     int i=1;
	     int num=12;
	     while(i<=12)
	     {
	        if(num%i==0)
	          {
	             System.out.println(i);
	          }
	          i++;
	      }
	       System.out.println("-------------------------------------------------------------------------------------");
	     }



	}



