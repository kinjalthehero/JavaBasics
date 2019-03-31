/***
 * Create an Student enrollment application
 */


package Projects.EmailApp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Scanner scan;
        String department = "default";

        System.out.println("Welcome to Student registration system");

        while(true) {
            // Ask for firstname
            scan = new Scanner(System.in);

            System.out.println("Type 1 to add new student information");
            System.out.println("Type 0 to exit");
            String selection = scan.nextLine();
            if (selection.equals("1")) {

                System.out.println("Enter your first name: ");
                String firstName = scan.nextLine();

                // Ask for lastname
                System.out.println("Enter your last name: ");
                String lastName = scan.nextLine();

                // Ask for department selection
                System.out.println("Enter your address: ");
                String address = scan.nextLine();

                while(true) {
                    // Ask for department selection
                    System.out.println("Select your department: ");
                    System.out.println("1 for Computer Science, 2 for Electrical Engineering or 3 for Human Resource");
                    String choice = scan.nextLine();

                    if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                        switch (choice) {

                            case "1":
                                department = "cs";
                                break;
                            case "2":
                                department = "ee";
                                break;
                            case "3":
                                department = "hr";
                                break;
                        }
                    } else {
                        System.out.println("You have entered incorrect department selection");
                        continue;
                    }

                    break;
                 }

                Student student1 = new Student(firstName, lastName, address, department);
                students.add(student1);

                System.out.println("Your account has been set with following information");
                student1.getBasicInfo();
                System.out.println();
                System.out.println("By default your password has been setup to: " + student1.getPassword());
                System.out.println("Do you want to changed the password? (Yes/No):");
                String changePassword = scan.nextLine();
                changePassword = changePassword.toLowerCase();


                // String comparison should be with equals and not with ==
                if (changePassword.equals("yes") || changePassword.equals("y")) {
                    System.out.println("Enter new password: ");
                    String newPassword = scan.nextLine();
                    student1.setNewPassword(newPassword);
                    System.out.println("New password has been set to: " + student1.getPassword());
                    System.out.println();
                } else {
                    System.out.println("Thank you for setting the student information!");
                    System.out.println();
                }
            } else
                break;
        }

        Iterator<Student> itr = students.iterator();
        while(itr.hasNext()){
            itr.next().getBasicInfo();
        }

        scan.close();
    }
}
