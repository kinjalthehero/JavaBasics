/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

public class InheritedClass extends InheritanceClass {

    int subclassvar3;

    public InheritedClass (int var1, int var2, int var3) {
        // We don't need default constructor here because we are calling parameterized constructor using super keyword in subclass
        super(var1, var2);
        this.subclassvar3 = var3;
        System.out.println("Inside sub class");
    }

    public void subClassMethod() {

        System.out.println("This is the method from subclass");
    }
}
