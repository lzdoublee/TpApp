package Repositories;

import Domain.Player;
import Factories.PlayerFactory;
import Repositories.Impl.PlayerRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class PlayerRepositoryTest {

    Map<String, String> values;
    PlayerRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = PlayerRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("playerId", "214131815");
        values.put("nickname", "Lzee");
        values.put("firstname", "Lutho");
        values.put("lastname", "Sanda");
        values.put("residence", "Catsville");
        values.put("fkTeamId", "001");

    }

    @Test
    public void create() throws Exception {
        Player player = PlayerFactory.getPlayer(values, 23);
        repository.create(player);
        assertEquals(23, player.getAge());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Player readPlayer = repository.read("001");
        assertEquals(23, readPlayer.getAge());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Player player = repository.read("214131815");
        Player newPlayer = new Player.Builder()
                .age(22)
                .nickname(values.get("nickname"))
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .residence(values.get("residence"))
                .fkTeamId(values.get("fkTeamId"))
                .build();

        repository.update(newPlayer);
        Player updatedTeam = repository.read("001");
        assertEquals(22, updatedTeam.getAge());

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("001");
        Player player = repository.read("001");
        assertNull(player);
    }
}