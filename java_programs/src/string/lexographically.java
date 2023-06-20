package string;

public class lexographically {
	public static void main(String[] args) {
		lexographically obj=new lexographically();
		obj.lexo();
	}
	public void lexo()
	{
		String a[]= {"apple","orange","banana","muskmelon"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Acending orders : ");
		for(String i:a)
		{
		System.out.print(i+" , ");
		}
	}

}
