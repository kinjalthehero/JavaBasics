package oo_classdesign.university;

public abstract class Employee {

    private int ssn;
    private String name;
    private String emailAddress;
    private static int empIdCounter;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static int getEmpIdCounter() {
        return empIdCounter;
    }

    public static void setEmpIdCounter(int empIdCounter) {
        Employee.empIdCounter = empIdCounter;
    }
}
