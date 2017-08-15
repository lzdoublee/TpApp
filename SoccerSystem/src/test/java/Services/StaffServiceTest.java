package Services;

import Domain.Staff;
import Factories.StaffFactory;
import Services.Impl.StaffServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class StaffServiceTest {
    Map<String, String> values;
    StaffService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new StaffServiceImpl();
        values = new HashMap<String, String>();
        values.put("staffNo", "1");
        values.put("role", "paramedic");
        values.put("firstname", "JOhn");
        values.put("lastname", "wick");
        values.put("fkTeamId", "001");

    }

    @Test
    public void testCreate() throws Exception {
        Staff staff = StaffFactory.getStaff(values, 28);
        service.create(staff);
        assertEquals(28, staff.getAge());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Staff readStaff = service.read("1");
        assertEquals(28, readStaff.getAge());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Staff staff = service.read("1");
        Staff newStaff = new Staff.Builder()
                .role(values.get("role"))
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .fkTeamId(values.get("fkTeamId"))
                .age(29)
                .build();
        service.update(newStaff);
        Staff updatedStaff = service.read("1");
        assertEquals(29,updatedStaff.getAge());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("1");
        Staff staff = service.read("1");
        assertNull(staff);
    }
}