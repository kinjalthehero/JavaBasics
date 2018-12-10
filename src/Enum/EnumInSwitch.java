/***
 * https://www.geeksforgeeks.org/enum-in-java/
 */

package Enum;

public class EnumInSwitch {

    // enum is similar to class so should start with a capital letter
    // Do not use parenthesis '' for constants
    // After all constant declarations, please use semi-colon
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    // Declared a variable without its definition
    Day particularDay;

    // Constructor
    public EnumInSwitch (Day day) {
        this.particularDay = day;
    }

    public void dayIsLike () {

        // Don't forget to type break after every switch statement
        // Otherwise it will print all statements
        switch (particularDay) {

            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case SATURDAY:
                System.out.println("Party day");
                break;
            case SUNDAY:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Midweek is so-so");
                break;
        }
    }

    public static void main (String[] args) {

        // DIFFICULT: Note how value of a day enum is passed
        EnumInSwitch newObject = new EnumInSwitch(Day.valueOf("MONDAY"));
        newObject.dayIsLike();

        // DIFFICULT: Note how value of a day enum is passed
        newObject = new EnumInSwitch(Day.valueOf("SUNDAY"));
        newObject.dayIsLike();

        // DIFFICULT: Note how value of a day enum is passed
        newObject = new EnumInSwitch(Day.valueOf("WEDNESDAY"));
        newObject.dayIsLike();

        // DIFFICULT: Note how value of a day enum is passed
        newObject = new EnumInSwitch(Day.valueOf("SATURDAY"));
        newObject.dayIsLike();
    }
}
