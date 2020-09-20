package apollo.exercises.ch06_classes;

public class BankRunner {

	public static void main(String[] args) {
		
	BankAccount b1=new BankAccount("mithu",200.00);	
		
	b1.deposit(30);
	b1.withdraw(50);
	b1.printBalance();

	}
	

}
