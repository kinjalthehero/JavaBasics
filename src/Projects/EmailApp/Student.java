package Projects.EmailApp;

public class Student {

    private String firstName;
    private String lastName;
    private String address;
    private String enrolledDepartment;
    private String email;
    Email studentEmail;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEnrolledDepartment() {
        return enrolledDepartment;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEnrolledDepartment(String enrolledDepartment) {
        this.enrolledDepartment = enrolledDepartment;
    }

    public Student(String firstName, String lastName, String address, String departmentName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.enrolledDepartment = departmentName;
        studentEmail = new Email();
        this.email = studentEmail.generateEmail(this.firstName, this.lastName, this.enrolledDepartment);

    }

    public String getPassword() {
        return studentEmail.getPassword();
    }

    public void setNewPassword(String newPassword) {
        studentEmail.setNewPassword(newPassword);
    }

    void getBasicInfo() {
        System.out.println("\nYour information: ");
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Department: " + this.enrolledDepartment);
        System.out.println("Password: " + this.getPassword());
    }

}
