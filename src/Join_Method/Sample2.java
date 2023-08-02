package Join_Method;

public class Sample2 extends Thread{
	
	public void run() {
		   try {
			   
			   for(int i=1;i<=10;i++) {
				   System.out.println("User Thread:"+i);
				   Thread.sleep(2000);
			   }
			
		} catch ( Exception e) {
			System.out.println("user error");
		}
		   
	   }
	   public static void main(String[] args) throws InterruptedException {
		  
		  
		   Sample2 s2=new Sample2();
		   s2.start();
		   s2.join(10000);
		   
		   try {
			   for(int i=1;i<=10;i++) {
				   System.out.println("Main Thread:"+i);
				   //Thread.sleep(2000);
			   }
			
		  } catch ( Exception e) {
			System.out.println("main error");
			
		  }
		   
	   }
}
