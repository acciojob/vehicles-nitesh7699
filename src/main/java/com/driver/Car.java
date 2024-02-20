package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public void increaseGear(int rate){
        int speed = super.increaseSpeed(rate);
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        if(speed>=1 && speed<=50){
            this.changeGear(1);
        }
        else if(speed>=51 && speed<=100){
            this.changeGear(2);
        }
        else if(speed>=101 && speed<=150){
            this.changeGear(3);
        }
        else if(speed>=151 && speed<=200){
            this.changeGear(4);
        }
        else if(speed>=201 && speed<=250){
            this.changeGear(5);
        }
        else{
            this.changeGear(6);
        }

    }
}
