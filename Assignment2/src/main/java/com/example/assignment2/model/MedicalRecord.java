package com.example.assignment2.model;

import java.util.List;

public class MedicalRecord {
    private List<String> medications;
    private List<String> allergies;

    // Constructors
    public MedicalRecord() {}

    public MedicalRecord(List<String> medications, List<String> allergies) {
        this.medications = medications;
        this.allergies = allergies;
    }

    // Getters and Setters
    public List<String> getMedications() { return medications; }
    public void setMedications(List<String> medications) { this.medications = medications; }
    public List<String> getAllergies() { return allergies; }
    public void setAllergies(List<String> allergies) { this.allergies = allergies; }
}
