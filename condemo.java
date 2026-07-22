class democon{
	democon(){
		System.out.println("calling constructor");
		}
	democon(String p){
		System.out.println("param constructor "+p);
		}
}
public class condemo{
	public static void main(String args[])
		{
			democon obj= new democon();
			democon obj1= new democon("CBIT");
		}
}