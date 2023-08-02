package Sleep_Method;

import Extending_ThreadClass.Sample;

public class Sample2 extends Thread{
	
   //@Override
   public void run()
   {
	   for(int i=0;i<=5;i++) 
	   {
	    	 System.out.println("Anand");
	    	 
	    	 try {
	  		   Thread.sleep(2000);
	    	 } 
	    	 
	    	 catch (Exception e) {
	  		 System.out.println("error");
	  	     }
	   } 
	  
   }
   
   
   public static void main(String[] args) {
		
		Sample2 s2=new Sample2();
		s2.start();
		
	}
}
