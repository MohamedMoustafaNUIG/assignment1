package com.nuig.assignment1;

import java.util.ArrayList;

/**
 *
 * @author mohdm
 */
public class Module {
    private String module_name;
    private String id; 
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    public Module(String module_name, String id, ArrayList<Student> students, ArrayList<Course> courses){
        this.module_name = module_name;
        this.id = id;
        this.students = students; 
        this.courses = courses;
    }
    
    public Module(){}
    
    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}