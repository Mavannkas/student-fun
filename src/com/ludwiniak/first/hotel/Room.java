package com.ludwiniak.first.hotel;

public class Room {
    private final int number;
    private Person tenant;

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Person getTenant() {
        return tenant;
    }

    public boolean isFree() {
        return tenant == null;
    }

    public void reserve(Person person) {
        tenant = person;
    }

    public void release() {
        tenant = null;
    }

}
