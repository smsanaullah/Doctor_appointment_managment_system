/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patientappointmentsystem;

public class Specialist extends Doctor {
    public Specialist(String name, int id, String specialization) {
        super(name, id, specialization);
    }

    @Override
    public void displayAvailability() {
        System.out.println("Appointment confirmation required.");
    }
}
