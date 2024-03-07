package com.iesam.sevillaFc.features.club.domain;

public class GetClubUseCase {
    private final ClubRepository clubRepository;

    public GetClubUseCase(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    public Club execute(String id){
        return clubRepository.getClub(id);
    }
}
