package isAlive_Method;

public class Sample extends Thread{
   public void run() {
	   for(int i=1;i<4;i++) {
		   System.out.println("user thread");
	   }
   }
   public static void main(String[] args) {
	   Sample s=new Sample();
	   System.out.println(s.isAlive());
	   s.start();
	   System.out.println(s.isAlive());
   }
}
