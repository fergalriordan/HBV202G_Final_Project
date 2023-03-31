package is.hi.ftr2.hbv202g.ass8;

// FOR END OF TERM PROJECT: 
// Update this main to inlcude a front-end for the library system.

public class LibraryInterface 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter 1 for admin, 2 for user:" );
        // read in choice from user
        int choice = Integer.parseInt( System.console().readLine() );
        // switch on choice
        switch( choice )
        {
            case 1:
                AdminMode.main( args );
                break;
            case 2:
                UserMode.main( args );
                break;
            default:
                System.out.println( "Invalid choice" );
                break;
        }
    }
}
