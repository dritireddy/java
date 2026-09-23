class Threadd extends Thread{
	public void run(){
		try{
			System.out.println("Thread is running");
			Thread.sleep(5000);
			System.out.println("Thread completed execution");
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
public class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		Threadd t=new Threadd();
		System.out.println("state:"+t.getState());
		t.start();
		System.out.println("after start"+t.getState());
		Thread.sleep(500);
		System.out.println("while sleeping:"+t.getState());	
		t.join();
		System.out.println("after completion:"+t.getState());
	}	
}