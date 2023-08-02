package Daemon;

public class Sample extends Thread{
   
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
			System.out.println("User Thread");
		}
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.setDaemon(false);
		s.start();
	}
}
