package Services;

import Domain.Team;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public interface TeamService {

    Team create(Team team);

    Team read(String teamId);

    Team update(Team team);

    void delete(String teamId);
}
