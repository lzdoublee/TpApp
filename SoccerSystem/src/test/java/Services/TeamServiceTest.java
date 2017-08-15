package Services;

import Domain.Team;
import Factories.TeamFactory;
import Repositories.Impl.TeamRepositoryImpl;
import Services.Impl.TeamServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamServiceTest {

    Map<String, String> values;
    TeamService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new TeamServiceImpl();
        values = new HashMap<String, String>();
        values.put("teamId","001");
        values.put("name","Afghan FC");
        values.put("Manager","Muluse");
        values.put("location","Observatory");

    }

    @Test
    public void testCreate() throws Exception {
        Team team = TeamFactory.getTeam(values, 23);
        service.create(team);
        assertEquals(23, team.getPlayers());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Team readTeam = service.read("001");
        assertEquals(23, readTeam.getPlayers());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Team team = service.read("001");
        Team newTeam = new Team.Builder()
                .players(22)
                .name(values.get("name"))
                .location(values.get("location"))
                .manager(values.get("manager"))
                .build();
        service.update(newTeam);
        Team updatedTeam = service.read("001");
        assertEquals(22,updatedTeam.getPlayers());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("001");
        Team team = service.read("001");
        assertNull(team);
    }
}