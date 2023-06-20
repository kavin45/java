package string;

import java.util.Arrays;

public class string_arr_first_caps {
	public static void main(String[] args) {
		String msg="applc orangs caks biks";
		String c[]=msg.split(" ");
		for(String i:c)
		{
			System.out.println(i);
		}
		char d =' ';
		for(int i=0;i<c.length;i++)
		{
				d=c[0].charAt(c[0].length()-1);
				System.out.println((d));			
		}
		//System.out.println((d));
		
		
		
		
	}

}
