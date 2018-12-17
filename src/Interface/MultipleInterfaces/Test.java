package Interface.MultipleInterfaces;

// Implementing Interface 2 which extends interface1
public class Test implements Interface2, Interface3 {

    @Override
    public void method1() {
        System.out.println("Implementing method of Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Implementing method of Interface2");
    }

    @Override
    public void method3() {
        System.out.println("Implementing method of Interface3");
    }

    public static void main(String[] args) {    
        Test obj = new Test();
        obj.method1();
        obj.method2();
        obj.method3();
    }

}
