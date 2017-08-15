package Factories;

import Domain.Player;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by L.z Double E on 8/15/2017.
 */
public class PlayerFactoryTest {
    Map<String,String> values;

    @BeforeMethod
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("playerId","1");
        values.put("nickname","lzee");
        values.put("firstname","Lutho");
        values.put("lastname","Sanda");
        values.put("residence","Catsville");
        values.put("fkTeamId","001");
    }

    @Test
    public void testGetTeam() throws Exception {
        Player player = PlayerFactory.getPlayer(values, 22);
        assertEquals("Lutho", player.getFirstname());
    }

}