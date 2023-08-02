package Thread_Schedualing;

public class Sample extends Thread{
	
	
	
	public void run() {
		//String n=Thread.currentThread().getName();
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

	public static void main(String[] args) {
		
//		for(int i=0;i<=3;i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
		 
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
		
		s1.setName("Thread-1");
		s2.setName("Thread-2");
		s3.setName("Thread-3");
		
		s1.start();
		s2.start();
		s3.start();

	}

}
