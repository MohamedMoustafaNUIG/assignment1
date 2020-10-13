package com.nuig.assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author mohdm
 */
public class Course {
    private String course_name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime start_date;
    private DateTime end_date; 
    
    public Course(String course_name, ArrayList<Module> modules, ArrayList<Student> students, DateTime start_date, DateTime end_date){
        this.course_name = course_name;
        this.modules = modules;
        this.students = students;
        this.start_date = start_date;
        this.end_date = end_date;
    }
    public Course(){}
    
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(DateTime start_date) {
        this.start_date = start_date;
    }

    public DateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(DateTime end_date) {
        this.end_date = end_date;
    }
}