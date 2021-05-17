import java.util.Random;
import java.util.ArrayList;

public class BankAccount {
    protected String accountNumber;
    protected double checkingBalance;
    protected double savingsBalance;

    public static int totalAccount = 0;
    public static double totalMoney = 0;

    public static void main(String[] args) {
        System.out.println(newAccountNumber());

    }

    private static String newAccountNumber() {
        Random r = new Random();
        String random = "";
        for (int i = 0; i < 10; i++) {
            random += r.nextInt(10);

        }
        return random;
    }

    public BankAccount() {
        accountNumber = newAccountNumber();
        BankAccount.totalAccount++;

    }

    public double getCheckingBalance() {
        return this.checkingBalance;

    }

    public double getSavingBalance() {
        return this.savingsBalance;

    }

    public void deposit(String account, double amountToDeposit) {
        if (account.equals("checking"))
            this.checkingBalance += amountToDeposit;
        else if (account.equals("saving"))
            this.savingsBalance += amountToDeposit;

        BankAccount.totalMoney += amountToDeposit;

    }

    public void withdrawal(String account, double amountToWd) {
        if (account.equals("checking"))
            if (this.savingsBalance - amountToWd > 0)
                this.checkingBalance -= amountToDeposit;
            else
                System.out.println("Insufficient Funds");
        else if (account.equals("saving"))
            if (this.checkingBalance - amountToWd > 0)
                this.savingsBalance -= amountToDeposit;
            else
                System.out.println("Insufficient Funds");

        BankAccount.totalMoney -= amountToWd;

    }

    public void totalBalance() {

        System.out.println(
                "Total Checking Balance: " + this.checkingBalance + " Total Saving Balance: " + this.savingsBalance);

    }

}
