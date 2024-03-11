package com.iesam.sevillaFc.features.games.presentation;

import com.iesam.sevillaFc.features.games.data.GameDataRepository;
import com.iesam.sevillaFc.features.games.domain.Game;
import com.iesam.sevillaFc.features.games.domain.GetGameUseCase;
import com.iesam.sevillaFc.features.games.domain.SaveGameUseCase;

public class GamePresentation {
    public static void saveGame(Game game){
        SaveGameUseCase saveGameUseCase= new SaveGameUseCase(new GameDataRepository());
        saveGameUseCase.execute(game);
    }
    public static void getGame(String id){
        GetGameUseCase getGameUseCase= new GetGameUseCase(new GameDataRepository());
        Game game= getGameUseCase.execute(id);
        System.out.println(game.toString());
    }
}
