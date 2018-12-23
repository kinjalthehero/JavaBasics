package PrivateMethodsInInheritance;

public class Child extends Parent {

    public void privateMethod() {
        System.out.println("Inside child's private method");
    }

    public static void main(String[] args) {

        Parent newObj = new Child();
        // Compile time error
        // privateMethod has private access in parent class
        //newObj.privateMethod();

        // Following code will work fine because we are making Child class's obj
        // This object has access to its private method privateMethod
        Child obj = new Child();
        obj.privateMethod();
    }
}
