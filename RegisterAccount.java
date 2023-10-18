import java.util.ArrayList;
import java.util.Scanner;

public class RegisterAccount {

    BankAccount adminAccount = new BankAccount(0);
    int accountNumber;
    int checkUserInputAccountNumber;
    boolean accountExists = false;
    boolean runSecondMenu = true;
    Scanner scanner = new Scanner(System.in);


    ArrayList<BankAccount> accountList = new ArrayList<>();
    


    public void createAccount(){


        System.out.print("Ange kontonummer: ");
        int userInputAccountNumber = scanner.nextInt();

        
         for (BankAccount checkAccounts : accountList) { //Denna funkar just nu inte som den ska, kan fortfarande skapa konto även om det finns
            if (checkUserInputAccountNumber == checkAccounts.getAccountNumber()) {
                accountExists = true;
                break;
                
            }
            
         }
         if (!accountExists){
            System.out.println("Kontot skapades");
            accountExists = true;
         }
         else if(accountExists){
            accountList.add(new BankAccount(userInputAccountNumber));
            System.out.println("Kontot existerar redan");
            accountExists = false;
         }

            
        
    }

    public void administrateAccount(){

        System.out.println("Ange kontonummer: ");
        checkUserInputAccountNumber = scanner.nextInt();
        

         for (BankAccount checkAccounts : accountList) {
            if (checkUserInputAccountNumber == checkAccounts.getAccountNumber()) {
                System.out.println("Kontot du har angett existerar, du får följande val: ");
                accountExists = true;

                do{ //Menyn funkar inte som den ska än, testa att lägga hela AdministrateAccount i en ny fil/klass.
                    System.out.println("****KONTOMENY**** - konto: " + checkUserInputAccountNumber);
                    System.out.println("1. Ta ut pengar");
                    System.out.println("2. Sätt in pengar");
                    System.out.println("3. Visa saldo");
                    System.out.println("4. Avsluta");
                    int secondMenuChoice = scanner.nextInt();
        
                    switch (secondMenuChoice) {
        
                        case 1:
                        System.out.println("Ange hur mycket du vill ta ut: ");
                        int userInputWithdraw = scanner.nextInt();
                        adminAccount.withdrawMoney(userInputWithdraw);
                        break;
                    
                        case 2:
                        System.out.println("Ange hur mycket du vill sätta in: ");
                        int userInputDeposit = scanner.nextInt();
                        adminAccount.depositMoney(userInputDeposit);
                        break;

                        case 3:

                        adminAccount.displayAccountInfo();
                        break;
        
                        case 4:
        
                        System.out.println("Menyn avslutas, du skickas tillbaka till huvudmenyn.");
                        runSecondMenu = false;
                        break;
        
                        default:
        
                        System.out.println("Ditt val finns inte, du skickas tillbaka till menyn igen.");
                        break;
                    }
        
        
                }while (runSecondMenu);
            }
            
         }
         if (!accountExists)
            System.out.println("Konto existerar inte, försök igen");

    }
    
}
