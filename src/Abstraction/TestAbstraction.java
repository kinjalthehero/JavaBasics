package Abstraction;

public class TestAbstraction {

    public static void main(String[] args) {
        AbstractClass obj = new SubClassOfAbstract();
        System.out.println(obj.getArea( 20,10));
    }

}
