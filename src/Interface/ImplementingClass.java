package Interface;

import com.sun.istack.internal.Pool;

public class ImplementingClass implements InterfaceClass {

    public void display() {
        System.out.println("In implementing class");
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.display();
    }

}
