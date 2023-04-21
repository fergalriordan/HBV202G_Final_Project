package is.hi.ftr2.hbv202g.ass8;

import java.util.*;
import java.time.LocalDate;

public class LibrarySystem {
    private List<User> users;
    private List<BookComponent> books;
    private List<Lending> lendings;

    public LibrarySystem() {
        this.users = new ArrayList<User>();
        this.books = new ArrayList<BookComponent>(); 
        this.lendings = new ArrayList<Lending>();
    }

    public void adminAddBook() {
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
            this.addBookWithTitleAndAuthorList(title, authors);
            System.out.println("\nBook added to library system.");
        } catch (EmptyAuthorListException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addBookWithTitleAndAuthorList (String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("'Authors' field cannot be empty");
        }
        Book book = new Book(title, authors);
        this.books.add(book);
    }

    public void addOmnibus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the omnibus to be added: ");
        String title = scanner.nextLine();

        BookComposite omnibus = new BookComposite(title);

        while (true) {
            System.out.print("Add a book to this omnibus? (y/n) ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("y")) {
                System.out.println("\nAdding a new book to the omnibus:");
                this.adminAddBook();
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

    public void editComponent() {  
        // code to edit a book/omnibus goes here
        System.out.println("Service not yet implemented.");      
    }

    public void removeComponent() {      
        // code to remove a book/omnibus goes here  
        System.out.println("Service not yet implemented.");    
    }  

    public void addStudentUser(String user, boolean feePaid){
        this.users.add(new Student(user, feePaid));
    }

    public void addFacultyMemberUser(String name, String department){
        this.users.add(new FacultyMember(name, department));
    }

    public BookComponent findBookByTitle(String title) throws UserOrBookDoesNotExistException {
        for (BookComponent component : this.books) {
            if (component.getTitle().equals(title)) {
                return component;
            }
        }
        throw new UserOrBookDoesNotExistException("Book with title '" + title + "' does not exist");
    }

    public User findUserByName(String name) throws UserOrBookDoesNotExistException {
        User found = null;
        for (User user : this.users) {
            if (user.getName().equals(name)) {
                found = user;
            }
        }
        if (found == null) {
            throw new UserOrBookDoesNotExistException("User with name '" + name + "' does not exist");
        }
        return found;
    }

    public void findUser() throws UserOrBookDoesNotExistException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        User result = findUserByName(username);
        }
    
    public Boolean checkFaculty(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user; 
        try {
            user = this.findUserByName(username);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } 
    
        Boolean validPassword = checkPassword(user, password);

        if (validPassword) {
            return true;
        }
        else return false;
    }

    public Boolean checkStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        User user; 
        try {
            user = this.findUserByName(username);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } 
    
        Boolean validPassword = checkPassword(user, password);
        // ALSO CHECK IF FEES HAVE BEEN PAID
        Boolean feePaid = true;

        if (validPassword && feePaid) {
            return true;
        }
        else return false;
    }

    public static Boolean checkPassword(User user, String password) {
        return true; // code to check the validity of the password would go here
    }

    public void borrowBook(User user, Book book) {
        System.out.println("Request approved.");	
        this.lendings.add(new Lending(book, user));
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
        // find the lending relating to the given faculty member and given book
        Lending foundLending = null;
        for (Lending lending : this.lendings) {
            if (lending.getUser().equals(facultyMember) && lending.getBook().equals(book)) {
                foundLending = lending;	
            }
        }
        if (foundLending != null){
            foundLending.setDueDate(newDueDate);
            System.out.println("Due date extended.");	
        }
        else 
            System.out.println("Lending not found.");
    }

    public void returnBook(User user, Book book) {
        // find the lending relating to the given user and given book 
        Lending foundLending = null;
        for (Lending lending : this.lendings) {
            if (lending.getUser().equals(user) && lending.getBook().equals(book)) {
                foundLending = lending;
            }
        }
        // remove the lending from the lendings list
        if (foundLending != null){
            this.lendings.remove(foundLending);
            System.out.println("Book returned.");	
        }
        else 
            System.out.println("Lending not found.");
    }
}
