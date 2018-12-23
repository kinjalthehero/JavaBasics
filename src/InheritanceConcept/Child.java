/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

public class Child extends Parent {

    int subclassvar3;

    public Child(int var1, int var2, int var3) {
        // We don't need default constructor here because we are calling parameterized constructor using super keyword in subclass
        super(var1, var2);
        this.subclassvar3 = var3;
        System.out.println("Inside child class parameterized constructor");
    }

    public void privateMethod() {
        System.out.println("This is the private method from child class");
    }

    public void subClassMethod() {

        System.out.println("This is the method from child class");
    }
}
