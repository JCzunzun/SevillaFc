package com.iesam.sevillaFc.features.games.domain;

import com.iesam.sevillaFc.features.arbitrator.domain.Arbitrator;
import com.iesam.sevillaFc.features.club.domain.Club;

public class Game {
    private final String id;
    private final Club localClub;
    private final Club awayClub;
    private final String result;
    private final Arbitrator arbitrator;
    private final String gameDate;

    public Game(String id, Club localClub, Club awayClub, String result, Arbitrator arbitrator, String gameDate) {
        this.id = id;
        this.localClub = localClub;
        this.awayClub = awayClub;
        this.result = result;
        this.arbitrator = arbitrator;
        this.gameDate = gameDate;
    }

    public String getId() {
        return id;
    }

    public Club getLocalClub() {
        return localClub;
    }

    public Club getAwayClub() {
        return awayClub;
    }

    public String getResult() {
        return result;
    }

    public Arbitrator getArbitrator() {
        return arbitrator;
    }

    public String getGameDate() {
        return gameDate;
    }
}
