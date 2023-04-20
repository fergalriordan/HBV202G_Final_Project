package is.hi.ftr2.hbv202g.ass8;

import java.util.List;
import java.util.ArrayList;

public class Omnibus {
    private String title;
    private List<Book> books;

    // creates an empty omnibus with a given title
    public Omnibus(String title){
        this.title = title;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) throws EmptyBookListException {
        if (books.size() == 0) {
            throw new EmptyBookListException("Book list cannot be null");
        }
        this.books = books;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
