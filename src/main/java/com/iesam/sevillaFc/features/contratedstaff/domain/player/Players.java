package com.iesam.sevillaFc.features.contratedstaff.domain.player;

import com.iesam.sevillaFc.features.contratedstaff.domain.ContratedStaff;

public class Players extends ContratedStaff {
    private final String demarcation;

    public Players(String id, String name, String lastName, String birthDate, String demarcation) {
        super(id, name, lastName, birthDate);
        this.demarcation = demarcation;
    }

    public String getDemarcation() {
        return demarcation;
    }
}
