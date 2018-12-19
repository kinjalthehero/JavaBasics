package Polymorphism.Bicycle;

public class Test {

    public static void main(String[] args) {

        // It will have access both parts(methods and variables) of the object defined by the superclass or subclass
        MountainBike subObj = new MountainBike(30, 18, 20);
        subObj.bicycleStatus();

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

        subObj.bicycleStatus();


        // Only overriding methods are accessible through sub class object
        // Sub class object will also have access to the base class methods
        // Sub class object with base class type will not have access to the sub class members and methods
        // we will have access only to methods and variables of the object defined by the superclass
        Bicycle baseObj = new MountainBike(20, 3, 15);

        baseObj.bicycleStatus();

        // Access to the base class members
        System.out.println("Current speed: " + baseObj.speed);
        System.out.println("Current gear: " + baseObj.gear);

        // Access to the sub class members
        //System.out.println("Current height: " + baseObj.seatHeight);

        // THIS IS VERY IMPORTANT
        // Access to the base class method
        baseObj.increaseSpeed(5);
        baseObj.decrementSpeed(5);

        // THIS IS VERY IMPORTANT
        // Access to the sub class method
        //baseObj.increaseSeatHeight(5);
        //baseObj.decrementSeatHeight(5);

        baseObj.bicycleStatus();

    }





}
