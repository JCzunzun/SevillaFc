package com.iesam.sevillaFc.features.club.presentation;

import com.iesam.sevillaFc.features.club.data.ClubDataRepository;
import com.iesam.sevillaFc.features.club.domain.Club;
import com.iesam.sevillaFc.features.club.domain.GetClubUseCase;
import com.iesam.sevillaFc.features.club.domain.SaveClubUseCase;

public class ClubPresentation {
    public void saveClub(Club club){
        SaveClubUseCase saveClubUseCase= new SaveClubUseCase(new ClubDataRepository());
        saveClubUseCase.execute(club);

    }
    public void getClub(String id){
        GetClubUseCase getClubUseCase= new GetClubUseCase(new ClubDataRepository());
        Club club= getClubUseCase.execute(id);
        System.out.println(club.toString());
    }
}
