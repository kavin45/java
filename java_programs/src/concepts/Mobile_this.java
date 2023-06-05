package concepts;

public class Mobile_this extends Mobile_super_constructor  {
    private int amount;
	private String exchange;
Mobile_this(){
	
	System.out.println("Free mobile cleaning");
}
Mobile_this(int amount)
{
	this();
	System.out.println("Free mobile temper class and back cover");
}
Mobile_this(int amount,String exchange)
{
	super(amount);
	System.out.println("10% discount for exchange purchase");
}
public static void main(String args[])
{
	Mobile_this cust1=new Mobile_this();
	System.out.println("-----------------------------------------");
	Mobile_this cust2=new Mobile_this(10000);
	System.out.println("-----------------------------------------");
	Mobile_this cust3=new Mobile_this(10000,"redmi");
	}
}
