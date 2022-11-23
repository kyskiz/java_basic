package com.gyk.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {
        Family family1 = new Family(
                new Person[]{
                        new Person(
                                "Arnoldas",
                                "Pavarde",
                                PersonGender.MALE,
                                30
                                ),

                        new Person(
                                "Viktorija",
                                "Pavarde",
                                PersonGender.FEMALE,
                                28
                        ),
                },
                new Vehicle("Turbo", "Opel", 20, 7.5),
                new TravelDestination("Vln-Kns", "Vilnius", 100.)
        );

        TravelManager.printFamilyMembers(family1);

        TravelManager.changeDestination(family1, new TravelDestination("Vln-Plng", "Palanga", 330.));
        TravelManager.changeDestination(family1, family1.getDestination());

        TravelManager.travel(family1);

        Family family2 = new Family(
                new Person[]{
                        new Person(
                                "Petras",
                                "Kita pavarde",
                                PersonGender.MALE,
                                45
                        ),

                        new Person(
                                "Natalija",
                                "Kita pavarde",
                                PersonGender.FEMALE,
                                42
                        ),
                },
                new Vehicle("Raudona", "Audi", 40, 10),
                new TravelDestination("Vln-Drskn", "Druskininkai", 170.)
        );


        TravelManager.printFamilyMembers(family2);
        TravelManager.travel(family2);

    }

}
