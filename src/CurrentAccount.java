package src;

public class CurrentAccount extends BankAccount{
    private int interst = 2;
    public void interest(){
        System.out.println("annual income in Current account ="+(balance*interst*1));
    }
}
