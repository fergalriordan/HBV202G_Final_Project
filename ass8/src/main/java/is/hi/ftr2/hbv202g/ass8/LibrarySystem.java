package is.hi.ftr2.hbv202g.ass8;

import java.util.List;
import java.time.LocalDate;

public class LibrarySystem {
    private String title;
    private List<Author> authors;
    private String name; 
    private boolean feePaid;
    private String department;
    private User user;
    private Book book;
    private FacultyMember facultyMember;
    private LocalDate dueDate;

    public LibrarySystem() {
        this.title = "";
        this.authors = null;
        this.name = "";
        this.feePaid = false;
        this.department = "";
        this.user = null;
        this.book = null;
        this.facultyMember = null;
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
