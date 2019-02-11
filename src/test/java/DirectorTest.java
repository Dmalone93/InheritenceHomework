import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Andrew", "JX111213B", 50000, "management", 100000.0);
    }

    @Test
    public void getName() {
        assertEquals("Andrew", director.getName());
    }

    @Test
    public void getNi() {
        assertEquals("JX111213B", director.getNiNumber());
    }

    @Test
    public void getSal() {
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void getDept() {
        assertEquals("management", director.getDeptName());
    }

    @Test
    public void doesHaveBudget() {
        assertEquals(100000.0, director.getBudget());
    }
}
