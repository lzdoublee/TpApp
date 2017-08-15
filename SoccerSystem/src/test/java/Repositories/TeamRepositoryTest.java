package Repositories;

import Domain.Team;
import Factories.TeamFactory;
import Repositories.Impl.TeamRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamRepositoryTest {
    Map<String, String> values;
    TeamRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = TeamRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("teamId", "001");
        values.put("name", "Afghan FC");
        values.put("Manager", "Muluse");
        values.put("location", "Observatory");

    }

    @Test
    public void create() throws Exception {
        Team team = TeamFactory.getTeam(values, 23);
        repository.create(team);
        assertEquals(23, team.getPlayers());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Team readTeam = repository.read("001");
        assertEquals(23, readTeam.getPlayers());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Team team = repository.read("001");
        Team newTeam = new Team.Builder()
                .players(22)
                .manager(values.get("manager"))
                .name(values.get("name"))
                .location(values.get("location"))
                .build();

        repository.update(newTeam);
        Team updatedTeam = repository.read("001");
        assertEquals(22, updatedTeam.getPlayers());

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        Team team = repository.read("001");
        assertNull(team);
    }
}