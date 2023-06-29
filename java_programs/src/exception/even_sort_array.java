package exception;

public class even_sort_array {

	public static void main(String[] args) {
		even_sort_array obj=new even_sort_array();
		obj.eve();
	}
	public void eve()
	{
		int a[]= {35,37,12,7,45,35,97,66};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		int even[]=new int[count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[index]=a[i];
				index++;
			}
		}
		int temp=0;
		for(int i=0;i<even.length;i++)
		{
			for(int j=0;j<even.length;j++)
			{
				if(even[i]>even[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<even.length;i++)
		{
			System.out.println(even[i]);
		}
	}

}
