package com.iesam.sevillaFc.features.contratedstaff.domain.player;

public class GetPlayerUseCase {
    private final PlayerRepository playerRepository;

    public GetPlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public Players execute(String id){
        return playerRepository.getPlayer(id);
    }
}
