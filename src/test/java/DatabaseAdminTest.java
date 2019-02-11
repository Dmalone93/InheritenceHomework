
import org.junit.Before;
import org.junit.Test;
import Staff.TechStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("John", "HW125323A", 30000);
    }

    @Test
    public void getName(){
        assertEquals("John", databaseAdmin.getName());

    }

    @Test
    public void getNiNumber() {
        assertEquals("HW125323A", databaseAdmin.getNiNumber());
    }

    @Test
    public void nameSalary() {
        assertEquals(30000, databaseAdmin.getSalary());
    }

}
