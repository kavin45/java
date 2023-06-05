package whileloop;

public class Simple_whileloop_programs {
	
	   public static void main(String args[])
	    {
		   Simple_whileloop_programs obj=new Simple_whileloop_programs();
	      obj.check(8);
	      System.out.println("------------------------------------------------");
	      obj.reverse(8);
	      System.out.println("------------------------------------------------");
	      obj.sum(5);
	      System.out.println("------------------------------------------------");
	      obj.even(10);
	      System.out.println("------------------------------------------------");
	      obj.odd(10);
	      System.out.println("------------------------------------------------");
	      obj.count_digits(7321);
	      System.out.println("------------------------------------------------");
	      obj.digit(732);
	      System.out.println("------------------------------------------------");
	      obj.sum_digit(732);
	      System.out.println("------------------------------------------------");
	      obj.sum_digits(732);
	      System.out.println("------------------------------------------------");
	      obj.reverses(123);
	      System.out.println("------------------------------------------------");
	      obj.palindrome(121);
	      System.out.println("------------------------------------------------");
	      obj.divisors(12);
	      System.out.println("------------------------------------------------");
	      obj.prime(13);
	      System.out.println("------------------------------------------------");
	      obj.rev_prime(31);
	      System.out.println("------------------------------------------------");
	      obj.sum_prime(31);
	      
	    }
	   //print all natural numbers from 1 to n
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
	 //print all natural number from 1 to n reverse order
	 public void reverse(int n)
	   {
	    int i=1;
	   while(i<=n)
	   {
	    System.out.println("Print Natural numbers in reverse = "+n);
	    n--;
	   }
	   }

	//find sum of natural numbers from 1 to n
	public void sum(int n)
	   {
	    int i=1;
	    int sum=0;
	    System.out.println("Print Given number = "+n);
	   while(i<=n)
	   {
	    sum=sum+i;
	    i++;
	   }
	   System.out.println("Print sum of  Natural numbers = "+sum);
	   }

	//find sum of even numbers from 1 to n
	public void even(int n)
	   {
	    int i=1;
	    int sum=0;
	    System.out.println("Print Given number = "+n);
	   while(i<=n)
	   {
	    if(i%2==0)
	     {
	    sum=sum+i;
	     }
	    i++;
	   }
	   System.out.println("Print sum of  even numbers = "+sum);
	   }
	  
	   //find sum of odd numbers from 1 to n
	   public void odd(int n)
	   {
	    int i=1;
	    int sum=0;
	    System.out.println("Print Given number = "+n);
	   while(i<=n)
	   {
	    if(i%2!=0)
	     {
	    sum=sum+i;
	     }
	    i++;
	   }
	   System.out.println("Print sum of  odd numbers = "+sum);
	   }

	  // count number of digits in an integer
	   public void count_digits(int n)
	    {
	      int c=n;
	      System.out.println("Given number = "+c);
	      if(n>9)
	      {
	        int count=0;
	        while(n>0)
	        {
	          count++;
	          n=n/10;
	        }
	        System.out.println("Count the digits of given number = " +count);
	        }
	       else
	       {
	        System.out.println("check the number = "+c);
	       }
	        }
	  //find first and last digit of a number
	   public void digit(int n)
	    {
	     int first = n;
	     
	     while(first>9)
	     {
	      first=first/10;
	     }
	  
	     System.out.println("First digit number = "+first);
	     int last=n%10; 
	     System.out.println("Last digit number = "+last);
	      }
	    // find sum of first and last digits of a number
	     public void sum_digit(int n)
	    {
	     int first = n;
	     
	     while(first>9)
	     {
	      first=first/10;
	     }
	     //System.out.println("First digit number = "+first);
	     int last=n%10; 
	     //System.out.println("Last digit number = "+last);
	     int sum= first+last;
	      System.out.println("Sum of first and last digit number = "+sum);
	      }
	     //find sum of a digits of a given number
	     public void sum_digits(int n)
	     {
	      int c=n;
	      int sum=0;
	      System.out.println("Given number = "+c);
	      if(n>9)
	      {
	      while(n>0)
	      {
	       int a=n%10;
	       sum=sum+a;
	       n=n/10;
	       }
	       System.out.println(" Sum the given number = "+sum);
	       }

	       else
	       {
	       System.out.println("check the number = "+c); 
	       }
	      }
	  //print given number in reverse
	     public void reverses(int n)
	      {
	        int c=n;
	         int rev_num=0;
	         System.out.println("Given number = "+c);

	       if(n>9)
	       {
	        while(n>0)
	        {
	         int a=n%10;
	         rev_num=rev_num*10+a;
	         n=n/10;
	         }
	         System.out.println("Reversed number = "+rev_num);
	        }

	       else 
	       {
	       System.out.println("check the number = "+c); 
	       }
	      }
	     
	//check given number palindrome or not
	       public void palindrome(int n)
	  {
	    int c=n;
	    int rev_num=0;
	  if(n>9)
	  {
	   
	   while(n>0)
	   {
	     int a=n%10;
	     rev_num=rev_num*10+a;
	     n=n/10;
	   }
	   
	   if(c==rev_num)
	   {
	    System.out.println("Palindrome number = " +c);
	    }
	    else
	    {
	     System.out.println(" not a Palindrome number = "+c);    
	     }
	    }
	   else
	    {
	     System.out.println(" Please check the number  = "+c);    
	     }
	    }
	  //print the divisors of given number
	      public void divisors(int n)
	     {
	      int i=1;
	      while(n>=i)
	      {
	       if(n%i==0)
	       {
	        System.out.println("Divisors = "+i);
	       }
	        i++;
	      }

	     }
	  

	      //print the prime number for given number
	   public void prime(int num)
	   {
	  
	     int i=2;
	     
	     int count=0;
	     while(num>=i)
	     {
	        if(num%i==0)
	          {
	             count++;
	          }
	          i++;
	      }
	       if(count==1)
	       {
	         System.out.println("Given number is a prime number = "+num);  
	       }       
	       else
	       {
	         System.out.println("Given number is not a prime number = "+num);  
	       }    
	     }
	    
	       //Reverse the given number and check prime number or not
	   public void rev_prime(int num)
	   {
	     int n = num;
	     int i=2;
	     int rev_num=0;
	     
	     int count=0;  
	     while(num>0)
	   {
	     int a=num%10;
	     rev_num=rev_num*10+a;
	     num=num/10;
	   }
	     while(rev_num>=i)
	     {
	        if(rev_num%i==0)
	          {
	             count++;
	          }
	          i++;
	      }
	      
	       if(count==1)
	       {
	         System.out.println("Given number is a prime number = "+n);  
	       }       
	       else
	       {
	         System.out.println("Given number is not a prime number = "+n);  
	       }    
	     }
	     //check the sum of given number is prime or not
	           public void sum_prime(int n)
	     { 
	     int num = n;
	     int sum = 0;
	     int i = 2;
	     int count = 0;

	     if(num > 9)
	     {
	     while(num > 0)
	       {
	       int a = num % 10;
	       sum = sum + a;
	       num = num / 10;
	       }
	        
	      
	          while(i<=sum)
	          { 
	            if(sum % i == 0)
	            {
	            count++;
	            }  
	          i++;
	          }
	     
	           if(count == 1)
	             {
	             System.out.println(n + "-- sumed number is " + sum + "--- is a PRIME NUMBER");
	             }
	           else
	             {
	             System.out.println(n +" -- sumed number is " + sum +" --- is NOT A PRIME NUMBER");
	             }
	      }
	      else
	       {
	       System.out.println(n + " Check the given number");
	       }
	     }





	



}
