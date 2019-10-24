package JavaMoodle18.Polymorphism.BankManager;

public class CheckingAccount extends BankAccount {
    double fee_per_transaction;

    public CheckingAccount(){

    }

    public  CheckingAccount(double balance, double fee_per_transaction){
        super(balance);
        this.fee_per_transaction = fee_per_transaction;
    }

    public boolean debit(double amount){
        if(super.debit(amount)) {
            subtractFee();
            return true;
        }
        return false;
    }

    public void credit(double amount){
        super.credit(amount);
        subtractFee();
    }

    private void subtractFee(){
        if (getBalance() >= fee_per_transaction){
            balance -= fee_per_transaction;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "fee_per_transaction=" + fee_per_transaction +
                ", balance=" + balance +
                '}';
    }
}
