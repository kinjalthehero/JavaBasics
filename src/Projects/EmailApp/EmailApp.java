package Projects.EmailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        // Ask for firstname
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        // Ask for lastname
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        // Ask for department selection
        System.out.println("Enter your department: ");
        String department = scan.next();

        Email newEmail = new Email(firstName, lastName, department);
        System.out.println("Do you want to set new password?: \nPress 0 for No\n11Press 1 for Yes");
        int newPasswordSetup = scan.nextInt();
        if (newPasswordSetup == 0)
            newEmail.getBasicInfo();
        else {
            System.out.println("Enter the new password: ");
            String newPassword1 = scan.next();
            System.out.println("Enter the new password again: ");
            String newPassword2 = scan.next();
            if (newPassword1.equals(newPassword2)) {
                newEmail.setNewPassword(newPassword1);
                System.out.println("New password has been set");
            } else
                System.out.println("Passwords don't match!");
            newEmail.getBasicInfo();
        }
        scan.close();
    }
}
