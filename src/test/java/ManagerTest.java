import Staff.Employee;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {


    Employee employee;
    Manager manager;
    @Before
    public void setUp(){
        employee = new Manager("Declan","JX112425B", 24000, "Games");
    }

    @Test
    public void getName(){
        assertEquals("Declan", employee.getName());

    }

    @Test
    public void getNiNumber() {
        assertEquals("JX112425B", employee.getNiNumber());
    }

    @Test
    public void nameSalary() {
        assertEquals(24000, employee.getSalary());
    }

    @Test
    public void nameDeptNames() {
        manager = new Manager("Declan","JX112425B", 24000, "Games");
        assertEquals("Games", manager.getDeptName());
    }

    @Test
    public void testSalary(){
        assertEquals(36000.0, employee.raiseSalary(1.5));
    }

    @Test
    public void testBonus(){
        assertEquals(24240, employee.payBonus());
    }
}

