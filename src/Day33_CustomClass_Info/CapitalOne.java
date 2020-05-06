package Day33_CustomClass_Info;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Maisoon = new BankAccount();
        Maisoon.setBankInfo("Maisoon", 123321, 25500);
        Maisoon.checkingBalance();
        Maisoon.deposit(500);
        Maisoon.checkingBalance();
        Maisoon.withDraw(24357.00);
        Maisoon.checkingBalance();
        Maisoon.withDraw(1700);
       // Maisoon.checkingBalance();

        BankAccount Mohammed = new BankAccount();
        Mohammed.setBankInfo("Mohammed", 567765, 650);
    }
}
