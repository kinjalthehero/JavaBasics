package Projects.EmailApp;
import java.security.SecureRandom;

public class Email {

    private String password;
    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
    private static final SecureRandom RANDOM = new SecureRandom();

    private String domainName = "northeaster.edu";

    public String getDomainName() {
        return domainName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    private String emailAddress;

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String generateEmail(String firstName, String lastName, String department) {
        emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + domainName;
        assignRandomPassword();
        return emailAddress;
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
}
