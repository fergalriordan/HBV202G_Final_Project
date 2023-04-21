package is.hi.ftr2.hbv202g.ass8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;
    private Author author1;
    private Author author2;
    private List<Author> authors;

    @Before
    public void setUp() {
        author1 = new Author("James Joyce");
        author2 = new Author("Oscar Wilde");
        authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        try {
            book = new Book("Dubliners", authors);
        } catch (EmptyAuthorListException e) {
            fail("Failed to create book with non-empty author list");
        }
    }

    @Test
    public void testGetTitle() {
        assertEquals("Dubliners", book.getTitle());
    }

    @Test
    public void testSetTitle() {
        book.setTitle("Finnegan's Wake");
        assertEquals("Finnegan's Wake", book.getTitle());
    }

    @Test
    public void testGetAuthors() {
        List<Author> bookAuthors = book.getAuthors();
        assertTrue(bookAuthors.contains(author1));
        assertTrue(bookAuthors.contains(author2));
    }

    @Test
    public void testSetAuthors() {
        Author author3 = new Author("Samuel Beckett");
        List<Author> newAuthors = new ArrayList<>();
        newAuthors.add(author3);
        try {
            book.setAuthors(newAuthors);
        } catch (EmptyAuthorListException e) {
            fail("Failed to set non-empty author list");
        }
        List<Author> bookAuthors = book.getAuthors();
        assertTrue(bookAuthors.contains(author3));
        assertEquals(1, bookAuthors.size());
    }

    @Test
    public void testSetAuthorsEmptyList() {
        List<Author> newAuthors = new ArrayList<>();
        try {
            book.setAuthors(newAuthors);
            fail("Allowed setting empty author list");
        } catch (EmptyAuthorListException e) {
            assertEquals("'Authors' field cannot be empty", e.getMessage());
        }
    }

    @Test
    public void testAddAuthor() {
        Author author3 = new Author("Bram Stoker");
        book.addAuthor(author3);
        List<Author> bookAuthors = book.getAuthors();
        assertTrue(bookAuthors.contains(author1));
        assertTrue(bookAuthors.contains(author2));
        assertTrue(bookAuthors.contains(author3));
        assertEquals(3, bookAuthors.size());
    }

    @Test
    public void testDisplayInfo() {
        book.displayInfo(); // Just checking that it runs without errors
    }

}
