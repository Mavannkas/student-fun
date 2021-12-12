package com.ludwiniak.first.lab8.Studies;

import com.ludwiniak.first.lab8.Studies.Classes.Classes;
import com.ludwiniak.first.lab8.Studies.Enums.ModeOfStudies;
import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Strategies.OperationalStrategy;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends Person implements OperationalStrategy, Serializable {
    private static final long serialVersionUID = 1L;
    private String fieldOfStudy;
    private int year;
    private ModeOfStudies modeOfStudies;
    private final ArrayList<Classes> classesArray = new ArrayList<>();
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ModeOfStudies getModeOfStudies() {
        return modeOfStudies;
    }

    public void setModeOfStudies(ModeOfStudies modeOfStudies) {
        this.modeOfStudies = modeOfStudies;
    }

    public void addClasses(Classes classes) {
        classesArray.add(classes);
    }

    public ArrayList<Classes> getClassesArray(ArrayList<Classes> classesArray) {
       return this.classesArray;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ModeOfStudies getFormOfStudies() {
        return modeOfStudies;
    }

    public void setFormOfStudies(ModeOfStudies formOfStudies) {
        this.modeOfStudies = formOfStudies;
    }

    public Student() {
        super();
    }

    public Student(String name, String surname, Gender gender, int age, String id, String fieldOfStudy, int year, ModeOfStudies modeOfStudies, int index) {
        super(name, surname, gender, age, id);
        this.fieldOfStudy = fieldOfStudy;
        this.year = year;
        this.modeOfStudies = modeOfStudies;
        this.index = index;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s | %4d | %10s | %10d", fieldOfStudy, year, modeOfStudies, index);
    }

    @Override
    public void getDataFromConsole() {
        super.getDataFromConsole();
        this.fieldOfStudy = ConsoleReader.getString("Podaj kierunek studiów");
        this.year = ConsoleReader.getInt("Podaj rok studiów");
        this.year = ConsoleReader.getInt("Podaj index");
        this.modeOfStudies = ConsoleReader.getMode();
    }

    @Override
    public void write() {

    }
}

