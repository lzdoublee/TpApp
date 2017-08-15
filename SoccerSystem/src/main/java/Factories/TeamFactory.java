package Factories;

import Domain.Team;

import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamFactory {

    public static Team getTeam(Map<String, String> values, int players)
    {
        Team team = new Team.Builder()
                .players(players)
                .teamId(values.get("teamId"))
                .name(values.get("name"))
                .manager(values.get("Manager"))
                .location(values.get("location"))
                .build();
        return team;
    }
}
