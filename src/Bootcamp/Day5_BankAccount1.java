//Task 4
public class BankAccount1 {
    public static void main(String[] args) {
        BankAccount1 Account1 = new BankAccount1(10.0);
        BankAccount1 Account2 = new BankAccount1(2.5);
        Account1.withdraw(600.0);
        Account1.deposit(10000.0);
        Account1.transferBalance(Account1, Account2,37);
        Account1.printBalance();
    }
    private double balance; //the balance in the account; must be private
    private String person;
    //create empty default constructor for it
    public BankAccount1(String person, double balance)
    {
    }
    public BankAccount1(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 5000.0) { // if the amount is valid
            balance = balance + amount;
        } else {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if ((balance >= amount) && (amount > 0.0)) { // if the amount is valid
            balance = balance - amount;
        } else {
            System.out.println("There is not enough funds");
        }
    }

    public void transferBalance(BankAccount1 from, BankAccount1 to, double amount) {
        if (amount <= balance) {
            from.withdraw(amount);
            to.deposit(amount);
        }
        else {
            System.out.println("Transfer canceled. You are trying to transfer $" + amount + ", but only $" + balance + " are available.");
        }
    }

    public double printBalance() {
        System.out.printf("Current balance is:" + balance);
        return balance;
    }
}