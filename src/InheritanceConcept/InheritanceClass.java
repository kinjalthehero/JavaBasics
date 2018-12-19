/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

// Super class
public class InheritanceClass extends GrandParentClass {

    int superClassvar1;
    int superClassvar2;

    // We don't need default constructor here because we are calling parameterized constructor using super keyword in subclass

    public InheritanceClass(int supervar1, int supervar2) {
        this.superClassvar1 = supervar1;
        this.superClassvar2 = supervar2;
        System.out.println("Inside base class");
    }

    public void methodFromSuperClass() {
        System.out.println("This is the method from the super class");
    }
}


