package Repositories.Impl;

import Domain.Player;
import Repositories.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class PlayerRepositoryImpl implements PlayerRepository{

    private static PlayerRepositoryImpl repository = null;

    private Map<String, Player> playerTable;

    private PlayerRepositoryImpl()
    {
        playerTable = new HashMap<String, Player>();
    }

    public static PlayerRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new PlayerRepositoryImpl();
        return repository;
    }

    public Player create(Player player)
    {
        playerTable.put(player.getPlayerId(), player);
        Player savedPlayer = playerTable.get(player.getPlayerId());

        return savedPlayer;
    }

    public Player read(String playerId)
    {
        Player player = playerTable.get(playerId);

        return player;
    }

    public Player update(Player player)
    {
        playerTable.put(player.getPlayerId(), player);
        Player savedPlayer = playerTable.get(player.getPlayerId());

        return savedPlayer;
    }

    public void delete(String playerId)
    {
        playerTable.remove(playerId);
    }

}
