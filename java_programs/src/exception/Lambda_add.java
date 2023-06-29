package exception;


	@FunctionalInterface  
	 interface Add {
		 int add(int a,int b);  
		}  
		  
	 class Lambda_add {  
		    public static void main(String[] args) {  
		          
		        // Lambda expression without return keyword.  
		        Add ad1=(a,b)->
		        (a+b);  
		        System.out.println(ad1.add(10,20));  
		          
		        // Lambda expression with return keyword.    
		        Add ad2=(int a,int b)->{  
		                            return (a+b);   
		                            };  
		        System.out.println(ad2.add(100,200));  


	}
		}


