import java.util.Scanner;

public class BankAccount {

     int accountNumber;
     double balance;

     Scanner scanner = new Scanner(System.in);

    public BankAccount (int accountNumber){

        this.accountNumber = accountNumber;

    }


    public void depositMoney(double amount){

        setBalance(getBalance() + amount);
        System.out.println("Insättning lyckades, nuvarande saldo är: " + getBalance());

    }

    public void withdrawMoney(double amount){

        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Uttag av " + amount + " lyckades. Nuvarande saldo: " + getBalance());
        } else {
            System.out.println("Det finns inga tillgångar. Uttag misslyckades.");
        }

    }

    public void displayAccountInfo(){

        System.out.println("Nuvarande saldo: " + balance);

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
