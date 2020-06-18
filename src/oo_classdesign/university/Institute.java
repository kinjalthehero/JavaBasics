package oo_classdesign.university;

import java.util.List;

public class Institute {

    String name;
    String address;
    List<Employee> faculties;
    int numberOfEmployees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

