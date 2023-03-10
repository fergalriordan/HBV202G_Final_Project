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

    public void addBookWithTitleAndAuthorList (String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("'Authors' field cannot be empty");
        }
        Book book = new Book(title, authors);
        this.books.add(book);
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
