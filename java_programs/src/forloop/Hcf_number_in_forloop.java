package forloop;

public class Hcf_number_in_forloop {


	public static void main(String args[])
	{
		Hcf_number_in_forloop obj=new Hcf_number_in_forloop();
		obj.check(3,7);
	}
	public void check(int a ,int b)
	{
		
		int small=a>b?b:a;
		int hcf=0;
		for(int i=1;i<=small;i++)
		{
			if(a%i==0 &&b%i==0)
			{
				 hcf=i;
			}
		}
		System.out.println(hcf);
	}
	}



