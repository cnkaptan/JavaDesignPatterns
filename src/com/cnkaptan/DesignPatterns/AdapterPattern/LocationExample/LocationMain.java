package com.cnkaptan.DesignPatterns.AdapterPattern.LocationExample;

public class LocationMain {
    public static void main(String[] args) {
        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("Town Hall");
        oldLocation.setFloor(3);
        oldLocation.setDesk(14);

        NewLocation newLocation = new Adapter(oldLocation);

        String locationInfo = new StringBuilder()
                .append(newLocation.getBuilding())
                .append(", floor ")
                .append(newLocation.getFloor())
                .append(", desk ")
                .append(newLocation.getDesk())
                .toString();
        System.out.println(locationInfo);
    }
}
