package com.iesam.sevillaFc.features.contratedstaff.domain;

public class Medical extends ContratedStaff{
    private final String speciality;

    public Medical(String id, String name, String lastName, String birthDate, String speciality) {
        super(id, name, lastName, birthDate);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
