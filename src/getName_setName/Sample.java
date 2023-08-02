package getName_setName;

public class Sample extends Thread{
	public void run() {
		System.out.println("Sample Thread:"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("executing starts from this Thread:"+Thread.currentThread().getName());
		
		Sample s=new Sample();
		s.setName("Anand");
		s.start();
		
		Sample s1=new Sample();
		s1.setName("Akash");
		s1.start();
		
	}

}
