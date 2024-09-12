/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patientappointmentsystem;

public class Doctor {
    private String name;
    private int id;
    private String specialization;

    public Doctor(String name, int id, String specialization) {
        this.name = name;
        this.id = id;
        this.specialization = specialization;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public void displayAvailability() {
        System.out.println("General availability.");
    }
}
