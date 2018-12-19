package Polymorphism.Bicycle;

public class MountainBike extends Bicycle {

    int seatHeight;

    MountainBike(int initialSpeed, int initialGear, int seatHeight) {
        super(initialSpeed, initialGear);
        this.seatHeight = seatHeight;
        System.out.println("Inside Mountain bike constructor");
    }

    void increaseSeatHeight (int seatHeight) {
        this.seatHeight += seatHeight;
        System.out.println("Increased muntain bike height by " + seatHeight + ". Now current speed is " + this.seatHeight);
    }

    void decrementSeatHeight(int seatHeight) {
        this.seatHeight -= seatHeight;
        System.out.println("Decreased muntain bike height by " + seatHeight + ". Now current speed is " + this.seatHeight);
    }

    void bicycleStatus () {
        System.out.println("Current speed is " + this.speed + " and gear is on " + this.gear + ". Seat height is " + this.seatHeight);
    }
}
