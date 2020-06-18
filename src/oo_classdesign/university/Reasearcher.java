package oo_classdesign.university;

import java.util.List;

public class Reasearcher extends Faculty {

    Institute institute;
    FieldOfStudy fieldOfStudy;
    List<Project> involvedProjects;

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<Project> getInvolvedProjects() {
        return involvedProjects;
    }

    public void setInvolvedProjects(List<Project> involvedProjects) {
        this.involvedProjects = involvedProjects;
    }
}
