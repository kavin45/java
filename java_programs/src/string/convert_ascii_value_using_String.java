package string;

public class convert_ascii_value_using_String {
	public static void main(String[] args) {
		convert_ascii_value_using_String obj=new convert_ascii_value_using_String();
		String w=obj.capital();
		obj.small(w);
		obj.number();
		}
	public String capital()
	{
		System.out.println("Capital letters :");
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<s.length();i++)
		{
			char n=s.charAt(i);
			System.out.println(n+ "-Ascii value =  "+(int)n);
		}
		return s;
	}

	public void small(String s)
	{
		System.out.println();
		System.out.println("Small letters : ");
		String lower=s.toLowerCase();
		
		for(int i=0;i<lower.length();i++)
		{
			char n=lower.charAt(i);
			System.out.println(n+ " -Ascii value = "+(int)n);
		}
	}
	public void number()
	{
		System.out.println();
		System.out.println("numbers :");
		String s="0123456789";
		for(int i=0;i<s.length();i++)
		{
			char n=s.charAt(i);
			System.out.println(n+ " -Ascii value = "+(int)n);
		}
	}
	

}
