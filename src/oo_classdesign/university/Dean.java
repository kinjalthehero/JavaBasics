package oo_classdesign.university;

import java.util.List;

public class Dean extends Employee {

    String deanName;
    List<Faculty> faculties;

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }
}
