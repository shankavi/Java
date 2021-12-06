package learn.java;

//import java.lang.*;
public class BankAccount {
	
	//long accountNumber; -primitive data type
	
	Long accountNum = 1234567000; // wrapper class // l mention as long data type
	
	String holderName = "T Shankavi";
	
	 //int accountBalance; -primitive data type
	Integer accBalance = 1000; // wrapper class
	
	
	public void getBalance() {
		System.out.println("Account Balance is :" + accBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object systex is 
		// ClassName objName = new ClassName();
		BankAccount account = new BankAccount();
		account.getBalance();
	}

}
