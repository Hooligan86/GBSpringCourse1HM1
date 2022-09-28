package com.hooligan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("polyclinicBean")
public class Polyclinic {
    Patient patient;

    @Autowired
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }
}
