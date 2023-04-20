package is.hi.ftr2.hbv202g.ass8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println("\n******************************************************\n");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book to be added: ");
        String title = scanner.nextLine();
    
        System.out.print("Enter the number of authors: ");
        int numAuthors = Integer.parseInt(scanner.nextLine());
    
        List<Author> authors = new ArrayList<>();
    
        for (int i = 0; i < numAuthors; i++) {
            System.out.print("Author " + (i + 1) + ": ");
            String authorName = scanner.nextLine();
            authors.add(new Author(authorName));
        }
    
        try {
            Book book = new Book(title, authors);
            // code to upload the new book to the library system goes here
            System.out.println("\nNew book added to library system:");
            book.displayInfo();
        } catch (EmptyAuthorListException e) {
            System.out.println(e.getMessage());
        }
    

    }

    public static void addOmnibus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the omnibus to be added: ");
        String title = scanner.nextLine();

        BookComposite omnibus = new BookComposite(title);

        while (true) {
            System.out.print("Add a book to this omnibus? (y/n) ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("y")) {
                System.out.println("\nAdding a new book to the omnibus:");
                addBook();
            } else if (answer.equals("n")) {
                // code to upload the new omnibus to the library system goes here
                System.out.println("\nNew omnibus added to library system:");
                omnibus.displayInfo();
                return;
            } else {
                System.out.println("Invalid input!");
            }
        }
    
    }

    public static void editComponent() {  
        // code to edit a book/omnibus goes here
        System.out.println("Service not yet implemented.");      
    }

    public static void removeComponent() {      
        // code to remove a book/omnibus goes here  
        System.out.println("Service not yet implemented.");    
    }   
}