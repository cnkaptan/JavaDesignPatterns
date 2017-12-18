package com.cnkaptan.DesignPatterns.AdapterPattern.LocationExample;

public class Adapter implements NewLocation {
    final OldLocation oldLocation;
    String building;
    int floor;
    int desk;

    // Wrap in old interface
    public Adapter(OldLocation oldLocation) {
        this.oldLocation = oldLocation;
        setBuilding(this.oldLocation.getBuilding());
        setDesk(this.oldLocation.getDesk());
        setFloor(this.oldLocation.getFloor());
    }

    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public int getDesk() {
        return desk;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }
}
