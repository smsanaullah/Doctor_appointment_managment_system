/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patientappointmentsystem;

public class Appointment {
    private int appointmentId;
    private int doctorId;
    private int patientId;
    private String date;

    public Appointment(int appointmentId, int doctorId, int patientId, String date) {
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
    }

    public int getAppointmentId() { return appointmentId; }
    public int getDoctorId() { return doctorId; }
    public int getPatientId() { return patientId; }
    public String getDate() { return date; }
}
