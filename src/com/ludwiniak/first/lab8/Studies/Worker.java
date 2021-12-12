package com.ludwiniak.first.lab8.Studies;

import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Strategies.OperationalStrategy;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

public abstract class Worker extends Person implements OperationalStrategy {
    private int salary;
    private int availableHours;

    private int ageOfExperience;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAvailableHours() {
        return availableHours;
    }

    public void setAvailableHours(int availableHours) {
        this.availableHours = availableHours;
    }



    public int getAgeOfExperience() {
        return ageOfExperience;
    }

    public void setAgeOfExperience(int ageOfExperience) {
        this.ageOfExperience = ageOfExperience;
    }

    public Worker() {
        super();
    }

    public Worker(String name, String surname, Gender gender, int age, String id, int salary, int availableHours, int ageOfExperience) {
        super(name, surname, gender, age, id);
        this.salary = salary;
        this.availableHours = availableHours;
        this.ageOfExperience = ageOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%4d | %4d | %10s | ", salary, availableHours, ageOfExperience);
    }


    @Override
    public void getDataFromConsole() {
        super.getDataFromConsole();
        this.availableHours = ConsoleReader.getInt("Podaj ilość godzin pracy w miesiącu");
        this.ageOfExperience = ConsoleReader.getInt("Podaj lata doświadczenia");
        this.salary = ConsoleReader.getInt("Podaj wypłatę");
    }

    @Override
    public void write() {

    }

}
