package com.iesam.sevillaFc.features.club.data;

import com.iesam.sevillaFc.features.club.data.local.ClubFileLocalDataSource;
import com.iesam.sevillaFc.features.club.domain.Club;
import com.iesam.sevillaFc.features.club.domain.ClubRepository;

public class ClubDataRepository implements ClubRepository {
    private ClubFileLocalDataSource clubFileLocalDataSource;
    private static ClubDataRepository clubInstance=null;
    public ClubDataRepository newInstace(){
        if(clubInstance==null){
            clubInstance=new ClubDataRepository();
        }
        return clubInstance;
    }
    @Override
    public void saveClub(Club club) {
        clubFileLocalDataSource.saveClub(club);
    }

    @Override
    public Club getClub(String id) {
        return clubFileLocalDataSource.getClub(id);
    }
}
