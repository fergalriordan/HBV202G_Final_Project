package is.hi.ftr2.hbv202g.ass8;

import java.util.*;
import java.time.LocalDate;

public class LibrarySystem {
    private List<User> users;
    private List<Book> books;
    private List<Lending> lendings;

    public LibrarySystem() {
        this.users = new ArrayList<User>();
        this.books = new ArrayList<Book>(); 
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

    public Book findBookByTitle(String title) throws UserOrBookDoesNotExistException {
        Book found = null;
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                found = book;
            }
        }
        if (found == null) {
            throw new UserOrBookDoesNotExistException("Book with title '" + title + "' does not exist");
        }
        return found;
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

    public void borrowBook(User user, Book book) {
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
        // update the due date of this lending to the new due date
        foundLending.setDueDate(newDueDate);
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
        this.lendings.remove(foundLending);
    }

}
