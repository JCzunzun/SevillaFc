package com.iesam.sevillaFc.features.games.domain;

public interface GamesRepository {
    void saveGames(Game game);
    Game getGame(String id);
}
