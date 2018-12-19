package Polymorphism.Bicycle;

public class Bicycle {

    int gear;
    int speed;

    Bicycle(int initialSpeed, int initialGear) {
        System.out.println("Inside Bicycle constructor");
        this.speed = initialSpeed;
        this.gear = initialGear;
    }

    void increaseSpeed (int speed) {
        this.speed += speed;
        System.out.println("Increased bicycle speed by " + speed + ". Now current speed is " + this.speed);
    }

    void decrementSpeed (int speed) {
        this.speed -= speed;
        System.out.println("Decreased bicycle speed by " + speed + ". Now current speed is " + this.speed);
    }

    void bicycleStatus () {
        System.out.println("Current speed is " + this.speed + " and gear is on " + this.gear);
    }

}
