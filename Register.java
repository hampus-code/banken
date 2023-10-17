import java.util.ArrayList;
import java.util.Scanner;

public class Register {

    int accountNumber;
    Scanner scanner = new Scanner(System.in);
    ArrayList<BankAccount> accountList = new ArrayList<>();
    


    public void createAccount(){

        System.out.print("Ange kontonummer: ");
        int userInputAccountNumber = scanner.nextInt();

        accountList.add(new BankAccount(userInputAccountNumber));
        
        for (int i = 0; i < accountList.size(); i++) {
            if (i == userInputAccountNumber) {
                System.out.println("Detta konto finns redan");
            }
            else
            System.out.println("Kontot har skapats");
            

            
        }


    }
    
}
