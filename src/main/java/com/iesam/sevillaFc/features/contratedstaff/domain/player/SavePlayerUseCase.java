package com.iesam.sevillaFc.features.contratedstaff.domain.player;

public class SavePlayerUseCase {
    private final PlayerRepository playerRepository;

    public SavePlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public void execute(Players players){
        playerRepository.savePlayer(players);
    }
}
