package com.ludwiniak.first.lab8.Studies;

import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Strategies.OperationalStrategy;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements OperationalStrategy , Serializable {
    private static final long serialVersionUID = 4L;
    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person() {

    }

    public Person(String name, String surname, Gender gender, int age, String id) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%5s | %10s | %10s | %6s | %3d | ", id, name, surname, gender, age);
    }

    @Override
    public void getDataFromConsole() {
        this.name = ConsoleReader.getString("Podaj imie");
        this.surname = ConsoleReader.getString("Podaj nazwisko");
        this.gender = ConsoleReader.getGender();
        this.age = ConsoleReader.getInt("Podaj wiek");
        this.id = ConsoleReader.getString("Podaj identyfikator");
    }


    @Override
    public void write() {

    }
}
