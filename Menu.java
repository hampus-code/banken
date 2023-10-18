import java.util.Scanner;

public class Menu {

    RegisterAccount bankAccount = new RegisterAccount();
    Scanner scanner = new Scanner(System.in);
    boolean runTheMenu = true;
    int menuChoice;

    public Menu(){

        runMenu();

    }


    public void runMenu(){

        do{
            System.out.println("****HUVUDMENY****");
            System.out.println("1. Skapa konto");
            System.out.println("2. Administrera konto");
            System.out.println("3. Avsluta");
            System.out.print("Ange menyval: ");
            menuChoice = scanner.nextInt();

            switch (menuChoice) {

                case 1:

                bankAccount.createAccount();
                break;
            
                case 2:

                bankAccount.administrateAccount();
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
