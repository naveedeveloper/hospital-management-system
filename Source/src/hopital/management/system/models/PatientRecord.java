/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hopital.management.system.models;

import java.util.ArrayList;

/**
 *
 * @author tayyubnaveed
 */
public class PatientRecord {

    private int id;
    private String username;
    private String gender;
    private int age;

    private ArrayList<PatientCheckup> checkups;

    public ArrayList<PatientCheckup> getCheckups() {
        return checkups;
    }

    public void addCheckup(PatientCheckup patientCheckup) {
        this.checkups.add(patientCheckup);
    }

    public PatientRecord() {
        this.checkups = new ArrayList<PatientCheckup>();
    }

    public PatientRecord(final int id, final String username, final String gender, final int age) {
        this.setId(id);
        this.setUsername(username);
        this.setGender(gender);
        this.setAge(age);
        this.checkups = new ArrayList<PatientCheckup>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Id=%d, username=%s,gender=%s, age=%d", id, username, gender, age);
    }

}
