package is.hi.ftr2.hbv202g.ass8;

import java.util.List;

public class Book implements BookComponent {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("'Authors' field cannot be empty");
        }
        this.title = title;
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("'Authors' field cannot be empty");
        }
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + "\n"+ "Author(s):" + authors);
    }
}
