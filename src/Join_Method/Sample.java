package Join_Method;

import java.util.Iterator;

public class Sample extends Thread{
	
	//static Thread mainThread;
	//Thread mainThread;
   public void run() 
   {
           //mainThread.join(10000);
		   for(int i=1;i<=10;i++) 
		   {
			   System.out.println("User Thread:"+i);
			   try {
				Thread.sleep(2000);
			   } 
			   catch (Exception e) 
			   {
				 
				   System.out.println("user error");
			   }
		   }
    }
    public static void main(String[] args) throws InterruptedException {
	  
	   Sample s=new Sample();
	   s.start();
	   s.join(10000);
	   
	       for(int i=1;i<=10;i++) 
		   {
			   System.out.println("Main Thread:"+i);
			   //Thread.sleep(2000);
		   }
    }
}
