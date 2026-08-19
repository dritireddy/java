abstract class account {
	 double balance;
	 account(double balance) { 
		this.balance = balance; 
	}
 	abstract double calculateInterest();
}
class SavingsAccount extends account {
 	SavingsAccount(double balance){ 
		super(balance); 
	}

 	double calculateInterest() { return balance * 0.04; }
}
class FixedDepositAccount extends account {
 	FixedDepositAccount(double balance) {
 	super(balance); 
}

 double calculateInterest() { return balance * 0.07; }
}
public class Test1 {
 	public static void main(String[] args) {
 		account[] accounts = { new SavingsAccount(10000), new FixedDepositAccount(10000) };
		for (account a : accounts) {
		System.out.println("Interest: " + a.calculateInterest());
 }
 }
}