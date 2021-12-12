package com.ludwiniak.first.lab8.Studies;

import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Strategies.OperationalStrategy;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

import java.io.Serializable;

public class UniversityWorker extends Worker implements OperationalStrategy, Serializable {
    private static final long serialVersionUID = 2L;
    public String responsibilityArea;
    private String duty;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getResponsibilityArea() {
        return responsibilityArea;
    }

    public void setResponsibilityArea(String responsibilityArea) {
        this.responsibilityArea = responsibilityArea;
    }

    public UniversityWorker() {
    }

    public UniversityWorker(String name, String surname, Gender gender, int age, String id, int salary, int availableHours, int ageOfExperience, String responsibilityArea, String duty) {
        super(name, surname, gender, age, id, salary, availableHours, ageOfExperience);
        this.responsibilityArea = responsibilityArea;
        this.duty = duty;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s | %10s", responsibilityArea, duty);
    }


    @Override
    public void getDataFromConsole() {
        super.getDataFromConsole();
        this.responsibilityArea = ConsoleReader.getString("Podaj czym rządzi");
        this.duty = ConsoleReader.getString("Podaj stanowisko");
    }

    @Override
    public void write() {

    }



}
