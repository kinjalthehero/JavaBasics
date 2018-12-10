/*
 * https://www.geeksforgeeks.org/enum-customized-value-java/
 * Java program to demonstrate how values can be assigned to enums.
 * We have to create parameterized constructor for this enum class.
 * Why? Because as we know that enum class’s object can’t be create explicitly so for initializing we use parameterized constructor.
 * And the constructor cannot be the public or protected it must have private or default modifiers.
 * Why? if we create public or protected, it will allow initializing more than one objects.
 * This is totally against enum concept.
 */
package Enum;

public class EnumWithValues {

    enum TrafficSignal {
        /* This will call enum constructor with one String argument */
        GREEN("Go"), RED("Stop"), ORANGE("Slow Down");

        // declaring private variable for getting values
        private String action;

        // enum constructor - cannot be public or protected
        TrafficSignal(String action) {
            this.action = action;
        }
    }

    public static void main(String[] args) {

        TrafficSignal[] signal = TrafficSignal.values();

        for (TrafficSignal color : signal) {
            System.out.println(color + " means " + color.action);
        }
    }

}
