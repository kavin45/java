package concepts;

public class calc extends casio{
	public static void main(String args[])
	{
		calc obj=new calc();
		int add=obj.sum();
		System.out.println(add);
		int multi=obj.product();
		System.out.println(multi);
		int divi=obj.div();
		System.out.println(divi);
	}
	public int div()
	{
		int a=30,b=5;
		int divi=a/b;
		return divi;
	}

}
