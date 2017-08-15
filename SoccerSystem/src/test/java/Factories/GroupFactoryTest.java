package Factories;

import Domain.Group;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class GroupFactoryTest {
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("groupId","A");
        values.put("teamName","Afghan FC");
        values.put("fkTeamId","001");

    }

    @Test
    public void testGetGroup() throws Exception {

        Group group = GroupFactory.getGroup(values, "001");
        assertEquals("A", group.getGroupId());
    }

}