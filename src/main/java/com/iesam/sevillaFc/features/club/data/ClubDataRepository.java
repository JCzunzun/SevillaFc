package com.iesam.sevillaFc.features.club.data;

import com.iesam.sevillaFc.features.club.data.local.ClubFileLocalDataSource;
import com.iesam.sevillaFc.features.club.domain.Club;
import com.iesam.sevillaFc.features.club.domain.ClubRepository;

public class ClubDataRepository implements ClubRepository {
    private ClubFileLocalDataSource clubFileLocalDataSource= new ClubFileLocalDataSource();
    @Override
    public void saveClub(Club club) {
        clubFileLocalDataSource.saveClub(club);
    }

    @Override
    public Club getClub(String id) {
        return clubFileLocalDataSource.getClub(id);
    }
}
