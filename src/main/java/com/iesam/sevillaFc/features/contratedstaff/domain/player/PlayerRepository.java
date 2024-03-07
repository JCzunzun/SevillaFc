package com.iesam.sevillaFc.features.contratedstaff.domain.player;

import java.util.ArrayList;

public interface PlayerRepository {
    void savePlayer(Players players);
    Players getPlayer(String id);
    ArrayList<Players> getPlayers();
}
