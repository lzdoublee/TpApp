package Repositories;

import Domain.Group;
import Factories.GroupFactory;
import Repositories.Impl.GroupRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class GroupRepositoryTest {

    Map<String, String> values;
    GroupRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = GroupRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("teamName", "Afghan FC");
        values.put("fkTeamId", "001");
        values.put("groupId", "A");

    }

    @Test
    public void create() throws Exception {
        Group group = GroupFactory.getGroup(values, "001");
        repository.create(group);
        assertEquals("A", group.getGroupId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Group readGroup = repository.read("A");
        assertEquals("A", readGroup.getGroupId());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Group group = repository.read("A");
        Group newGroup = new Group.Builder()
                .teamName(values.get("teamName"))
                .groupId(values.get("groupId"))
                .fkTeamId(values.get("fkTeamId"))
                .build();

        repository.update(newGroup);
        Group updatedGroup = repository.read("A");
        assertEquals("A", updatedGroup.getGroupId());

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        repository.delete("A");
        Group group = repository.read("A");
        assertNull(group);
    }
}