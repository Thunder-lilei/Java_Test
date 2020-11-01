package Test;

public class try_finally {
		public int add(int a,int b){   
	         try {
	             return a+b;      
	         } 
	        catch (Exception e) {  
	            System.out.println("catch语句块");
	         }
	         finally{ 
	             System.out.println("finally语句块");
	         }
	         return 0;
	    } 
	     public static void main(String argv[]){ 
	    	 try_finally test =new try_finally(); 
	         System.out.println("和是："+test.add(9, 34)); 
	     }

}
