class emp{
	String name;
	double s;
	emp(String n, double sa){
		name=n;
		s=sa;
	}
	double calcsal(){
	return s;
	}
}
class Manager extends emp {
 	double bonus;
 	Manager(String name, double s, double bonus) {
 		super(name, s);
 		this.bonus = bonus;
 	}

	double calcsal() { 
	return (super.calcsal() + bonus); 
	}
}
class seniormanager extends Manager {
	 double car;
 	seniormanager(String name, double s, double bonus, double car) {
 	super(name, s, bonus);
 	this.car = car;
 	}

 	double calcsal() { 
	return super.calcsal() + car; 
	}
}
public class Test {
 public static void main(String[] args) {
 emp e = new seniormanager("Driti", 100, 20, 50);
 System.out.println(e.name + "'s Salary: " + e.calcsal());
 }
}
