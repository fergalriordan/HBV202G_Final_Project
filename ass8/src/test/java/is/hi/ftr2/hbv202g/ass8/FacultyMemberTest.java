package is.hi.ftr2.hbv202g.ass8;

import org.junit.Test;
import static org.junit.Assert.*;

public class FacultyMemberTest {
    @Test
    public void testGetDepartment() {
        FacultyMember fm = new FacultyMember("John Doe", "Computer Science");
        assertEquals("Computer Science", fm.getDepartment());
    }

    @Test
    public void testSetDepartment() {
        FacultyMember fm = new FacultyMember("John Doe", "Computer Science");
        fm.setDepartment("Electrical Engineering");
        assertEquals("Electrical Engineering", fm.getDepartment());
    }
}
