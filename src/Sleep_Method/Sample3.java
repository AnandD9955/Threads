package Sleep_Method;

import Implements_RunnableInterface.Demo;

public class Sample3 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
	    	 System.out.println("Anand");
	    	 try {
	  		   Thread.sleep(2000);
	  	} catch (Exception e) {
	  		 System.out.println("error");
	  	}
	    	 }
	   
		
	}
	public static void main(String[] args) {
		Sample3 s3=new Sample3();
		Thread th=new Thread(s3);
		th.start();
	}

}
