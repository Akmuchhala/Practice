package src;

public class SavingAccount extends BankAccount{
    private int interst = 6;
    public void interest(){
        System.out.println("annual income in saving account per year ="+(balance*interst*1));
    }
}
