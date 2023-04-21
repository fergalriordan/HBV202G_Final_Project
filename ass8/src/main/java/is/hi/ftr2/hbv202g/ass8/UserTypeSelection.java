package is.hi.ftr2.hbv202g.ass8;

public class UserTypeSelection {
    public static void main(String[] args, LibrarySystem system) {
        System.out.println("\nWelcome to the Haskoli Islands Digital Library System!\n");
        System.out.println("Select an option:");
            System.out.println("    1. Faculty");
            System.out.println("    2. Student");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt( System.console().readLine() );

            switch (choice) {
                case 1:
                    if (system.checkFaculty()) {
                        System.out.println( "\n******************************************************" );
                        UserMode.main( args, system );
                    }
                    else {
                        System.out.println("Invalid faculty credentials.");
                        System.out.println("Access granted anyway as this is just a sample solution.");
                        System.out.println( "\n******************************************************" );
                        UserMode.main( args, system );
                    }
                    break;
                case 2:
                    if (system.checkStudent()) {
                        System.out.println( "\n******************************************************" );
                        UserMode.main( args, system );
                    }
                    else {
                        System.out.println("Invalid student credentials.");
                        System.out.println("Access granted anyway as this is just a sample solution.");
                        System.out.println( "\n******************************************************" );
                        UserMode.main( args, system );
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
    }
}