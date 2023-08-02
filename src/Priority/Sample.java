package Priority;



public class Sample extends Thread{
	
	public void run() {
		System.out.println("Thread started");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
   public static void main(String[] args) {
	   Sample s=new Sample();
		 s.setPriority(MIN_PRIORITY);
		s.start();
		
		Sample s1=new Sample();
		s1.setPriority(MAX_PRIORITY);
		s1.start();
}
}
