package com.ludwiniak.first;

public class Date {
    private final int[] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this(29, 10, 2021);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showData() {
        System.out.println(String.format("%d.%d.%d", day, month, year));
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if(isLeapYear(year) && month == 2) {
            return year >= 0 && day >= 0 && day <= 29;
        }
        return year >= 0 && month >= 0 && month <= 12 && day >= 0 && day <= dayInMonth[month - 1];
    }

    public int getMonthLength(int month) {
        return dayInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 100 != 0 && year % 4 == 0) || year % 400 == 0;
    }

    public int getDayInYearNumber() {
        int result = 0;
        if(isLeapYear(year) && month >= 2) {
            result++;
        }

        for(int i = 0; i < month - 1; i++) {
            result += dayInMonth[month - 1];
        }

        return result;
    }

    public static int compareDate(Date dateA, Date dateB) {
        if(dateA.getDay() == dateB.getDay() && dateA.getMonth() == dateB.getMonth() && dateA.getYear() == dateB.getYear()) {
            return 0;
        }

        if(dateA.getYear() == dateB.getYear() && dateA.getMonth() == dateB.getMonth() && dateA.getDay() < dateB.getDay()) {
            return -1;
        }

        if(dateA.getYear() == dateB.getYear() && dateA.getMonth() < dateB.getMonth()) {
            return -1;
        }

        if(dateA.getYear() < dateB.getYear()) {
            return -1;
        }

        return 1;
    }
}
