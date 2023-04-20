package is.hi.ftr2.hbv202g.ass8;

import java.util.Scanner;

public class UserTypeSelection {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Haskoli Islands Digital Library System!\n");
        System.out.println("Select an option:");
            System.out.println("    1. Faculty");
            System.out.println("    2. Student");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt( System.console().readLine() );

            switch (choice) {
                case 1:
                    if (checkFaculty()) {
                        System.out.println( "\n******************************************************" );
                        UserMode.main( args );
                    }
                    else {
                        System.out.println("Invalid faculty credentials.");
                    }
                    break;
                case 2:
                    if (checkStudent()) {
                        System.out.println( "\n******************************************************" );
                        UserMode.main( args );
                    }
                    else {
                        System.out.println("Invalid student credentials.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    }


    public static Boolean checkFaculty(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        // check if username and password are valid...

        return true;
    }

    public static Boolean checkStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // check if username and password are valid...

        // ALSO CHECK IF FEES HAVE BEEN PAID
        
        return true;
    }
}