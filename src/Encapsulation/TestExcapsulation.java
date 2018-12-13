/***
 * https://www.geeksforgeeks.org/encapsulation-in-java/
 */

package Encapsulation;

public class TestExcapsulation {

    public static void main(String[] args) {
        EncapsulatedClass encapsulatedObj = new EncapsulatedClass();
        encapsulatedObj.setAge(30);
        encapsulatedObj.setName("Kinjal");
        System.out.println("My age is " + encapsulatedObj.getAge());
        System.out.println("My name is " + encapsulatedObj.getName());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Direct age access : " + encapsulatedObj.age);
    }



}
