/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

public class InheritedClass extends InheritanceClass {

    int subclassvar3;

    public InheritedClass (int var1, int var2, int var3) {
        super(var1, var2);
        this.subclassvar3 = var3;
    }

    public void subClassMethod() {

        System.out.println("This is the method from subclass");
    }
}
