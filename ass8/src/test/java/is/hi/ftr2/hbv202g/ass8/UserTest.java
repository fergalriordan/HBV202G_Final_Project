package is.hi.ftr2.hbv202g.ass8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest {

    @Test
    public void testGetName() {
        User user = new User("John Doe");
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testSetName() {
        User user = new User("John Doe");
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }
}
