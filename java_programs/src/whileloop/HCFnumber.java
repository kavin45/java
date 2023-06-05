package whileloop;

public class HCFnumber {

public static void main(String args[])
{
	HCFnumber obj=new HCFnumber();
	obj.check(3,7);
}
public void check(int a ,int b)
{
	
	int small=a>b?b:a;
	int i=1;
	int hcf=0;
	while(i<=small)
	{
		if(a%i==0 &&b%i==0)
		{
			 hcf=i;
		}
		i++;
	}
	System.out.println(hcf);
}
}
