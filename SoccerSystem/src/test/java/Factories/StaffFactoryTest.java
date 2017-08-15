package Factories;

import Domain.Staff;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class StaffFactoryTest {
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("staffNo","1");
        values.put("role","Paramedic");
        values.put("firstname","John");
        values.put("lastname","Wick");
        values.put("fkTeamId","001");
    }

    @Test
    public void testGetStaff() throws Exception {
        Staff staff = StaffFactory.getStaff(values, 23);
        assertEquals("John", staff.getFirstname());
    }

}