/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

// Super class
public class InheritanceClass {

    int superClassvar1;
    int superClassvar2;

    public InheritanceClass() {

    }

    public InheritanceClass(int supervar1, int supervar2) {
        this.superClassvar1 = supervar1;
        this.superClassvar2 = supervar2;
    }

    public void methodFromSuperClass() {
        System.out.println("This is the method from the super class");
    }
}


