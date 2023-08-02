package Yield_Method;

public class Sample1 extends Thread{
     //@Override
     public void run() 
     {
//    	 for(int i=0;i<=5;i++) 
//    	 {
    	 System.out.println("Anand");
    	  Thread.yield();
    	 //}
     }
    
     
     public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.start();
		 
//		for(int i=0;i<=5;i++) 
//		{
	    	 System.out.println("Raj");
	    	  
	    //}
		
	}
}
