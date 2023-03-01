package Bootcamp;

//Task 3
//Create a class "BankAccount" with property "balance"
public class BankAccount{
    public static void main(String[] args) {
        BankAccount defaultAccount = new BankAccount(10.0);
        BankAccount Account2 = new BankAccount(2.5);
        defaultAccount.withdraw(1.0);
        defaultAccount.deposit(20.0);
        defaultAccount.transferBalance(defaultAccount, Account2,0.7);
        defaultAccount.printBalance();
    }

    private double balance; //the balance in the account; must be private
    private String person;

    //create empty default constructor for it
    public BankAccount(String person, double balance)
    {
    }

    //create a constructor with parameter for setting balance.
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    //create a method "deposit" with one parameter "amount" (decimal number)
    //which allows the user to increase the balance.
    public void deposit(double amount) {
        if (amount > 0.0) // if the amount is valid
            balance = balance + amount;
    }

    //create a method "withdraw" with one parameter "amount" (decimal number)
    //which allows the user to decrease the balance.
    public void withdraw(double amount){
        if ((balance >= amount) && (amount > 0.0))  // if the amount is valid
            balance = balance - amount;
        }
    
    //method for transfer balance from one bank account to another.
    public void transferBalance(BankAccount from, BankAccount to, double amount) {
            from.withdraw(amount);
            to.deposit(amount);
        }

    //create a method "printBalance" which displays the current balance to user.
        public double printBalance() {
        System.out.printf("Current balance is:" + balance);
        return balance;
    }
}