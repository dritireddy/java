interface animal{
	void eat();
}
class dog implements animal{
	public void eat(){
		System.out.println("dog eats");
	}
	void bark(){
		System.out.println("dog barks");

	}
}
public class singleinhdemo{
	public static void main(String[] args){
		dog d= new dog();
		d.eat();
		d.bark();
}

}