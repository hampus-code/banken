import java.util.ArrayList;
import java.util.Scanner;

public class RegisterAccount {

    private int checkUserInputAccountNumber;
    private boolean accountExists;
    private boolean runSecondMenu;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<BankAccount> accountList = new ArrayList<>();
    
    public void createAccount(){

        
        System.out.print("Ange kontonummer> ");
        int userInputAccountNumber = scanner.nextInt();

        accountExists = false;

        
         for (BankAccount checkAccount : accountList) {
            if (userInputAccountNumber == checkAccount.getAccountNumber()) {
                accountExists = true;
                break;
                
            }
            
            
         }
         //Ifall kontot inte finns så skapas det
         if (!accountExists){
            accountList.add(new BankAccount(userInputAccountNumber, 0));
            System.out.println("Kontot skapades");
            accountExists = false;
         }
            else{
            System.out.println("Kontot existerar redan");
            accountExists = false;
         }
        
    }
    
    
    public void administrateAccount(){

        System.out.print("Ange kontonummer> ");
        checkUserInputAccountNumber = scanner.nextInt();

        runSecondMenu = true;
        accountExists = false;
        

         for (BankAccount checkAccount : accountList) {
            if (checkUserInputAccountNumber == checkAccount.getAccountNumber()) {
                System.out.println("Kontot du har angett existerar, du får följande val: ");
                accountExists = true;

                do{
                    System.out.println("****KONTOMENY**** - konto: " + checkUserInputAccountNumber);
                    System.out.println("1. Ta ut pengar");
                    System.out.println("2. Sätt in pengar");
                    System.out.println("3. Visa saldo");
                    System.out.println("4. Avsluta");
                    System.out.print("Ange menyval> ");
                    int secondMenuChoice = scanner.nextInt();
        
                    switch (secondMenuChoice) {
        
                        case 1:

                        System.out.print("Ange hur mycket du vill ta ut> ");
                        int userInputWithdraw = scanner.nextInt();
                        checkAccount.withdrawMoney(userInputWithdraw);
                        break;
                    
                        case 2:

                        System.out.print("Ange hur mycket du vill sätta in> ");
                        int userInputDeposit = scanner.nextInt();
                        checkAccount.depositMoney(userInputDeposit);
                        break;

                        case 3:

                        checkAccount.displayAccountInfo(); 
                        break;
        
                        case 4:
        
                        System.out.println("Kontomenyn avslutas, du skickas tillbaka till huvudmenyn.");
                        runSecondMenu = false; //Avslutar menyn
                        break;
        
                        default:
        
                        System.out.println("Ditt val finns inte, du skickas tillbaka till kontomenyn igen.");
                        break; //Om användaren anger nåt som inte finns som menyval så visas ett felmeddelande
                    }
        
        
                }while (runSecondMenu);
            }
            
         }
         if (!accountExists) //Om kontot inte finns så kommer man tillbaka till kontomenyn igen
            System.out.println("Konto existerar inte, försök igen");

    }
    
}
