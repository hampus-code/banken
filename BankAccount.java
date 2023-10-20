import java.util.Scanner;

public class BankAccount {

    private int accountNumber;
    private double balance;

    private Scanner scanner = new Scanner(System.in);

    public BankAccount (int accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;

    }


    public void depositMoney(double amount){ //Metod för att sätta in pengar

        setBalance(getBalance() + amount);
        System.out.println("Insättning lyckades, du satte in " + amount + " Kr");

    }

    public void withdrawMoney(double amount){ //Metod för att ta ut pengar

        if (getBalance() > 0) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Uttag av " + amount + " Kr lyckades");
        } else {
            System.out.println("Det finns inte tillräckligt mycket tillgångar. Uttag misslyckades.");
        }
    }
        else {
            System.out.println("Uttagsmängden måste vara större än 0.");
        }
        
    }
    

    public void displayAccountInfo(){ //Metod för att visa saldo

        System.out.println("Nuvarande saldo: " + balance + " Kr");

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
