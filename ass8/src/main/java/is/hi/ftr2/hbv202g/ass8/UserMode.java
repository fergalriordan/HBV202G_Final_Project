package is.hi.ftr2.hbv202g.ass8;

public class UserMode {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("    1. New Lending");
            System.out.println("    2. Return Lending");
            System.out.println("    3. Request Extension");
            System.out.println("    4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt( System.console().readLine() );

            switch (choice) {
                case 1:
                    newLending();
                    break;
                case 2:
                    returnLending();
                    break;
                case 3:
                    requestExtension();
                    break;
                case 4:
                    System.out.println("\n******************************************************\n");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void newLending() {
        System.out.println("Service not yet implemented.");  
    }

    public static void returnLending() {
        System.out.println("Service not yet implemented.");  
    }

    public static void requestExtension() { 
        System.out.println("Service not yet implemented.");  
    }
}

