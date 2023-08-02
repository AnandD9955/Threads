package Extending_ThreadClass;

public class Sample extends Thread {
	
	public void run() {
		System.out.println("hello!!!!!");
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.start();
		
	}

}
