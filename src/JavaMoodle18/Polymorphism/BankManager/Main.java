package JavaMoodle18.Polymorphism.BankManager;

public class Main {

    public static void main(String args[]){
        SavingsAccount sa = new SavingsAccount(42000, 6.5);
        System.out.println(sa.calculateInterest());
        sa.credit(sa.calculateInterest());
        System.out.println(sa);
        BankAccount b = new CurrentAccount(30000, 10);
        b.debit(31500);
        System.out.println(b);

    }
}
