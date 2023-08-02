package Implements_RunnableInterface;

public class Demo implements Runnable {
	@Override
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.print("  "+i);
		}
	}
	
	public static void main(String[] args) {
		Demo s=new Demo();
		Thread th=new Thread(s);
		th.start();
	}

}
