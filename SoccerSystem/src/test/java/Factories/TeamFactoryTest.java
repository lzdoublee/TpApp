package Factories;

import Domain.Team;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamFactoryTest {

    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("teamId","001");
        values.put("name","Afghan FC");
        values.put("Manager","Muluse");
        values.put("location","Observatory");
    }
    @Test
    public void testGetTeam() throws Exception {

        Team team = TeamFactory.getTeam(values, 23);
        assertEquals("Afghan FC", team.getName());
    }

}