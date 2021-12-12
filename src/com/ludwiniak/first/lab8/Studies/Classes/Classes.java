package com.ludwiniak.first.lab8.Studies.Classes;

import com.ludwiniak.first.lab8.Studies.DidacticWorker;

public class Classes {
    private DidacticWorker leader;
    private String className;
    private int numberOfHours;
    private String classNumber;
    private String buildingNumber;

    public DidacticWorker getLeader() {
        return leader;
    }

    public void setLeader(DidacticWorker leader) {
        this.leader = leader;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Classes(String className, int numberOfHours, String classNumber, String buildingNumber, DidacticWorker didacticWorker) {
        this.className = className;
        this.numberOfHours = numberOfHours;
        this.classNumber = classNumber;
        this.buildingNumber = buildingNumber;
        this.leader = didacticWorker;
    }

    @Override
    public String toString() {
        return String.format("%15s | %3d | %6s | %6s | ", className, numberOfHours, buildingNumber, classNumber);
    }
}
