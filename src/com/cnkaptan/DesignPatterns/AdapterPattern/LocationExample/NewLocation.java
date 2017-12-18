package com.cnkaptan.DesignPatterns.AdapterPattern.LocationExample;

public interface NewLocation {

    String getBuilding();

    void setBuilding(String building);

    int getFloor();

    void setFloor(int floor);

    int getDesk();

    void setDesk(int desk);
}