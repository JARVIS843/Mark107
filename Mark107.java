
public class Mark107 {
String name;
double balance;
double transactionFee;
public Mark107(String n) {
	name=n;
}
public double deposit(double amount) {
	balance=balance+amount;
	System.out.println("You still have "+balance+" "+name);
	return balance;
	
}
public double withdraw (double amount) {
	
	balance=balance-amount;
	transactionFee=0.1*amount;
	if(balance-transactionFee>=0) {
		balance=balance-transactionFee;
		System.out.println("Withdraw success "+balance);
		return balance;
	}
	else {
		System.out.println("You don't have enough money to pay for TF");
		return balance+amount;
	}
	
}
public String toString() {
	return name+", "+"$"+balance;
}
public void transfer(Mark107 account,double m) {
	withdraw(m+5);
	account.deposit(m);
	
}

}
