package is.hi.ftr2.hbv202g.ass8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AuthorTest {

    @Test
    public void testGetName() {
        Author author = new Author("James Joyce");
        assertEquals("James Joyce", author.getName());
    }

    @Test
    public void testSetName() {
        Author author = new Author("James Joyce");
        author.setName("Oscar Wilde");
        assertEquals("Oscar Wilde", author.getName());
    }
}