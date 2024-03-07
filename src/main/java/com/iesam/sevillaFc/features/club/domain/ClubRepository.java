package com.iesam.sevillaFc.features.club.domain;

public interface ClubRepository {
    void saveClub(Club club);
    Club getClub(String id);
}
