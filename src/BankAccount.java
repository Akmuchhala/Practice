package src;

public class BankAccount {
    public static double balance = 1000;
    public void deposit(int amount){
        this.balance=this.balance+amount;
        System.out.println("amount deposited "+amount);
    }
    public void withdraw(int amount){
        this.balance=this.balance-amount;
        System.out.println("amount withdrawn "+ amount );
    }
    public void getbalance(){
        System.out.println("current balance = "+balance);
    }
}
