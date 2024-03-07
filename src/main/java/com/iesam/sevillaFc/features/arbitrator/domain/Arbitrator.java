package com.iesam.sevillaFc.features.arbitrator.domain;

public class Arbitrator {
    private final String id;
    private final String name;
    private final String lastName;
    private final String birthDate;
    private final String category;

    public Arbitrator(String id, String name, String lastName, String birthDate, String category) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCategory() {
        return category;
    }
}
