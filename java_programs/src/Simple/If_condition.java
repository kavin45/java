package Simple;

public class If_condition {
	

	   public static void main(String args[])
	   {
	   If_condition obj=new If_condition();
	   obj.even(); 
	   obj.sum();
	   obj.divisible();
	   obj.multiple();
	   obj.notmultiple();
	   }
	//find even number
	  public void even()
	  {
	  int a=10;
	  if(a%2==0)
	  {
	  System.out.println(a+ " = even number");
	  }
	    else
	    {
	    System.out.println(a+" = odd number");
	    }
	  }
	   //find addition value and multiplication value equal
	   public void sum()
	  {
	   int a=5,b=6;
	   
	   if((a+b)==(a*b))
	    {
	    System.out.println( a + " " + b + " " +  " = sum and product value  are equal" );
	    }
	    else
	    {
	    System.out.println( a + " " + b + " "  +  " = sum and product value  are not equal");
	    }
	   }
	 //to find product and sum of two numbers is divisible by 4
	   public void divisible()
	  {
	   int a=3,b=8;
	   int c=a+b,d=a*b;
	   
	   if(c%4==0 && d%4==0)
	    {
	    System.out.println("sum and product of two numbers is divisible by 4");
	    }
	    else
	    {
	    System.out.println("sum and product of two numbers is not  divisible by 4");
	    }
	   }

	   //to find  sum of two numbers is multiple of 2  or product of two numbers is multiple of 3
	   public void multiple()
	  {
	   int a=5,b=6;
	   int c=a+b,d=a*b;
	   
	   if(c%2==0 || d%3==0)
	    {
	    System.out.println("The given numbers is multiple of 2 or multiple of 3");
	    }
	    else
	    {
	    System.out.println(" The given numbers is not  multiple of 2 or multiple of 3");
	    }
	   }
	  //find the given number is not a multiple of 3 and 7
	 public void notmultiple()
	  {
	  int n=10;
	  if(n%3!=0 && n%7!=0 )
	  {
	  System.out.println(n + " = The given numbers is not a multiple of 3 and 7");
	  }
	    else
	    {
	    System.out.println(n+ " = The given numbers is  a multiple of 3 and 7");
	    }
	  }
	










	  























}
