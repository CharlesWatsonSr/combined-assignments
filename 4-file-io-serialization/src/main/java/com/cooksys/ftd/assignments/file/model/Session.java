package com.cooksys.ftd.assignments.file.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Session {
    private String location;
    private String startDate;
    private Instructor instructor;
    private List<Student> students;
    
    public String getLocation() {
        return this.location;
    }
    
    @XmlElement
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getStartDate() {
        return startDate;
    }

    @XmlElement
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public Instructor getInstructor() {
        return instructor;
    }
    
    @XmlElement
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    @XmlElement
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}