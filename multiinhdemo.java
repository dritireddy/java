interface animal{
	void sound();
}
class dog implements animal{
	public void sound(){
		System.out.println("animal makes sound");
	}
	void bark(){
		System.out.println("dog barks");

	}
}
class puppy extends dog{
	void weep(){
		System.out.println("puppy weeps");

	}
}
public class multiinhdemo{
	public static void main(String[] args){
		puppy p= new puppy();
		p.sound();
		p.bark();
		p.weep();
}

}