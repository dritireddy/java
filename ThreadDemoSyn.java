class Counter{
	private int count=0;
	synchronized void increment(){
		count++;
	}
	int getCount(){
		return count;
	}
}
class Threadd extends Thread{
	Counter counter;
	Threadd(Counter counter){
	this.counter=counter;
	}
		public void run(){
			for(int i=1;i<=50;i++){
				counter.increment();
			}
		}
	}
class ThreadDemoSyn{
	public static void main(String args[]) throws InterruptedException{
		Counter counter= new Counter();
		Threadd t1= new Threadd(counter);
		Threadd t2= new Threadd(counter);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("counter="+counter.getCount());
	}
}