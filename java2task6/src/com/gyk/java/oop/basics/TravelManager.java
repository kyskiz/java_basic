package com.gyk.java.oop.basics;

public class TravelManager {

    public static void changeDestination(Family family, TravelDestination destination) {
        if (!family.getDestination().equals(destination)) {
            System.out.println(
                    String.format("Changing destination from %s to %s", family.getDestination().getName(), destination.getName())
            );
            family.setDestination(destination);
        } else {
            System.out.println("Trying to apply same destination " + destination.getName());
        }
    }

    public static void travel(Family family) {
        Double distance = family.getDestination().getDistance();
        Vehicle vehicle = family.getVehicle();
        Double availDistance = vehicle.getFuel() / vehicle.getConsumption() * 100;

        if (distance <= availDistance) {
            System.out.println(
                    String.format("Family was able to travel %s", family.getDestination().getName())
            );
        } else {
            Double distanceLeft = distance - availDistance;
            Double fuelNeeded = distanceLeft * vehicle.getConsumption() / 100;
            System.out.println(
                    String.format(
                            "For family to travel %s there must be additional %.2f liters of fuel in tank",
                            family.getDestination().getName(), fuelNeeded
                    )
            );
        }


    }

    public static void printFamilyMembers(Family family) {
        System.out.println("Family members: ");
        for (Person person: family.getPersons()) {
            System.out.println(person.toString());
        }

    }


}
