package com.iesam.sevillaFc.features.games.data;

import com.iesam.sevillaFc.features.games.domain.Game;
import com.iesam.sevillaFc.features.games.domain.GamesRepository;

public class GameDataRepository implements GamesRepository {
    private static GameDataRepository gameInstance=null;
    public static GamesRepository newGameInstance(){
        if (gameInstance==null){
            gameInstance= new GameDataRepository();
        }
        return gameInstance;
    }
    @Override
    public void saveGames(Game game) {

    }

    @Override
    public Game getGame(String id) {
        return null;
    }
}
