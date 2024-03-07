package com.iesam.sevillaFc.features.games.domain;

public class SaveGameUseCase {
    private final GamesRepository gamesRepository;

    public SaveGameUseCase(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }
    public void execute(Game game){
        gamesRepository.saveGames(game);
    }
}
