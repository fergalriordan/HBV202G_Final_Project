package is.hi.ftr2.hbv202g.ass8;

public class UserTypeSelection {
    public static void main(String[] args) {
        System.out.println("\n  Welcome, User!\n");
        System.out.println("\nSelect an option:");
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
        // code to check faculty credentials (name + password) goes here
        return true;
    }

    public static Boolean checkStudent(){
        // code to check student credentials (name + password + feePaid) goes here
        return true;
    }
}