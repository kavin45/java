package forloop;

public class Hcf_three_in_forloop {
	
		public static void main(String arg[])
	    {
			Hcf_three_in_forloop object=new Hcf_three_in_forloop();
	  object.number(14,6,8);
	  object.number(12,24,36);
	  object.number(8,24,64);
	 }
	   public void number(int a,int b,int c)
	     {
	    
	    int hrf=0;
	     int small= a>b? b:a;
	     int num =small>c?c:small;
	     for(int i=1;i<=num;i++)
	     { 
	     if(a%i==0 && b%i==0 && c%i==0)
	     {
	       hrf=i;
	     
	     } 
	     } 
	    System.out.println("hcf number="+hrf);
	     }
	}





