package string;

public class convert_asciivalue {
	
	public static void main(String[] args) {
		
		convert_asciivalue obj=new convert_asciivalue();
		obj.capital();
		obj.small();
		obj.number();
	}
	public void capital()
	{
		char a='A';
		char z='Z';
		System.out.println("Ascii value of Capital letters");
				for(int i=a;i<=z;i++)
				{
					System.out.println((a)+" = "+(i));
					a++;
				}
	}
	
	public void  small()
	{
		char a='a';
		char z='z';
		System.out.println();
		System.out.println("Ascii value of Small letters");
				for(int i=a;i<=z;i++)
				{
					System.out.println((a)+" = "+(i));
					a++;
				}
	}
	public void number()
	{
		char a='0';
		char b='9';
		System.out.println();
		for(int i=a;i<=b;i++)
		{
			System.out.println(a+"-Ascii value = "+i);
			a++;
		}
		
	}

}
