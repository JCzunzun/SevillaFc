package com.iesam.sevillaFc;

import com.iesam.sevillaFc.features.club.presentation.ClubPresentation;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.Players;
import com.iesam.sevillaFc.features.contratedstaff.presentation.PlayerPresentation;
import com.iesam.sevillaFc.features.games.presentation.GamePresentation;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GamePresentation gamePresentation= new GamePresentation();
        PlayerPresentation playerPresentation= new PlayerPresentation();
        ClubPresentation clubPresentation= new ClubPresentation();
        //Crear `players
        Players players1= new Players("1","camilo","zuniga","01-03-1999","defense");
        Players players2= new Players("2","juan","zuniga","01-03-1999","defense");
        playerPresentation.savePlayer(players1);
        playerPresentation.savePlayer(players2);

    }
}