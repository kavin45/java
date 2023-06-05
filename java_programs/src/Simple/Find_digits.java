package Simple;

public class Find_digits {

	
	
	  public static void main(String args[])
	  {
	   Find_digits obj=new Find_digits();
	   int one  = obj.unit(73);
	   int two  = obj.second(124);
	   int three = obj.third(954);
	   int four  = obj.fourth(12963); 
	   int total = obj.sum(one,two,three,four);
	   obj.swap(total);

	  }
	// to find unit digit number
	    public int unit(int n)
	    {
	     int unit_digit=n%10;
	     System.out.println(" Unit digit number= " +unit_digit);
	     return unit_digit;
	    }
	   //to find second digit number
	    public int second(int n)
	    {
	    int second_digit=(n/10)%10;
	    System.out.println(" Second  digit number= " +second_digit);
	     return second_digit;
	     }
	    //to find third digit number
	     public int third(int n)
	    {
	    int third_digit=(n/100)%10;
	    System.out.println(" Third  digit number= " +third_digit);
	     return third_digit;
	    }
	    // to find fourth digit number
	    public int fourth(int n)
	    {
	    int fourth_digit=(n/1000)%10;
	    System.out.println(" fourth  digit number= " +fourth_digit);
	     return fourth_digit;
	     }
	     //total the given answers
	    public int sum(int w,int x,int y,int z)
	    {
	     int total= w+x+y+z;
	     System.out.println("total value: "+total);
	     return total;
	    } 
	    // swap the answer
	    public void swap(int a)
	    {
	     int x=a/10;
	     int y=a%10;
	     int first=y;
	     int second=x;
	     System.out.println("Swap the total number: " + first +second);
	    }
	}


