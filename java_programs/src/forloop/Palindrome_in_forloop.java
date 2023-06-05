package forloop;

public class Palindrome_in_forloop {		
		   public static void main(String args[])
		   {
			   Palindrome_in_forloop  obj=new Palindrome_in_forloop();
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
		   
		   for(;n>0;n=n/10)
		   {
		     int a=n%10;
		     rev_num=rev_num*10+a;
		     
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







