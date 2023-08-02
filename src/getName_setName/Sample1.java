package getName_setName;

public class Sample1 extends Thread{
	public void run() {
		Thread.currentThread().setName("Amar");
		System.out.println("get Sample1 Thread:"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("executing starts from this Thread:"+Thread.currentThread().getName());
		
		Sample1 s=new Sample1();
		//s.setName("Anand");
		s.start();
		
//		Sample1 s1=new Sample1();
//		s1.setName("Akash");
//		s1.start();
		
	}

}
