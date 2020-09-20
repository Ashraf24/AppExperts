package apollo.exercises.ch06_classes;

public class BankAccount {

	double initialBalance;
	
	private double balance;
	
	String user;
	
	
	public BankAccount(String n,double b) {
	
		this.user=n;
	this.initialBalance=b;
	}
	
	public void deposit(double amount) {
		this.balance=initialBalance+amount;
		
	} 
	public void withdraw(double amount) {
		
		this.balance=balance-amount;
	}
	   
	
	public void printBalance()
	{
		
	System.out.print(balance);	
		
	}
	
	
	
	
	
}
