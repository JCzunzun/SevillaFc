package com.iesam.sevillaFc.features.games.domain;

public class GetGameUseCase {
    private final GamesRepository gamesRepository;

    public GetGameUseCase(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }
    public Game execute(String id){
        return gamesRepository.getGame(id);
    }
}
