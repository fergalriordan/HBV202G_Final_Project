package is.hi.ftr2.hbv202g.ass8;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class LendingTest {

    private Book book, book2;
    private User user;
    private ArrayList<Author> authors;

    @Before
    public void setUp() throws Exception {
        authors = new ArrayList<Author>();
        authors.add(new Author("Test Author"));
        book = new Book("Test Book", authors);
        book2 = new Book("Test Book 2", authors);
        user = new User("Test User");
    }

    @Test
    public void testGetDueDate() {
        Lending lending = new Lending(book, user);
        LocalDate dueDate = LocalDate.now().plusDays(30);
        assertEquals(dueDate, lending.getDueDate());
    }
    
    @Test
    public void testSetDueDate() {
        Lending lending = new Lending(book, user);
        LocalDate newDueDate = LocalDate.now().plusDays(60);
        lending.setDueDate(newDueDate);
        assertEquals(newDueDate, lending.getDueDate());
    }
    
    @Test
    public void testGetBook() {
        Lending lending = new Lending(book, user);
        assertEquals(book, lending.getBook());
    }
    
    @Test
    public void testSetBook() {
        Lending lending = new Lending(book, user);
        lending.setBook(book2);
        assertEquals(book2, lending.getBook());
    }
    
    @Test
    public void testGetUser() {
        Lending lending = new Lending(book, user);
        assertEquals(user, lending.getUser());
    }
    
    @Test
    public void testSetUser() {
        User user2 = new User("Test User 2");
        Lending lending = new Lending(book, user);
        lending.setUser(user2);
        assertEquals(user2, lending.getUser());
    }
}
