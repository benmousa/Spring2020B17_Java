package Day33_CustomClass_Info;

public class BankAccount {
    /*
    create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
     */
    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){

        System.out.println("Your avalible balance is: "+balance);
    }

    public void withDraw(double amount){
        if ( amount > balance){

            balance-= amount + 35;
            System.out.println("You charged OverDraft fee, your balance is: $"+balance);
        }
        if ( amount < balance){
            System.out.println("Withdrwaing $"+balance);
            balance -= amount;
        }
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;

    }

    public void setBankInfo (String Holder, long accNumber, double accountBalance){
        accountHolder = Holder;
        accountNumber = accountNumber;
        balance = accountBalance;
    }
}
