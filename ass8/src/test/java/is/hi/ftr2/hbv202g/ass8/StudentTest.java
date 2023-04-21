package is.hi.ftr2.hbv202g.ass8;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIsFeePaid() {
        Student student1 = new Student("John Doe", true);
        assertTrue(student1.isFeePaid());

        Student student2 = new Student("Jane Doe", false);
        assertFalse(student2.isFeePaid());
    }

    @Test
    public void testSetFeePaid() {
        Student student = new Student("John Doe", false);
        assertFalse(student.isFeePaid());

        student.setFeePaid(true);
        assertTrue(student.isFeePaid());

        student.setFeePaid(false);
        assertFalse(student.isFeePaid());
    }
}
