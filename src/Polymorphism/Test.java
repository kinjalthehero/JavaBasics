package Polymorphism;

public class Test extends A {

    String checking;

    public void method (String[] args) {

        // Created the object of class B with type of class A
        checking =  "abc";
        A obj = new B();
        obj.method(checking);
    }

    public static void main (String[] args) {

        // Created the object of class B with type of class A
        A obj = new B();
        obj.method("Kinjal");
    }
}


