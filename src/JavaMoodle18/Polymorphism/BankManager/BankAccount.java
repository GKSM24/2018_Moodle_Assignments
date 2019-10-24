package JavaMoodle18.Polymorphism.BankManager;

public class BankAccount {
    //private String accountNumber;
    double balance;

    public BankAccount(){
    }

    public BankAccount(double balance){
        if(balance >= 0) {
            this.balance = balance;
        }
        else{
            System.out.println("The given balance is invalid the balance is set to 0");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }


    public String toString() {
        return "BankAccount{" +
                ", balance=" + balance +
                '}';
    }

    public boolean debit(double amount){
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        else {
            System.out.println("Debit amount exceeded account balance.");
            return false;
        }
    }

    public void credit(double amount){
        balance += amount;
    }
}