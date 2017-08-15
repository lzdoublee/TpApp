package Repositories;

import Domain.Player;
import Domain.Staff;
import Factories.PlayerFactory;
import Factories.StaffFactory;
import Repositories.Impl.StaffRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class StaffRepositoryTest {

    Map<String, String> values;
    StaffRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = StaffRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("staffNo", "1");
        values.put("role", "paramedic");
        values.put("firstname", "JOhn");
        values.put("lastname", "wick");
        values.put("fkTeamId", "001");

    }

    @Test
    public void create() throws Exception {
        Staff staff = StaffFactory.getStaff(values, 28);
        repository.create(staff);
        assertEquals(28, staff.getAge());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Staff readStaff = repository.read("1");
        assertEquals(28, readStaff.getAge());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Staff staff = repository.read("1");
        Staff newStaff = new Staff.Builder()
                .role(values.get("role"))
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .fkTeamId(values.get("fkTeamId"))
                .age(28)
                .build();

        repository.update(newStaff);
        Staff updatedStaff = repository.read("1");
        assertEquals(28, updatedStaff.getAge());

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        repository.delete("1");
        Staff staff = repository.read("1");
        assertNull(staff);
    }
}