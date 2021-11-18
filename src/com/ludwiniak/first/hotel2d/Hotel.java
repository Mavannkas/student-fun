package com.ludwiniak.first.hotel2d;

public class Hotel {
    private final Room[][] rooms;
    private final int[] roomAmount;

    public Hotel(int[] roomAmount) {
        this.roomAmount = roomAmount;
        rooms = new Room[roomAmount.length][];

        for(int i = 0; i < roomAmount.length; i++) {
            Room[] rooms = new Room[roomAmount[i]];

            for(int j = 0; j < roomAmount[i]; j++) {
                rooms[j] = new Room(100 * (i + 1) + (j + 1));
            }

            this.rooms[i] = rooms;


        }
    }

    public int howManyFreeRooms() {
        int counter = 0;

        for (Room[] IRooms : rooms) {
            for (Room room : IRooms) {
                if (room.isFree()) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public int findFreeRoom() {
        Room freeRoom = getFreeRoom();

        if(freeRoom != null) {
            return freeRoom.getNumber();
        }

        return -1;
    }

    private Room getFreeRoom() {
        for (Room[] IRooms : rooms) {
            for (Room room : IRooms) {
                if (room.isFree()) {
                    return room;
                }
            }
        }

        return null;
    }

    public int rentRoom(Person person) {
        Room freeRoom = getFreeRoom();

        if(freeRoom != null) {
            freeRoom.reserve(person);
            return freeRoom.getNumber();
        }

        return -1;
    }

    public boolean isRoomFree(int number) {
        int floor = number / 100 - 1;
        int roomNumber = number % 100 - 1;

        return rooms[floor][roomNumber].isFree();
    }

    public boolean findClient(Person client) {
        for (Room[] IRooms : rooms) {
            for (Room room : IRooms) {
                if (!room.isFree()) {
                    if(room.getClient().equals(client)) {
                       return true;
                    }
                }
            }
        }

        return false;
    }

    public void releaseRooms(Person client) {
        for (Room[] IRooms : rooms) {
            for (Room room : IRooms) {
                if (!room.isFree()) {
                    if(room.getClient().equals(client)) {
                        room.release();
                    }
                }
            }
        }
    }

    public void listFreeRooms() {
        for (Room[] IRooms : rooms) {
            for (Room room : IRooms) {
                if (room.isFree()) {
                    System.out.print(room.getNumber() + " ");
                }
            }
            System.out.println();
        }

    }

    public void printAllGuests() {
        for (Room[] IRooms : rooms) {
            for (Room room : IRooms) {
                if (!room.isFree()) {
                    System.out.println(room);
                }
            }
        }
    }
}
