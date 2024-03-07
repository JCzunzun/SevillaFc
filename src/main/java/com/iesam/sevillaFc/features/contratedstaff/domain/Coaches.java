package com.iesam.sevillaFc.features.contratedstaff.domain;

public class Coaches extends ContratedStaff{
    private final String strategy;

    public Coaches(String id, String name, String lastName, String birthDate, String strategy) {
        super(id, name, lastName, birthDate);
        this.strategy = strategy;
    }

    public String getStrategy() {
        return strategy;
    }
}
