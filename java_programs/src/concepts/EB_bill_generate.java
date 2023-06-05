package concepts;

import java.util.Scanner;

public class EB_bill_generate {
     
        public static void main(String args[])   
        {     
        	EB_bill_generate obj=new EB_bill_generate();
        	Scanner ob=new Scanner(System.in);
        	System.out.println("enter a unit value = ");
        	int n= ob.nextInt();
        	
        	ob.close();
        	obj.bill(n);
        
        	
        	
        }
        public void bill(int a)
        {
            
            int units=a;
            double hundred=100*2.25;
            double two_hundred=200*4.50;
            double hundred1=300*4.50;
            double two_hundred1=100*6;   
            double three_hundred=100*8;  
            double four_hundred=200*9;  
            double five_hundred=200*10;
            double bill = 0;  
            if (units<500)
            {
            
            // check whether units are less than 100  
             if((units>1) && (units < 100))  
            {  
                bill = units * 0;  
            }  
            // check whether the units are less than 100
             if((units>101) && (units < 200)){  
                bill =  2.25 *(units - 100);  
            }  
            // check whether the units are greater than 200  
             if ((units>201) && (units < 400))
            {  
                bill =hundred+ 4.50 *(units - 200) ;  
            }  
            // check whether the units are greater than 400 
             if ((units>401) && (units < 500))
            {  
                bill = hundred+two_hundred+ 6* (units - 400) ;  
            }  
            System.out.println("The electricity bill for " +units+ " is : " + bill);  
            } 
        
        
        
             if(units>500)
            {
             if ((units>1) && (units < 100))
            {  
                bill = units*0; 
            }  
             if ((units>101) && (units < 400))
             {  
                 bill = 4.50*(units-100); 
             }  
             if ((units>401) && (units < 500))
             {  
                
                 bill = hundred1+ 6* (units - 400) ;
             }  
             if ((units>501) && (units < 600))
             {  
                 bill =hundred1+two_hundred1+8*(units-500); 
             }  
             if ((units>601) && (units < 800))
             {  
                 bill = hundred1+two_hundred1+three_hundred+9*(units-600); 
             }  
             if ((units>801) && (units < 1000))
             {  
                 bill = hundred1+two_hundred1+three_hundred+four_hundred+10*(units-800); 
             }  
             if (units > 1000)
             {  
                 bill = hundred1+two_hundred1+three_hundred+four_hundred+five_hundred+11*(units-1000); 
             }  
             
             
            System.out.println("The electricity bill for " +units+ " is : " + bill);   
             }   
        }
}
     


