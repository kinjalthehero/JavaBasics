/***
 * https://www.youtube.com/watch?v=HINmbq_CpVk
 */
package Composition;

public class Test {

    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.getEngine().setEngineType("V8");

        System.out.println(newCar);
        System.out.println(newCar.getEngine().getEngineType());

        // If car is destroyed then engine is also destroyed
        // You can not get engine separately
        // Composition association
        newCar = null;


        System.out.println(newCar.getEngine().getEngineType());
        System.out.println(newCar.getEngine());


    }


}
