package Array;

public class merge_two_array {
	
	public  static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8};
		int result[]=new int[arr.length+arr1.length];
		int i;
		
		for( i=0;i<arr.length;i++)
		{
			result[i]=arr[i];
		}
		for( i=0;i<arr1.length;i++)
		{
			result[i+arr.length]=arr1[i];
			
		}
		System.out.println("After merge the two array's: ");
		for( i=0;i<result.length;i++)
		{
		System.out.print(" "+result[i]);
		}
		
	}

}
