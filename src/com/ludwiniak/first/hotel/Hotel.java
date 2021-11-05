package com.ludwiniak.first.hotel;

import java.util.Objects;

public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public boolean whetherAnyRoomIsFree() {
        for(Room room : rooms) {
            if(room.isFree()) {
                return true;
            }
        }
        return false;
    }

    public void reserveRoom(int roomNumber, Person newLocator) {
        rooms[roomNumber - 1].reserve(newLocator);
    }

    public void releaseRoom(int roomNumber) {
        rooms[roomNumber - 1].release();
    }

    public int countFreeRoms() {
        int counter = 0;
        for(Room room : rooms) {
            if(room.isFree()) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isTenantTakesRoom(String surname) {
        for(Room room : rooms) {
            if(!room.isFree() && room.getTenant().surname == surname) {
                return true;
            }
        }
        return false;
    }

    public void clearAllRoomsByTenantName(String surname) {
        for(Room room : rooms) {
            if(!room.isFree() && Objects.equals(room.getTenant().surname, surname)) {
                room.release();
            }
        }
    }
}
