package JavaMoodle18.Polymorphism.BankManager;

public class SavingsAccount extends BankAccount {
    double interest_rate;

    public SavingsAccount(){

    }

    public  SavingsAccount(double balance, double interest_rate){
        super(balance);
        this.interest_rate = interest_rate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interest_rate=" + interest_rate +
                ", balance=" + balance +
                '}';
    }

    public double calculateInterest(){
        return (getBalance()*interest_rate)/100;
    }
}
