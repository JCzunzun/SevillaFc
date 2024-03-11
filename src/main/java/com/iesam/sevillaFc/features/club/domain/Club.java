package com.iesam.sevillaFc.features.club.domain;

import com.iesam.sevillaFc.features.contratedstaff.domain.player.Players;

import java.util.ArrayList;

public class Club {
    private final String id;
    private final String name;
    private final String category;
    private final ArrayList <Players> players;

    public Club(String id, String name, String category, ArrayList <Players> players) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.players = players;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", players=" + players +
                '}';
    }
}
