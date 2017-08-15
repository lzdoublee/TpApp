package Services;

import Domain.Player;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public interface PlayerService {

    Player create(Player player);

    Player read(String playerId);

    Player update(Player player);

    void delete(String playerId);
}
