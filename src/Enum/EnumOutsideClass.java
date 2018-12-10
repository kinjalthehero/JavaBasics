/***
 * https://www.geeksforgeeks.org/enum-in-java/
 */

package Enum;

// enum is declared outside any class (Note enum keyword instead of class keyword)
enum Color
{
    RED, GREEN, BLUE;
}

public class EnumOutsideClass
{
    // Driver method
    public static void main(String[] args)
    {
        // DO NOT USE new keyword while creating an object
        // Also note the way object is defined. Format used for class is not used.
        // This is not used -> Color c1 = Color (RED)
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
