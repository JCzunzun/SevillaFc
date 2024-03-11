package com.iesam.sevillaFc.features.games.data;

import com.iesam.sevillaFc.features.games.data.local.GameLocalDataSource;
import com.iesam.sevillaFc.features.games.domain.Game;
import com.iesam.sevillaFc.features.games.domain.GamesRepository;

public class GameDataRepository implements GamesRepository {
    private GameLocalDataSource gameLocalDataSource= new GameLocalDataSource();

    @Override
    public void saveGames(Game game) {
        gameLocalDataSource.saveGame(game);
    }

    @Override
    public Game getGame(String id) {
        return gameLocalDataSource.getGame(id);
    }
}
