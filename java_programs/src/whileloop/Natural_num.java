package whileloop;

public class Natural_num {

public static void main(String args[])
{
	Natural_num obj=new Natural_num();
	obj.nat();
	
}
public void nat()
{
int i=2;
int n=10;
do
{
	System.out.println(i);
	i=i+2;
}
while(i<=n);
}
}
