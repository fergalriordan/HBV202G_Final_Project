package is.hi.ftr2.hbv202g.ass8;

public class LibraryInterface 
{
    public static void main( String[] args )
    {
        LibrarySystem libSys = new LibrarySystem();

        System.out.println( "******************************************************" );
        System.out.println( "       HASKOLI ISLANDS LIBRARY SYSTEM\n");

        System.out.println("Select an option.");
        System.out.println("    1. Admin Mode.");
        System.out.println("    2. User Mode.\n");
        System.out.print("Enter your choice: ");
    
        int choice = Integer.parseInt( System.console().readLine() );
        switch( choice )
        {
            case 1:
                if (checkAdmin()) {
                    System.out.println( "Administrator credentials verified." );
                    System.out.println( "\n******************************************************" );
                    // start admin mode with the library system object
                    AdminMode.main( args, libSys );
                }
                else {
                    System.out.println("Invalid administrator credentials.");
                }
                break;
            case 2:
                System.out.println( "\n******************************************************" );
                UserTypeSelection.main( args, libSys );
                break;
            default:
                System.out.println( "Invalid choice." );
                break;
        } 
    }

    public static Boolean checkAdmin(){
        // code to check admin credentials goes here
        return true;
    }
}
