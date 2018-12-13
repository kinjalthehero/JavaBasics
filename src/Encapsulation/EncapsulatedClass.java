/***
 * https://www.geeksforgeeks.org/encapsulation-in-java/
 */

package Encapsulation;

public class EncapsulatedClass {

    private String name;
    private int age;

    // Getters for private variables
    public String getName() {
        return this.name;
    }

    // Getters for private variables
    public int getAge() {
        return this.age;
    }

    // Setters for private variable
    public void setName (String name) {
        this.name = name;
    }

    // Setters for private variable
    public void setAge (int age) {
        this.age = age;
    }

}
