package Repositories;

import Domain.Team;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public interface TeamRepository {

    Team create(Team team);

    Team read(String teamId);

    Team update(Team team);

    void delete(String teamId);

}
