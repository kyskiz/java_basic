package com.gyk.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear = 1;
    private int speed;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void changeGear(int gear) {

        if (gear == -1 || gear == 1) {
            if (this.getGear() + gear < 0) {
                System.out.println(
                        "Minimal available gear is 0"
                );
            } else if (this.getGear() + gear > 20) {
                System.out.println(
                        "Max available gear is 20"
                );
            } else {
                this.setGear(this.getGear() + gear);
                System.out.println(
                        String.format(
                                "Changing gear.. Current gear is %d", this.getGear()
                        )
                );
            }

        } else {
            System.out.println("Cannot change gear to other values than -1 and 1");
        }

    }

    @Override
    public void speedUp(int increment) {

        if (increment < 0) {
            System.out.println(
                    "Speeding up value cannot be negative"
            );
        } else if (this.getSpeed() + increment > 100) {
            int maxIncrement = 100 - this.getSpeed();
            System.out.println(
                    String.format("Speed increment is too high. Highest possible increment is %d", maxIncrement)
            );
        } else {
            this.setSpeed(this.getSpeed() + increment);
            System.out.println(
                    String.format(
                            "Speeding up! Current speed %d", this.getSpeed()
                    )
            );
        }

    }

    @Override
    public void applyBrakes(int decrement) {

        if (decrement < 0) {
            System.out.println(
                    "Braking value cannot be negative"
            );
        } else if ((this.getSpeed() - decrement) < 10) {
            int maxDecrement = this.getSpeed() + 10;
            System.out.println(
                    String.format("Speed decrement is too high. Highest possible decrement is %d", maxDecrement)
            );
        } else {
            this.setSpeed(this.getSpeed() - decrement);
            System.out.println(
                    String.format(
                            "Braking.... Current speed %d", this.getSpeed()
                    )
            );
        }

    }
}
