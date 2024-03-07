package com.iesam.sevillaFc.features.club.domain;

public class SaveClubUseCase {
    private final ClubRepository clubRepository;

    public SaveClubUseCase(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    public void execute(Club club){
        clubRepository.saveClub(club);
    }
}
