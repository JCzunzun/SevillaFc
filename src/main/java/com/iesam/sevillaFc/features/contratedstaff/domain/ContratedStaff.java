package com.iesam.sevillaFc.features.contratedstaff.domain;

public class ContratedStaff {
    private final String id;
    private final String name;
    private final String lastName;
    private final String birthDate;

    public ContratedStaff(String id, String name, String lastName, String birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
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
}
