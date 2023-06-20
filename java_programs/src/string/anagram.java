package string;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		anagram obj=new anagram();
		obj.anag();
	}
public void anag()
{
	String s1="saw";
	String s2="was";
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	boolean flag=false;
	if(a.length==b.length) {
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==b[i])
		{
			flag=true;
			System.out.println("given String is anagram");
			break;
		}
	}
	}
	
		if(flag==false)
		{
			System.out.println("given String is not  anagram");
		}
	}
}

