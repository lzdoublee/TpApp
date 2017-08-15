package Services.Impl;

import Domain.Player;
import Repositories.Impl.PlayerRepositoryImpl;
import Repositories.PlayerRepository;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class PlayerServiceImpl {

    private static PlayerServiceImpl service = null;

    PlayerRepository repository = PlayerRepositoryImpl.getInstance();

    public static PlayerServiceImpl getInstance()
    {
        if (service == null)
            service = new PlayerServiceImpl();
        return service;
    }

    public Player create(Player player)
    {
        return repository.create(player);
    }

    public Player read(String playerId)
    {
        return repository.read(playerId);
    }

    public Player update(Player player)
    {
        return repository.update(player);
    }

    public void delete(String playerId)
    {
        repository.delete(playerId);
    }

}
