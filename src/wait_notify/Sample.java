package wait_notify;

public class Sample extends Thread {
	int total=0;
    public void run() 
    { 
    	synchronized (this) 
    	{
			for(int i=1;i<=10;i++) {
				total=total+200;
            }
			System.out.println("sent the notification");
			this.notify();
		}
    	
    }
    public static void main(String[] args) throws InterruptedException {
    	Sample s=new Sample();
    	s.start();
    	
    	synchronized (s) {
    		System.out.println("Waiting for notification");
			s.wait();
			System.out.println("Main thread got notification");
			System.out.println(s.total);
		}
	}
}
