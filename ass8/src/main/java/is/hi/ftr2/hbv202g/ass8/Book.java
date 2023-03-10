package is.hi.ftr2.hbv202g.ass8;

import java.util.*;

public class Book {
    private String title;
    public List<Author> authors;

    public Book(String title,  List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }
    
    public void addAuthor(Author author) {
        // insert code to add an author to the list here
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        try {
            if (authors == null) {
                throw new EmptyAuthorListException("Authors cannot be null");
            }
            else this.authors = authors;
        } catch (EmptyAuthorListException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
