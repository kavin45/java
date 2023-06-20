package string;

public class string_buffer {
	public static void main(String[] args) {
		
	
	String s = "hai";
	
	s.toUpperCase();
	s.concat("ramu");// method execution wont change the string
	System.out.println(s);//hai
	
	StringBuffer sb = new StringBuffer(s);
	System.out.println(sb);
	sb.append("ramu");// method execution will change the string
	System.out.println(sb);
	 //sb.delete(0,3);
	sb.insert(0, 12345);
	sb.reverse();
	 System.out.println(sb);
	//String ss = new String(sb);
	 
	 String output = sb.toString();
	 System.out.println(output +" string type");
	}
}
