package Factories;

import Domain.Player;

import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class PlayerFactory {


    public static Player getPlayer(Map<String, String> values, int age)
    {
        Player player = new Player.Builder()
                .age(age)
                .playerId(values.get("playerId"))
                .nickname(values.get("nickname"))
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .lastname(values.get("lastname"))
                .residence(values.get("residence"))
                .fkTeamId(values.get("fkTeamId"))
                .build();
        return player;
    }
}
