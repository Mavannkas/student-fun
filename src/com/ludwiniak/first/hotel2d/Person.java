package com.ludwiniak.first.hotel2d;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name) {
        this(name, "Zenon");
    }

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

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if(!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        return person.toString().equals(toString());
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
