package Projects.EmailApp;
import java.security.SecureRandom;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String emailAddres;
    private final String companyName = "akamai";
    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
    private static final SecureRandom RANDOM = new SecureRandom();

    Email (String fName, String lName, String department) {
        this.firstName = fName;
        this.lastName = lName;
        this.department = department;
        generateEmailAddress();
        assignRandomPassword();
    }

    public void assignRandomPassword() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < 8; i++)
            sb.append(ALPHABET.charAt(RANDOM.nextInt((ALPHABET.length()))));
        this.password = sb.toString();
    }

    public void setNewPassword(String newPassword) {
        this.password = newPassword;
    }

    private String generateEmailAddress() {
        this.emailAddres = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companyName.toLowerCase() + ".com";
        return this.emailAddres;
    }

    void getBasicInfo() {
        System.out.println("\nYour information: ");
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + this.emailAddres);
    }

}
