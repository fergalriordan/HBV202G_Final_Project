package is.hi.ftr2.hbv202g.ass8;

import java.util.List;
import java.time.LocalDate;

public class LibrarySystem {
    private List<User> users;
    private List<Book> books;
    private List<Lending> lendings;
    
    private String title;
    private List<Author> authors;
    private String name; 
    private boolean feePaid;
    private String department;
    private LocalDate dueDate;

    public LibrarySystem() {
        this.users = new ArrayList<>(); // wrong
        this.books = new ArrayList<>(); // wrong
        this.lendings = new ArrayList<>(); // wrong
        this.title = "";
        this.authors = new ArrayList<>(); // wrong
        this.name = "";
        this.feePaid = false;
        this.department = "";
        this.dueDate = null;
    }

    public void addBookWithTitleAndAuthorList (String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("'Authors' field cannot be empty");
        }
        this.title = title;
        this.authors = authors;
    }
}
