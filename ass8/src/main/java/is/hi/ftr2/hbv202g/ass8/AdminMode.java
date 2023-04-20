package is.hi.ftr2.hbv202g.ass8;

public class AdminMode {
    public static void main( String[] args ) {
        System.out.println("\n  ~~ ADMINISTRATOR MODE ~~\n");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("    1. Add Book");
            System.out.println("    2. Add Omnibus");
            System.out.println("    3. Edit Book/Omnibus");
            System.out.println("    4. Remove Book/Omnibus");
            System.out.println("    5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt( System.console().readLine() );

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addOmnibus();
                    break;
                case 3:
                    editComponent();
                    break;
                case 4:
                    removeComponent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addBook() {
    }

    public static void addOmnibus() {
    }

    public static void editComponent() {        
    }

    public static void removeComponent() {        
    }   

}