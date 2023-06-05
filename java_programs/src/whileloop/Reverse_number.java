package whileloop;

public class Reverse_number {
	
	public static void main(String args[])
	{
	Reverse_number obj=new Reverse_number();
	obj.check(321);
	obj.check(8945);
	obj.check(67);
	obj.check(3);
	}
	public void check(int n)
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
	}



