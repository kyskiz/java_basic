package com.gyk.java.oop.basics;

import java.util.Arrays;

public class Family {
    private Person[] persons;
    private Vehicle vehicle;
    private TravelDestination destination;

    public Family(Person[] persons, Vehicle vehicle, TravelDestination destination) {
        this.persons = persons;
        this.vehicle = vehicle;
        this.destination = destination;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TravelDestination getDestination() {
        return destination;
    }

    public void setDestination(TravelDestination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Family{" +
                "persons=" + Arrays.toString(persons) +
                ", vehicle=" + vehicle +
                ", destination=" + destination +
                '}';
    }
}
