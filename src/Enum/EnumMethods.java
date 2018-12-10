/***
 * https://www.geeksforgeeks.org/enum-in-java/
 */

package Enum;

public class EnumMethods {

    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {

        // Array of type color
        // values() return all values present inside enum.
        Color arr[] = Color.values();

        // enum with loop
        // Note the for loop. for (Type tempVariable: arrayVariable)
        for (Color col : arr) {
            // Calling ordinal() to find index of color.
            System.out.println(col + " has index " + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }

}
