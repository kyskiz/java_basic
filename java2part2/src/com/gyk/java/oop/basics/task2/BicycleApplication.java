package com.gyk.java.oop.basics.task2;

public class BicycleApplication {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();

        mountainBike.speedUp(3);
        mountainBike.applyBrakes(15);

        roadBike.speedUp(5);
        roadBike.changeGear(0);
        roadBike.changeGear(-3);
        roadBike.applyBrakes(-10);
        roadBike.applyBrakes(1);
        roadBike.speedUp(6);

        System.out.println(Speedometer.chooseWinner(mountainBike, roadBike));
        System.out.println(Speedometer.chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()));

    }

}
