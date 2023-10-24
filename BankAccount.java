public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount (int accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;

    }


    public void depositMoney(double amount){

        setBalance(getBalance() + amount);
        System.out.println("Insättning lyckades, du satte in " + amount + " Kr");

    }

    public void withdrawMoney(double amount){

        if (getBalance() > 0) {//Felmeddelande ifall man tar ut pengar och saldot är 0 kr eller mindre.

        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);

            System.out.println("Uttag av " + amount + " Kr lyckades");

        } else {
            System.out.println("Det finns inte tillräckligt mycket tillgångar. Uttag misslyckades.");
        }
    }
        else {
            System.out.println("Uttagsmängden måste vara större än 0 kr.");
        }
        
    }
    

    public void displayAccountInfo(){

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
