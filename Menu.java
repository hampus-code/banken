import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private boolean runTheMenu = true;
    private int choice;

    public Menu(){

        runMenu();

    }


    public void runMenu(){

        do{
            System.out.println("****HUVUDMENY****");
            System.out.println("1. Skapa konto");
            System.out.println("2. Administrera konto");
            System.out.println("3. Avsluta");
            choice = scanner.nextInt();

            if(choice == 3){
                System.out.println("Programmet avslutas");
                runTheMenu = false;
            }



        }while (runTheMenu);
        

    }
    
}
