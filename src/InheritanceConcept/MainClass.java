/***
 * https://www.geeksforgeeks.org/inheritance-in-java/
 */

package InheritanceConcept;

public class MainClass {

    public static void main(String[] args) {

        InheritedClass inheritedObj = new InheritedClass(1,2,3);
        inheritedObj.subClassMethod();
        inheritedObj.methodFromSuperClass();
        System.out.println("Subclass has access to its variable values " + inheritedObj.subclassvar3);
        System.out.println("Subclass has access to super class variable values " + inheritedObj.superClassvar1 + " and " + inheritedObj.superClassvar2);
    }

}
