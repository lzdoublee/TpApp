package Repositories.Impl;

import Domain.Team;
import Repositories.TeamRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamRepositoryImpl implements TeamRepository {

    private static TeamRepositoryImpl repository = null;

    private Map<String, Team> teamTable;

    private TeamRepositoryImpl()
    {
        teamTable = new HashMap<String, Team>();
    }

    public static TeamRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new TeamRepositoryImpl();
        return repository;
    }

    public Team create(Team team)
    {
        teamTable.put(team.getTeamId(), team);
        Team savedTeam = teamTable.get(team.getTeamId());

        return savedTeam;
    }

    public Team read(String teamId)
    {
        Team team = teamTable.get(teamId);

        return team;
    }

    public Team update(Team team)
    {
        teamTable.put(team.getTeamId(), team);
        Team savedTeam = teamTable.get(team.getTeamId());

        return savedTeam;
    }

    public void delete(String teamId)
    {
        teamTable.remove(teamId);
    }

}
