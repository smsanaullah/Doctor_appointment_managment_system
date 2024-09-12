/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patientappointmentsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientAppointmentSystem {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int choice = 0;
        while (choice != 5) {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    viewDoctors();
                    break;
                case 3:
                    bookAppointment();
                    break;
                case 4:
                    viewAppointments();
                    break;
                case 5:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n*** Doctor's Appointment Management System Menu ***");
        System.out.println("1. Register Patient");
        System.out.println("2. View Doctors");
        System.out.println("3. Book Appointment");
        System.out.println("4. View Appointments");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void registerPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        int id = patients.size() + 1; // Simple ID assignment
        patients.add(new Patient(name, id));
        System.out.println("Patient registered successfully with ID: " + id);
    }

    private void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
        } else {
            System.out.println("Available Doctors:");
            for (Doctor doctor : doctors) {
                System.out.println(doctor.getId() + ": " + doctor.getName() + " - " + doctor.getSpecialization());
            }
        }
    }

    private void bookAppointment() {
        System.out.print("Enter patient ID: ");
        int patientId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter doctor ID: ");
        int doctorId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter date (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        int appointmentId = appointments.size() + 1;
        appointments.add(new Appointment(appointmentId, doctorId, patientId, date));
        System.out.println("Appointment booked successfully.");
    }

    private void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            System.out.println("Scheduled Appointments:");
            for (Appointment appointment : appointments) {
                System.out.println("Appointment ID: " + appointment.getAppointmentId() + ", Doctor ID: " + appointment.getDoctorId() + ", Patient ID: " + appointment.getPatientId() + ", Date: " + appointment.getDate());
            }
        }
    }

    public static void main(String[] args) {
        PatientAppointmentSystem system = new PatientAppointmentSystem();
        // Sample data to test the system
        system.doctors.add(new GeneralPractitioner("Dr. Alom", 1, "General Medicine"));
        system.doctors.add(new Specialist("Dr. Babu", 2, "Cardiology"));        
        system.doctors.add(new Specialist("Dr. Rony", 3, "Nurosurguon"));
        system.doctors.add(new Specialist("Dr. Nargis", 4, "Gynecologist"));

        system.start();
    }
}
