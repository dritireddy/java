interface animal{
	void sound();
}
class dog implements animal{
	public void sound(){
		System.out.println("dog makes sound");
	}
	void bark(){
		System.out.println("dog barks");

	}
}
class cat implements animal{
	public void sound(){
		System.out.println("cat makes sound");
	}
	void meow(){
		System.out.println("cat meows");

	}
}
public class hierinhdemo{
	public static void main(String[] args){
		dog d= new dog();
		d.sound();
		d.bark();
		cat c=new cat();
		c.sound();
		c.meow();
	
}

}