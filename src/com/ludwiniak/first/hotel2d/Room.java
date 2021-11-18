package com.ludwiniak.first.hotel2d;

public class Room {
    private int number;
    private Person client;

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getClient() {
        return client;
    }

    public void reserve(Person client) {
        this.client = client;
    }

    public boolean isFree() {
        return client == null;
    }

    public void release() {
        client = null;
    }

    @Override
    public String toString() {
        return String.format("%s %s", client.toString(), number);
    }

}
