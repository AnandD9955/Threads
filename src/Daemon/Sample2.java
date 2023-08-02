package Daemon;

public class Sample2 extends Thread{
   
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
			System.out.println("User Thread");
		}
	}
	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.setDaemon(true);
		s.start();
	}
}
