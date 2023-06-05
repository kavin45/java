package whileloop;

public class Fibanoci {
	public static void main(String args[])
	{
		Fibanoci obj=new Fibanoci();
		obj.check();
	
	}
	public void check()
	{
		int first=-1;//first=0
		int second=1;//second=1
		int count=1;
		while(count<=10)
		{
			int a=first+second;
			System.out.println(a);
			first=second;
			second=a;
			count++;
		}
	}
	
}
