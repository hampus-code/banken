public class BankAccount {

    protected int accountNumber;
    protected double balance;

    public BankAccount (int accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void  MenuAccount(){
        
    }

    public void depositMoney(double amount){

    }

    public void withdrawMoney(double amount){

    }

    public void displayAccountInfo(){

    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    
}
