import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("John", "HW125323A", 30000);
    }

    @Test
    public void getName(){
        assertEquals("John", developer.getName());

    }

    @Test
    public void getNiNumber() {
        assertEquals("HW125323A", developer.getNiNumber());
    }

    @Test
    public void nameSalary() {
        assertEquals(30000, developer.getSalary());
    }

}
