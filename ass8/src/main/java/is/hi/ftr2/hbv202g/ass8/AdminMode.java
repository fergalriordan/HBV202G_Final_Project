package is.hi.ftr2.hbv202g.ass8;

public class AdminMode {
    public static void main( String[] args, LibrarySystem system ) {
        System.out.println("\n  ~~ ADMINISTRATOR MODE ~~\n");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("    1. Add Book");
            System.out.println("    2. Add Omnibus");
            System.out.println("    3. Edit Book/Omnibus");
            System.out.println("    4. Remove Book/Omnibus");
            System.out.println("    5. Search for a User");
            System.out.println("    6. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt( System.console().readLine() );

            switch (choice) {
                case 1:
                    system.adminAddBook();
                    break;
                case 2:
                    system.addOmnibus();
                    break;
                case 3:
                    system.editComponent();
                    break;
                case 4:
                    system.removeComponent();
                    break;
                case 5:
                    try {
                        system.findUser();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("\n******************************************************\n");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}