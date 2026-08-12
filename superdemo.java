class animal{
	int x=100;
	void sound(){
	System.out.println("animal makes sound");
	}
}
class dog extends animal{
	int x=200;
	void sound() {
        	System.out.println("dog barks");
	    }
	void display(){
		System.out.println("parent x= "+super.x);
		System.out.println("child x= "+x);
		super.sound();	
		sound();
	}
}
public class superdemo{
	public static void main(String[] args){
		dog d= new dog();
		d.display();
		
}
}