package Polymorphism.Bicycle;

public class Test {

    public static void main(String[] args) {

        // access to the superclass and subclass
        MountainBike subObj = new MountainBike(30, 18, 20);
        subObj.bicycleStatus(); // calls MountainBike methods

        // Access to the base class members
        System.out.println("Current speed: " + subObj.speed);
        System.out.println("Current gear: " + subObj.gear);

        // Access to the sub class members
        System.out.println("Current height: " + subObj.seatHeight);

        // Access to the base class method
        subObj.increaseSpeed(5);
        subObj.decrementSpeed(5);

        // Access to the sub class method
        subObj.increaseSeatHeight(5);
        subObj.decrementSeatHeight(5);

        subObj.bicycleStatus(); // calls MountainBike methods

        // Access to base class variable and methods
        // Access to ONLY overriding methods
        // No access to the sub class members and methods
        Bicycle baseObj = new MountainBike(20, 3, 15);
        baseObj.bicycleStatus(); // calls MountainBike method

        // Access to the base class members
        System.out.println("Current speed: " + baseObj.speed);
        System.out.println("Current gear: " + baseObj.gear);

        // NO ACCESS to the sub class members
        //System.out.println("Current height: " + baseObj.seatHeight);

        // THIS IS VERY IMPORTANT
        // Access to the base class method
        baseObj.increaseSpeed(5);
        baseObj.decrementSpeed(5);

        // THIS IS VERY IMPORTANT
        // NO ACCESS to the sub class method
        //baseObj.increaseSeatHeight(5);
        //baseObj.decrementSeatHeight(5);

        baseObj.bicycleStatus(); // calls MountainBike method

    }





}
