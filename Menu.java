import java.util.Scanner;

public class Menu {

    Register bankAccount = new Register();
    Scanner scanner = new Scanner(System.in);
    boolean runTheMenu = true;
    int userChoice;

    public Menu(){

        runMenu();

    }


    public void runMenu(){

        do{
            System.out.println("****HUVUDMENY****");
            System.out.println("1. Skapa konto");
            System.out.println("2. Administrera konto");
            System.out.println("3. Avsluta");
            userChoice = scanner.nextInt();

            switch (userChoice) {

                case 1:

                bankAccount.createAccount();
                break;
            
                case 2:


                break;

                case 3:

                System.out.println("Programmet avslutas");
                runTheMenu = false;
                break;

                default:

                System.out.println("Ditt val finns inte, du skickas tillbaka till menyn igen.");
                break;
            }


        }while (runTheMenu);
        

    }
    
}
