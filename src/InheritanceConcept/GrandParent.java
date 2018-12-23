package InheritanceConcept;

public class GrandParent {

    GrandParent() {
        System.out.println("Inside grandparent default constructor");
    }

    GrandParent(int a) {
        System.out.println("Inside grandparent parameterized constructor");
    }

    public void privateMethod() {
        System.out.println("Inside grandparent private mathod");
    }
}
