package is.hi.ftr2.hbv202g.ass8;

// FOR END OF TERM PROJECT: 
// Update this main to inlcude a front-end for the library system.

public class LibraryInterface 
{
    public static void main( String[] args )
    {
        System.out.println( "******************************************************" );
        System.out.println( "       HASKOLI ISLANDS ONLINE LIBRARY");

        System.out.println("\nSelect an option.");
        System.out.println("    1. Admin Mode.");
        System.out.println("    2. User Mode.\n");
        System.out.print("\nEnter your choice: ");
    
        int choice = Integer.parseInt( System.console().readLine() );
        switch( choice )
        {
            case 1:
                if (checkAdmin()) {
                    System.out.println( "Administrator credentials verified." );
                    System.out.println( "\n******************************************************" );
                    AdminMode.main( args );
                }
                else {
                    System.out.println("Invalid administrator credentials.");
                }
                break;
            case 2:
                System.out.println( "\n******************************************************" );
                UserTypeSelection.main( args );
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
