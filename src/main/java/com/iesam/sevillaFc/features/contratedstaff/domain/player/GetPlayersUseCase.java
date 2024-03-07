package com.iesam.sevillaFc.features.contratedstaff.domain.player;

import java.util.ArrayList;

public class GetPlayersUseCase {
    private final PlayerRepository playerRepository;

    public GetPlayersUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public ArrayList<Players> execute(){
        return playerRepository.getPlayers();
    }
}
