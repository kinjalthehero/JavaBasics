/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

public class MainClass {

    public static void main(String[] args) {

        Child inheritedObj = new Child(1,2,3);
        inheritedObj.subClassMethod();
        inheritedObj.methodFromParent();
        System.out.println("Subclass has access to its variable values " + inheritedObj.subclassvar3);
        System.out.println("Subclass has access to super class variable values " + inheritedObj.superClassvar1 + " and " + inheritedObj.superClassvar2);

        Parent obj = new Child(4,5,6);
        inheritedObj.privateMethod();
    }

}
