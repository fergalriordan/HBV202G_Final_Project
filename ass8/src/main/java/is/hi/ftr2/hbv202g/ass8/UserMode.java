package is.hi.ftr2.hbv202g.ass8;

import java.util.Scanner;

public class UserMode {
    public static void main(String[] args, LibrarySystem system) {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("    1. Borrow a book");
            System.out.println("    2. Return a book");
            System.out.println("    3. Request an extension on a current lending");
            System.out.println("    4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt( System.console().readLine() );
            String bookName = "";
            Scanner scanner = new Scanner(System.in);

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the book you wish to borrow: ");
                    bookName = scanner.nextLine();
                    system.borrowBook(null, null);
                    break;
                case 2:
                    System.out.println("Enter the name of the book you wish to return: ");
                    bookName = scanner.nextLine();
                    system.returnBook(null, null);
                    break;
                case 3:
                    System.out.println("Enter the name of the book you wish to extend: ");
                    bookName = scanner.nextLine();
                    system.extendLending(null, null, null);
                    break;
                case 4:
                    System.out.println("\n******************************************************\n");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

