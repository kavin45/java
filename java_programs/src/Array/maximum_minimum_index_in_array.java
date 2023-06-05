package Array;

public class maximum_minimum_index_in_array {
	
	public static void main(String args[])
	
	{
		maximum_minimum_index_in_array obj=new maximum_minimum_index_in_array();
		find_middle_element_array.size();
		find_middle_element_array.element();
		find_middle_element_array.display();
		obj.max();
		obj.backup();
		obj.duplicate();
		
	}
	public void max()
	{
		int second_max=0;
		int second_min=0;
		int max=Integer.MIN_VALUE;//find_middle_element_array.a[0];Integer.Min_value
		int min=Integer.MAX_VALUE;//find_middle_element_array.a[0];//Integer.Max_value
	for(int i=1;i<find_middle_element_array.a.length;i++)
	{
		if(find_middle_element_array.a[i]>max)
        {
			
	      max=find_middle_element_array.a[i];
	   
        }
		if(second_max<find_middle_element_array.a[i]&&find_middle_element_array.a[i]==max)
		{
			second_max=find_middle_element_array.a[i];
		}
		if(find_middle_element_array.a[i]<min)
		{
			second_min=min;
			  min=find_middle_element_array.a[i];
		}
	
	}
	 System.out.println("maximum num in index : "+max);
	 System.out.println("second maximum num in index : "+second_max);
	
	 System.out.println("minimum num in index : "+min);
	 System.out.println("second minimum num in index : "+second_min);

}
	public void backup()
	{
		int arr[]=new int[find_middle_element_array.a.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=find_middle_element_array.a[i];
			System.out.println("Backup array : "+arr[i]);
		}
		
	}
	public void duplicate()
	{
		for(int i=0;i<find_middle_element_array.a.length;i++)
		{
			for(int j=i+1;j<find_middle_element_array.a.length;j++)
			{
				if(find_middle_element_array.a[i]==find_middle_element_array.a[j])
				{
					System.out.println("duplicte "+find_middle_element_array.a[j]);
					
				}
			}
		}
	}
	
}
