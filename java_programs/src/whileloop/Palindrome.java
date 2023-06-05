package whileloop;

public class Palindrome {
	
	   public static void main(String args[])
	   {
	      Palindrome obj=new Palindrome();
	      obj.check(129);
	      obj.check(121);
	      obj.check(-5);
	      obj.check(8);
	      obj.check(171);
	      obj.check(252);
	   }
	  public void check(int n)
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
	   }





