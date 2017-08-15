package Services.Impl;

import Domain.Team;
import Repositories.Impl.TeamRepositoryImpl;
import Repositories.TeamRepository;
import Services.TeamService;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamServiceImpl implements TeamService {

    private static TeamServiceImpl service = null;

    TeamRepository repository = TeamRepositoryImpl.getInstance();

    public static TeamServiceImpl getInstance()
    {
        if (service == null)
            service = new TeamServiceImpl();
        return service;
    }

    public Team create(Team team)
    {
        return repository.create(team);
    }

    public Team read(String teamId)
    {
         return repository.read(teamId);
    }

    public Team update(Team team)
    {
        return repository.update(team);
    }

    public void delete(String teamId)
    {
        repository.delete(teamId);
    }

}
