package PrivateMethodsInInheritance;

public class Parent {

    // Private method can not be overridden
    // They can be declared in the subclass but won't be called through polymorphism
    public void privateMethod() {
        System.out.println("Inside parent's private method");
    }

}
