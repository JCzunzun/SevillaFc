package com.iesam.sevillaFc.features.contratedstaff.data;

import com.iesam.sevillaFc.features.contratedstaff.data.local.StaffLocalDataSource;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.PlayerRepository;
import com.iesam.sevillaFc.features.contratedstaff.domain.player.Players;

import java.util.ArrayList;

public class PlayerDatarepository implements PlayerRepository{
    private StaffLocalDataSource staffLocalDataSource;
    private static PlayerDatarepository instanceStaff=null;
    public static PlayerDatarepository newStaffInstance(){
        if(instanceStaff == null){
            instanceStaff= new PlayerDatarepository();
        }
        return instanceStaff;
    }

    @Override
    public void savePlayer(Players players) {
        staffLocalDataSource.savePlayer(players);
    }

    @Override
    public Players getPlayer(String id) {

        return staffLocalDataSource.getPlayer(id);
    }

    @Override
    public ArrayList<Players> getPlayers() {
        return staffLocalDataSource.getPlayers();
    }
}
