class Box<T>{
	private T val;
	void setvalue(T val){
	this.val=val;
	}
	T getval(){ return val; 
	}
}
class GenDemo{
	public static<T> void display(T val){
		        System.out.println("Value="+val);

	}
	public static void main(String[] args){
		Box<String> sbox= new Box<>();
		sbox.setvalue("java");
		Box<Integer> ibox= new Box<>();
		ibox.setvalue(10);
		System.out.println("int val="+ibox.getval());
		System.out.println("string val="+sbox.getval());
		display(100);
		display("hiiiiiiiiiiiiii");	
	}
}