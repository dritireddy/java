class student{
	int rno;
	String name;
	static String cname="CBIT";
	student(int r, String n){
		rno=r;
		name=n;	
	}
	void display(){
		System.out.println(rno+"----"+name+"----"+cname);
	}
	static int results()
	{	
		System.out.println("results released");
		int i=10;
		return i;

	}
}
class staticdemo{
	public static void main(String[] args)
		{
			student s1=new student(104,"sharon");
			student s2=new student(999,"driti");
			s1.display();
			s2.display();
			System.out.println(student.results());

		}
}