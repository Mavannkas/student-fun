package com.ludwiniak.first.lab8.Studies;

import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Strategies.OperationalStrategy;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

import java.io.Serializable;

public class DidacticWorker extends Worker implements OperationalStrategy, Serializable {
    private static final long serialVersionUID = 3L;
    private String academicTitle;
    private String specialization;
    private int achievements;

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAchievements() {
        return achievements;
    }

    public void setAchievements(int achievements) {
        this.achievements = achievements;
    }

    public DidacticWorker() {

    }

    public DidacticWorker(String name, String surname, Gender gender, int age, String id, int salary, int availableHours, int ageOfExperience, String academicTitle, String specialization, int achievements) {
        super(name, surname, gender, age, id, salary, availableHours, ageOfExperience);
        this.academicTitle = academicTitle;
        this.specialization = specialization;
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s | %10s | %10s", academicTitle, specialization, achievements);
    }


    @Override
    public void getDataFromConsole() {
        super.getDataFromConsole();
        this.academicTitle = ConsoleReader.getString("Podaj tytuł");
        this.specialization = ConsoleReader.getString("Podaj specjalizacje");
        this.achievements = ConsoleReader.getInt("Podaj dorobek naukowy");
    }

    @Override
    public void write() {

    }
}
