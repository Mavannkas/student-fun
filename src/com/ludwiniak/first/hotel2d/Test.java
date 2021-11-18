package com.ludwiniak.first.hotel2d;

public class Test {
    public void test() {
        int[] roomsAmount = new int[]{1, 2, 3};
        Hotel hotel = new Hotel(roomsAmount);
        Person adam = new Person("Adam", "Dyzma");
        Person mikolaj = new Person("Mikolaj", "Andrzejewski");
        hotel.listFreeRooms();
        hotel.rentRoom(adam);
        hotel.rentRoom(adam);
        hotel.rentRoom(adam);
        hotel.rentRoom(adam);
        hotel.rentRoom(mikolaj);
        hotel.rentRoom(mikolaj);
        System.out.println();
        System.out.println();
        hotel.listFreeRooms();
        System.out.println();
        System.out.println();
        hotel.printAllGuests();
        hotel.releaseRooms(adam);
        System.out.println();
        System.out.println();
        hotel.listFreeRooms();
        System.out.println();
        System.out.println();
        hotel.printAllGuests();
    }
}
