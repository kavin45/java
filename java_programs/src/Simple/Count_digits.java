package Simple;

public class Count_digits {
	
	public static void main(String args[])
	{
	Count_digits obj=new Count_digits();
	obj.check(721);
	obj.check(7291);
	obj.check(72);
	obj.check(8);

	}
	public void check(int n)
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
	}



