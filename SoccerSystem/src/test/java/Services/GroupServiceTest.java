package Services;

import Domain.Group;
import Factories.GroupFactory;
import Services.Impl.GroupServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class GroupServiceTest {
    Map<String, String> values;
    GroupService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new GroupServiceImpl();
        values = new HashMap<String, String>();
        values = new HashMap<String, String>();
        values.put("teamName", "Afghan FC");
        values.put("fkTeamId", "001");
        values.put("groupId", "A");

    }

    @Test
    public void testCreate() throws Exception {

        Group group = GroupFactory.getGroup(values, "001");
        service.create(group);
        assertEquals("A", group.getGroupId());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Group readGroup = service.read("001");
        assertEquals("A", readGroup.getGroupId());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Group group = service.read("001");
        Group newGroup = new Group.Builder()
                .groupId("B")
                .teamName(values.get("teamName"))
                .fkTeamId(values.get("fkTeamId"))
                .build();

        service.update(newGroup);
        Group updatedGroup= service.read("B");
        assertEquals("B",updatedGroup.getGroupId());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("B");
        Group group = service.read("B");
        assertNull(group);
    }
}