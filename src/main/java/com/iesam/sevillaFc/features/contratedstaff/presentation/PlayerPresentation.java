package com.iesam.sevillaFc.features.contratedstaff.presentation;

import com.iesam.sevillaFc.features.contratedstaff.data.PlayerDatarepository;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.GetPlayerUseCase;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.GetPlayersUseCase;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.Players;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.SavePlayerUseCase;

import java.util.ArrayList;

public class PlayerPresentation {
    public static void savePlayer(Players players){
        SavePlayerUseCase savePlayerUseCase= new SavePlayerUseCase(new PlayerDatarepository());
        savePlayerUseCase.execute(players);
    }
    public static void getPlayer(String id){
        GetPlayerUseCase getPlayerUseCase= new GetPlayerUseCase(new PlayerDatarepository());
        Players players = getPlayerUseCase.execute(id);
    }
    public static void getPlayers(){
        GetPlayersUseCase getPlayersUseCase= new GetPlayersUseCase(new PlayerDatarepository());
        ArrayList<Players> players= getPlayersUseCase.execute();
        System.out.println(players.toString());
    }
}
