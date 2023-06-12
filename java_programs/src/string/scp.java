package string;

public class scp 
{
	String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String args[])
    {
    	String s="welcome";
    	System.out.println(s.hashCode());
    	String s1="WELCOME";
    	System.out.println(s1.hashCode());
    	String s2="welcome";
    	System.out.println(s2.hashCode());
    	scp obj=new scp();
    	scp obj1=new scp();
    	System.out.println("Your hashcode "+obj.hashCode());
    	System.out.println("Your hashcode  "+obj1.hashCode());
    	String a=new String("hai");
    	System.out.println("String a "+a.hashCode());
    	
    //	String a1=new String("hai");
    	System.out.println("String a1 "+a.hashCode());
    	System.out.println(obj==obj1);
    	System.out.println(obj.equals(obj1));
    	System.out.println(s==s2);
    	System.out.println(s==s1);
    	System.out.println(s.equals(s2));
    	System.out.println(s.equals(s1));
    }
}
